package com.interviewtrack.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewtrack.entity.Interview;
import com.interviewtrack.entity.InterviewEmailRequest;
import com.interviewtrack.entity.InterviewEmpIdRequest;
import com.interviewtrack.entity.InterviewEmployeeNameRequest;
import com.interviewtrack.entity.InterviewMentorNameRequest;
import com.interviewtrack.service.InterviewService;

@CrossOrigin(origins="")
@RestController
@RequestMapping("/interviews")
public class TrackerController {

    private final InterviewService interviewService;

    @Autowired
    public TrackerController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }

    @GetMapping("/all")
    public List<Interview> getAllInterviews() {
        return interviewService.getAllInterviews();
    }
    
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to our application!";
    }
    String notfound = "no such interviews";

    @PostMapping("/byEmpId")
    public ResponseEntity<?> findInterviewsByEmpId(@RequestBody InterviewEmpIdRequest request) {
        try {
            Integer empId = request.getEmpId();
            if (empId != null) {
                List<Interview> interviews = interviewService.findInterviewsByEmpId(empId);
                
                if (interviews.isEmpty()) {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(notfound);
                } else {
                    return ResponseEntity.ok(interviews);
                }
            } else {
                return ResponseEntity.badRequest().body("empId is null");
            }
        } catch (Exception e) {
            // Handle any exceptions that may occur during the operation
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred.");
        }
    }

    @PostMapping("/byEmployeeName")
    public ResponseEntity<?> findInterviewsByEmployeeName(@RequestBody InterviewEmployeeNameRequest request) {
        try {
            String employeeName = request.getEmployeeName();
            if (employeeName != null) {
                List<Interview> interviews = interviewService.findInterviewsByEmployeeName(employeeName);
                
                if (interviews.isEmpty()) {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(notfound);
                } else {
                    return ResponseEntity.ok(interviews);
                }
          } 
          else{
             return ResponseEntity.badRequest().body("employeeName is null");
           }
        } catch (Exception e) {
           
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred.");
        }
    }

    @PostMapping("/byMentorName")
    public List<Interview> findInterviewsByMentorName(@RequestBody InterviewMentorNameRequest request) {
        String mentorName = request.getMentorName();
        return interviewService.findInterviewsByMentorName(mentorName);
    }
    
    

    @PostMapping("/byEmail")
    public ResponseEntity<?> findInterviewsByEmail(@RequestBody InterviewEmailRequest request) {
        try {
            String email = request.getEmail();
            if (email != null) {
                List<Interview> interviews = interviewService.findInterviewsByEmail(email);
                
                if (interviews.isEmpty()) {
               
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(notfound);
                } else {
                  
                    return ResponseEntity.ok(interviews);
                }
            } else {
                return ResponseEntity.badRequest().body(null);
            }
        } catch (Exception e) {
           
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
        }
    }



    @PostMapping("/create")
    public Interview createInterview(@RequestBody Interview interview) {
        return interviewService.createInterview(interview);
    }
    
    @PostMapping("/createall")
    public List<Interview> createInterviews(@RequestBody List<Interview> interviews) {
        // Delegate the creation to the service layer
        return interviewService.createInterviews(interviews);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteInterviewById(@PathVariable Long id) {
        try {
            interviewService.deleteInterviewById(id);
            return ResponseEntity.ok("Interview deleted successfully");
        } catch (Exception e) {
            // Handle all exceptions in a common way
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
        }
    }

}

