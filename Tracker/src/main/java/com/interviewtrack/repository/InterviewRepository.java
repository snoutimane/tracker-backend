package com.interviewtrack.repository;


import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.interviewtrack.entity.Interview;

@Repository
public interface InterviewRepository extends  MongoRepository<Interview, Long> {
    // You can add custom query methods here if needed
	List<Interview> findByEmpId(Integer empId);
	List<Interview> findByEmployeeName(String employeeName);
	List<Interview> findByEmail(String email);
	List<Interview> findByMentorName(String mentorName);
}
