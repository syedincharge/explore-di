package com.rizvi.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.rizvi.spring.controller.UserController;
import com.rizvi.spring.model.User;
import com.rizvi.spring.services.UserService;


@ExtendWith(MockitoExtension.class)
class ControllerTest {
	
	@InjectMocks
	UserController controller;
	@Mock
	UserService service;

	
	@Test
	void testCreateUser() {
		   //setup
		User user = new User();
		
		when(service.saveUser(user)).thenReturn(2);
		
		       // act
				int id = controller.createUser(user);
				assertEquals(2, id);
	
	}
	

	@Test
	void testCreateUserWithNullUser() {
		// setup
		User user = null;
		// act
		assertThrowsExactly(RuntimeException.class,
				
				() -> { controller.createUser(user);
    	});
	
	  }


   }
