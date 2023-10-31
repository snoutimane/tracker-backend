package com.InterviewTracker.Tracker.controller;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InterviewTracker.Tracker.entity.Interview;
import com.InterviewTracker.Tracker.entity.InterviewEmailRequest;
import com.InterviewTracker.Tracker.entity.InterviewEmpIdRequest;
import com.InterviewTracker.Tracker.entity.InterviewEmployeeNameRequest;
import com.InterviewTracker.Tracker.entity.InterviewMentorNameRequest;
import com.InterviewTracker.Tracker.service.InterviewService;

@CrossOrigin(origins="http://localhost:4200")
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

    @PostMapping("/byEmpId")
    public ResponseEntity<?> findInterviewsByEmpId(@RequestBody InterviewEmpIdRequest request) {
        try {
            Integer empId = request.getEmpId();
            if (empId != null) {
                Optional<Interview> interviews = interviewService.findInterviewsByEmpId(empId);
                
                if (interviews.isEmpty()) {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No such interview");
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
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No such interview");
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
        List<Interview> interviews = interviewService.findInterviewsByMentorName(mentorName);
        return interviews;
    }
    
    

    @PostMapping("/byEmail")
    public ResponseEntity<?> findInterviewsByEmail(@RequestBody InterviewEmailRequest request) {
        try {
            String email = request.getEmail();
            if (email != null) {
                List<Interview> interviews = interviewService.findInterviewsByEmail(email);
                
                if (interviews.isEmpty()) {
               
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No such interview");
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

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<?> deleteInterviewById(@PathVariable Integer empId) {
        try {
            interviewService.deleteInterviewById(empId);
            return ResponseEntity.ok("Interview deleted successfully");
        } catch (Exception e) {
            // Handle all exceptions in a common way
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
        }
    }
    
//    @PutMapping("/update")
//    public ResponseEntity<List<Interview>> updateInterviewsByEmpId(@RequestBody List<Interview> updatedInterviews) {
//        List<Optional<Interview>> updatedInterviewList = interviewService.updateInterviews(updatedInterviews);
//
//        // Check if any interview was not found (Optional is empty)
//        if (updatedInterviewList.stream().anyMatch(Optional::isEmpty)) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        // Extract the interviews from the Optionals
//        List<Interview> resultInterviews = updatedInterviewList.stream()
//                .map(Optional::get)
//                .collect(Collectors.toList());
//
//        return new ResponseEntity<>(resultInterviews, HttpStatus.OK);
//    }


}

