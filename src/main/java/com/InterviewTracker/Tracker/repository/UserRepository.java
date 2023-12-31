package com.InterviewTracker.Tracker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.InterviewTracker.Tracker.entity.UserModel;



@Repository
public interface UserRepository extends MongoRepository<UserModel, String>{

	UserModel findByusername(String username);

}