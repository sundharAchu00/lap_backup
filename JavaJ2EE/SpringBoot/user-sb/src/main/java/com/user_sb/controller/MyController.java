package com.user_sb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user_sb.model.User;
import com.user_sb.repo.UserRepo;

@RestController
public class MyController {
	
	private final UserRepo userRepo;	
	
	public MyController(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}


	@GetMapping("demo")
	public String demo() {
		return "I'm working";
	}
	
	@GetMapping("users")
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	@PostMapping("user")
	public User addUser(@RequestBody User user) {		
		return userRepo.save(user);
	}


}
