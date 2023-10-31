package com.InterviewTracker.Tracker.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.InterviewTracker.Tracker.entity.Interview;

@Repository
public interface InterviewRepository extends  MongoRepository<Interview, Long> {
    // You can add custom query methods here if needed
	Optional<Interview> findByEmpId(Integer empId);
	List<Interview> findByEmployeeName(String employeeName);
	List<Interview> findByEmail(String email);
	List<Interview> findByMentorName(String mentorName);
	void deleteByEmpId(Integer empId);
}
