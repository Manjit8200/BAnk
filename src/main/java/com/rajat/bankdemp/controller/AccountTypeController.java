package com.rajat.bankdemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.bankdemp.domain.AccountTypeEntity;
import com.rajat.bankdemp.service.AccountTypeService;

@RestController
@RequestMapping(value="/accounttype")
public class AccountTypeController {
	
	@Autowired
	private AccountTypeService accountTypeService;
	
	@RequestMapping(value="/addaccounttype")
	public boolean addAccountType(@RequestBody AccountTypeEntity accountTypeEntity)	{
		accountTypeService.addAccountType(accountTypeEntity);		
		return false;
	}
	
	@RequestMapping(value="/getaccounttype")
	public List<AccountTypeEntity> getAllAccountType(){
		return accountTypeService.getAccountList();
	}

}
