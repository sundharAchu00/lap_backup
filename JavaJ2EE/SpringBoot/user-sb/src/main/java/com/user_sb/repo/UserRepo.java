package com.user_sb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user_sb.model.User;

public interface UserRepo extends MongoRepository<User, String>{

}
