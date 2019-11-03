package com.rajat.bankdemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rajat.bankdemp.domain.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer>
{

}
