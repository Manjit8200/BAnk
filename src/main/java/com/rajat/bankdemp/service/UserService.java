package com.rajat.bankdemp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajat.bankdemp.domain.UserAccountRegistrationEntity;
import com.rajat.bankdemp.domain.UserEntity;
import com.rajat.bankdemp.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public boolean addUser(UserEntity userEntity) {
		userRepository.save(userEntity);		
		return false;
	}
	
	public List<UserEntity> getAllUsers(){		
		return userRepository.findAll();
	}
	
	public boolean authUser(UserEntity userEntity) {
     userRepository.findByUserNameAndPassword(userEntity.getUserName(),userEntity.getPassword());
		if(userRepository.findByUserNameAndPassword(userEntity.getUserName(),userEntity.getPassword()).size()>0)
		return true;
		return false;
	}
	
	
	
	
	
	
	

}
