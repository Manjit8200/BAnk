package com.rajat.bankdemp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajat.bankdemp.domain.UserAccountRegistrationEntity;
import com.rajat.bankdemp.repository.UserAccountRegisterRepository;

@Service
@Transactional
public class UserAccountResgistrationService {
	
	@Autowired
	private UserAccountRegisterRepository userAccountRegisterRepository;
	
	public boolean userAccountRegister(UserAccountRegistrationEntity accountRegistrationEntity) {
		findMaxAccountNumber();
		accountRegistrationEntity.setAccountNumber("bank"+(findMaxAccountNumber()+1));
		userAccountRegisterRepository.save(accountRegistrationEntity);
//		System.out.println(accountRegistrationEntity);
		return false;
	}
	
	public List<UserAccountRegistrationEntity> getUserAccount(){		
		return userAccountRegisterRepository.findAll();
	}
	
	
	public long findMaxAccountNumber() {		
		return userAccountRegisterRepository.count();
	}
	
	
	public UserAccountRegistrationEntity getRegisterUser(int accountNumber) {
		return userAccountRegisterRepository.findById(accountNumber).get();		
	}
	
	
	public boolean deleteUserAccount(int accountNumber) {
		UserAccountRegistrationEntity entity=getRegisterUser(accountNumber);
		if(entity!=null)
		{
			userAccountRegisterRepository.delete(entity);
			return true;
		}
		return false;
	}
	
	public void updateBalance(UserAccountRegistrationEntity accountRegistrationEntity) {
		UserAccountRegistrationEntity entity=getRegisterUser(accountRegistrationEntity.getUserAccountRegistrationId());
		entity.setBalance(accountRegistrationEntity.getBalance());		
		userAccountRegisterRepository.save(accountRegistrationEntity);
	}
	
	
}
