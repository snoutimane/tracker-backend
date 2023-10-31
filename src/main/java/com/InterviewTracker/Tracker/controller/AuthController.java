package com.InterviewTracker.Tracker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.userdetails.UserDetails;


import com.InterviewTracker.Tracker.entity.AdminModel;
import com.InterviewTracker.Tracker.entity.AuthenticationRequest;
import com.InterviewTracker.Tracker.entity.AuthenticationResponse;
import com.InterviewTracker.Tracker.repository.AdminRepository;
import com.InterviewTracker.Tracker.service.JwtUtil;
import com.InterviewTracker.Tracker.service.UserInfoService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;


@CrossOrigin(origins="")
@RestController
@RequestMapping("/admin")
public class AuthController {
	
	@Autowired
	AdminRepository adminrepo;
	
	@Autowired
	AuthenticationManager authenticationmanager;
	
	@Autowired
	UserInfoService userinfoservice;
	
	@Autowired
	JwtUtil jwtutil;
	
	 @Autowired
	 private PasswordEncoder passwordEncoder;
	
	
	//Adding Logger 
	Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	
    //Rest API to add/Register as Admin details
	@PostMapping("/register")
	private ResponseEntity<AuthenticationResponse> registerClientToken(@RequestBody AuthenticationRequest authrequest){

		AdminModel usermodel =new AdminModel();

		usermodel.setUsername(authrequest.getUsername());
		String encodedPassword = passwordEncoder.encode(authrequest.getPassword());
		
		usermodel.setPassword(encodedPassword);
		
		try {
			adminrepo.save(usermodel);
		}
		catch(Exception e){
			return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse
					("Registration Failed") , HttpStatus.OK);
		}
		
		//logger implementation
        logger.info("[register] info message added");
        logger.debug("[register] debug message added");
		
		return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse
				(authrequest.getUsername()+" registered Successfully "), HttpStatus.OK);
	}
	
	//Rest API to authenticate Admin details
	@PostMapping("/authenticate")
	private ResponseEntity<?> authenticateClientToken(@RequestBody AuthenticationRequest authrequest) throws Exception{

		try {
			authenticationmanager.authenticate(new UsernamePasswordAuthenticationToken(authrequest.getUsername(), authrequest.getPassword()));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return ResponseEntity.ok(new AuthenticationResponse("No"));
		}
		
		UserDetails userdetails= userinfoservice.loadUserByUsername(authrequest.getUsername());
		
		String jwt = jwtutil.generateToken(userdetails);
		
		//logger implementation
        logger.info("[authenticate] info message added");
        logger.debug("[authenticate] debug message added");
        
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}
	
	
	
	

	

}
