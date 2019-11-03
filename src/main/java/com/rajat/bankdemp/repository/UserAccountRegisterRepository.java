package com.rajat.bankdemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajat.bankdemp.domain.UserAccountRegistrationEntity;

public interface UserAccountRegisterRepository extends JpaRepository<UserAccountRegistrationEntity, Integer> {

	
}
