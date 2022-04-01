package com.rizvi.spring.services;

import com.rizvi.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rizvi.spring.model.User;


@Service
public class UserService {
	

	@Autowired
	UserRepository repository;
	
	
	public Integer saveUser(User user) {
		User savedUser = repository.save(user);
		return savedUser.getId();
	
	}

}
