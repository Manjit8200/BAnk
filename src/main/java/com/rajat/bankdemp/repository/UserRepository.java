package com.rajat.bankdemp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rajat.bankdemp.domain.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{	
	List<UserEntity> findByUserNameAndPassword(String userName,String password);
}
