package com.rajat.bankdemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.bankdemp.domain.UserAccountRegistrationEntity;
import com.rajat.bankdemp.service.UserAccountResgistrationService;

@RestController
@RequestMapping(value="/useraccountregister")
public class UserAccountRegistrationController {

	@Autowired
	private UserAccountResgistrationService userAccountResgistrationService;
	
	@RequestMapping(value="/userRegister")
	public boolean addUserAccountRegistration(@RequestBody UserAccountRegistrationEntity registrationEntity) {
//		System.out.println(registrationEntity);
		userAccountResgistrationService.userAccountRegister(registrationEntity);
		return false;
	}
	
	@RequestMapping(value="/getallregistereduser")
	public List<UserAccountRegistrationEntity> getAllRegisteredUser(){
		return userAccountResgistrationService.getUserAccount();
	}
	
	@RequestMapping(value="/delete-user")
	public boolean getRegisteredUser(@RequestParam("accountNumber") int accountNumber) {
//		userAccountResgistrationService.deleteUserAccount(accountNumber);
		if(userAccountResgistrationService.deleteUserAccount(accountNumber))
			return true;
		return false;
	}
	
	
}
