package com.InterviewTracker.Tracker.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InterviewTracker.Tracker.entity.Interview;
import com.InterviewTracker.Tracker.repository.InterviewRepository;

@Service
public class InterviewService {

    private final InterviewRepository interviewRepository;

    @Autowired
    public InterviewService(InterviewRepository interviewRepository) {
        this.interviewRepository = interviewRepository;
    }

    public List<Interview> getAllInterviews() {
        return interviewRepository.findAll();
    }


    public Optional<Interview> findInterviewsByEmpId(Integer empId) {
        return interviewRepository.findByEmpId(empId);
    }
    
    public List<Interview> findInterviewsByEmployeeName(String employeeName) {
        return interviewRepository.findByEmployeeName(employeeName);
    }
    
    public List<Interview> findInterviewsByEmail(String email) {
        return interviewRepository.findByEmail(email);
    }

    
    public Interview createInterview(Interview interview) {
        return interviewRepository.save(interview);
    }
    
    public List<Interview> createInterviews(List<Interview> interviews) {
        // Save all the interviews in the list and return the saved interviews
        return interviewRepository.saveAll(interviews);
    }

    public void deleteInterviewById(Integer empId) {
        interviewRepository.deleteByEmpId(empId);
    }
    
    public List<Interview> findInterviewsByMentorName(String mentorName) {
        return interviewRepository.findByMentorName(mentorName);
    }
    
//    public List<Optional<Interview>> updateInterviews(List<Interview> updatedInterviews) {
//        List<Optional<Interview>> updatedInterviewList = new ArrayList<>();
//
//        for (Interview updatedInterview : updatedInterviews) {
//            Optional<Interview> existingInterview = interviewRepository.findByEmpId(updatedInterview.getEmpId());
//
//            if (existingInterview.isPresent()) {
//                Interview interviewToUpdate = existingInterview.get();
//
//                // Update the fields you want to modify
//                interviewToUpdate.setEmployeeName(updatedInterview.getEmployeeName());
//                interviewToUpdate.setEmail(updatedInterview.getEmail());
//                interviewToUpdate.setProjectName(updatedInterview.getProjectName());
//                interviewToUpdate.setProjectCode(updatedInterview.getProjectCode());
//                interviewToUpdate.setProjectManager(updatedInterview.getProjectManager());
//                interviewToUpdate.setProjectLocation(updatedInterview.getProjectLocation());
//                interviewToUpdate.setInterviewed(updatedInterview.getInterviewed());
//                interviewToUpdate.setInterviewDate(updatedInterview.getInterviewDate());
//                interviewToUpdate.setFeedback(updatedInterview.getFeedback());
//                interviewToUpdate.setFeedbackDescription(updatedInterview.getFeedbackDescription());
//                interviewToUpdate.setComment(updatedInterview.getComment());
//                interviewToUpdate.setStatus(updatedInterview.getStatus());
//                interviewToUpdate.setProposedDate(updatedInterview.getProposedDate());
//                interviewToUpdate.setMentorName(updatedInterview.getMentorName());
//                interviewToUpdate.setImage(updatedInterview.getImage());
//                // ... update other fields as needed
//
//                // Save the updated interview and add it to the list
//                updatedInterviewList.add(Optional.of(interviewRepository.save(interviewToUpdate)));
//            } else {
//                updatedInterviewList.add(Optional.empty()); // Or throw an exception indicating that the interview was not found
//            }
//        }
//
//        return updatedInterviewList;
//    }
    
    
}
