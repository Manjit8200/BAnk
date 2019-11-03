package com.rajat.bankdemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rajat.bankdemp.domain.UserEntity;
import com.rajat.bankdemp.service.UserService;

@RequestMapping(value="/auth")
@RestController
public class AuthenticationController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/register")
	public String register(@RequestBody UserEntity userEntity) {
		userService.addUser(userEntity);		
		return "sdsd";
	}
	
	@RequestMapping(value="/getUsers")
	public List<UserEntity> getAllUser(){		
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/authUser")
	public boolean authUser(@RequestBody UserEntity userEntity) {
		return userService.authUser(userEntity);
	}

}
