package com.rajat.bankdemp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajat.bankdemp.domain.TransactionEntity;
import com.rajat.bankdemp.domain.UserAccountRegistrationEntity;
import com.rajat.bankdemp.repository.TransactionRepository;
import com.rajat.bankdemp.repository.UserAccountRegisterRepository;

@Service
@Transactional
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private UserAccountRegisterRepository accountRegisterRepository;
	
	@Autowired
	private UserAccountResgistrationService accountResgistrationService;
	
	public boolean addTransaction(TransactionEntity transactionEntity) {
		UserAccountRegistrationEntity registrationEntity=new UserAccountRegistrationEntity();
//		Integer accNO=getUserAccount(transactionEntity.getAccountRegistrationEntity().getUserAccountRegistrationId()).getUserAccountRegistrationId();
		registrationEntity.setBalance(transactionEntity.getAmount());
		registrationEntity.setUserAccountRegistrationId(transactionEntity.getAccountRegistrationEntity().getUserAccountRegistrationId());		
		accountResgistrationService.updateBalance(registrationEntity);
		
//		System.out.println(registrationEntity);
		transactionEntity.setAccountRegistrationEntity(registrationEntity);
//		System.out.println(transactionEntity);
						if(transactionRepository.save(transactionEntity)!=null)
			return true;
		return false;
	}
	
	public List<TransactionEntity> getAllTransaction(){
		return transactionRepository.findAll();
	}
	
	public UserAccountRegistrationEntity getUserAccount(int userRegisterId) {
		return accountRegisterRepository.findById(userRegisterId).get();
	}
	
//	public int getBalance() {
//		
//	}
	
	
	
	public boolean withdrawn() {
		
		
		return false;
	}
	
	
	public boolean checkMinimumBalance(int useraccountid) {
		UserAccountRegistrationEntity entity=accountRegisterRepository.getOne(useraccountid);
		if(entity.getAccountTypeEntity().getAccountName().equals("saving")) {
			
			if(entity.getBalance()>1000) {
				return true;
			}
		}
		System.out.println(entity);
		return false;		
		
	}
	
	
}
