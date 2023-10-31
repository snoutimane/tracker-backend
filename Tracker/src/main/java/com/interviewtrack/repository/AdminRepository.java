package com.interviewtrack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.interviewtrack.entity.AdminModel;

@Repository
public interface AdminRepository extends MongoRepository<AdminModel, String>{

	AdminModel findByusername(String username);

}
