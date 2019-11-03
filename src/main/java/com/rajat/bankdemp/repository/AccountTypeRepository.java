package com.rajat.bankdemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajat.bankdemp.domain.AccountTypeEntity;

public interface AccountTypeRepository extends JpaRepository<AccountTypeEntity, Integer>
{

}
