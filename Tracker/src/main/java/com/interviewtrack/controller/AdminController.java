package com.interviewtrack.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.interviewtrack.entity.AdminModel;
import com.interviewtrack.entity.UserModel;
import com.interviewtrack.exception.AdminServiceException;
import com.interviewtrack.repository.AdminRepository;
import com.interviewtrack.repository.UserRepository;
import com.interviewtrack.service.InterviewService;

@CrossOrigin(origins="")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	    @Autowired
	    private RestTemplate restTemplate;

		@Autowired
		private AdminRepository adminrepo;
		

		
		@Autowired
		private UserRepository userrepo;
		
		//Adding Logger 
		Logger logger = LoggerFactory.getLogger(AdminController.class);
		
//Admin-CRUD
		
		//Rest API to add Admin details
		@PostMapping("/registeradmin")
		public String addadmin(@RequestBody AdminModel admin) {
			adminrepo.save(admin);
			
			//logger implementation
	        logger.info("[registeradmin] info message added");
	        logger.warn("[registeradmin] warn message added");
	        logger.debug("registeradmin] debug message added");
	        logger.trace("[registeradmin] trace message added");
	        
			return "Admin with Id: "+admin.getId()+" have been Registered Successfully";
		}
		

		
		
		//Rest API to get Admin details by Id
		@GetMapping("/viewadminprofile/{id}")
		public Optional<AdminModel> getadmin(@PathVariable("id") String id){
			
			//logger implementation
	        logger.info("[viewadminprofile/id] info message added");
	        logger.debug("[viewadminprofile/id] debug message added");
        
			return adminrepo.findById(id);
		}
		
		//Rest API to update Admin details by Id
		@PutMapping("/updateprofile/{id}")
		public String updateadmin(@PathVariable("id") String id, @RequestBody AdminModel adminmodel) {
			adminrepo.save(adminmodel);
			
			//logger implementation
	        logger.info("[updateprofile/id] info message added");
	        logger.debug("[updateprofile/id] debug message added");
	        
			return "Admin with id "+id+" have been updated successfully";
		}
		
		
		//Rest API to delete Admin details by Id
		@DeleteMapping("/deleteadmin/{id}")
		public String deleteadmin(@PathVariable String id) {
			adminrepo.deleteById(id);
			
			//logger implementation
	        logger.info("[deleteadmin/id] info message added");
	        logger.debug("[deleteadmin/id] debug message added");
	        
			return "Admin with id "+id+" have been deleted";
		}
		
		
//Admin-User
		
	    //Rest API to get all User details 
		@GetMapping("/viewallusers")
		public List<UserModel>getallusers() {
			
			//logger implementation
	        logger.info("[viewallusers] info message added");
	        logger.debug("[viewallusers] debug message added");
	        
			return Arrays.asList(restTemplate.getForObject("http://UserDetails/user/viewallusers",UserModel[].class));
		}
		
		
		//Rest API to get User details by Id
		@GetMapping("/viewuser/{id}")
		public List<UserModel> getuser(@PathVariable("id") String id){
			
			//logger implementation
	        logger.info("[viewuser/id] info message added");
	        logger.debug("[viewuser/id] debug message added");
	        
			return Arrays.asList(restTemplate.getForObject("http://UserDetails/user/viewuser/"+id,UserModel[].class));	
		}
		
		
		//Rest API to update User details by Id
		@PutMapping("/updateuser/{id}")
		public String updateuser(@RequestBody UserModel usermodel, @PathVariable("id") String id) {
			this.restTemplate.put("http://UserDetails/user/updateprofile/{id}",id,usermodel);
			
			//logger implementation
	        logger.info("[viewallusers/id] info message added");
	        logger.debug("[viewallusers/id] debug message added");
	        
			return "User with id : "+id+" have been updated";
		}
		
	
		//Rest API to delete User details by Id
		@DeleteMapping("/deleteuser/{id}")
		public String deleteuser(@PathVariable String id) {
			this.restTemplate.delete("http://UserDetails/user/deleteprofile/{id}",id);
			
			//logger implementation
	        logger.info("[deleteuser/id] info message added");
	        logger.debug("[deleteuser/id] debug message added");
	        
			return "User with id :"+id+" have been deleted";
		}
		
		@Autowired
		private  InterviewService interviewService;


		
		// Exception handler for handling AdminServiceException
		@ExceptionHandler(AdminServiceException.class)
		public ResponseEntity<String> handleAdminServiceException(AdminServiceException ex) {
			logger.error("Admin Service Exception occurred: ", ex);
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		// Exception handler for handling generic exceptions
		@ExceptionHandler(Exception.class)
		public ResponseEntity<String> handleGenericException(Exception ex) {
			logger.error("An unexpected exception occurred: ", ex);
			return new ResponseEntity<>("An unexpected error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
}
