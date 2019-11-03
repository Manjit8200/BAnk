package com.rajat.bankdemp.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajat.bankdemp.domain.AccountTypeEntity;
import com.rajat.bankdemp.repository.AccountTypeRepository;

@Transactional
@Service
public class AccountTypeService {
	
	@Autowired
	private AccountTypeRepository accountTypeRepository;
	
	public boolean addAccountType(AccountTypeEntity typeEntity) {
		accountTypeRepository.save(typeEntity);
		return false;
	}
	
	public List<AccountTypeEntity> getAccountList(){
		return accountTypeRepository.findAll();
	}

}
