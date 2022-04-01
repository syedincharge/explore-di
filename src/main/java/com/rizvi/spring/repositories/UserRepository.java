package com.rizvi.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rizvi.spring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	

}
