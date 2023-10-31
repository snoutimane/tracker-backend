package com.interviewtrack.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewtrack.entity.Interview;
import com.interviewtrack.repository.InterviewRepository;

import java.util.List;


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


    public List<Interview> findInterviewsByEmpId(Integer empId) {
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

    public void deleteInterviewById(Long id) {
        interviewRepository.deleteById(id);
    }
    
    public List<Interview> findInterviewsByMentorName(String mentorName) {
        return interviewRepository.findByMentorName(mentorName);
    }
    
    
    
    
    
    
    
}
