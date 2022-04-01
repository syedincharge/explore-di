package com.rizvi.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rizvi.spring.model.User;
import com.rizvi.spring.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;


	@PostMapping
	public Integer createUser(@RequestBody User user) {
		if (user == null) {
			throw new RuntimeException();
		}
		return service.saveUser(user);
	}
}
