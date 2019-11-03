package com.rajat.bankdemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rajat.bankdemp.domain.BranchEntity;

public interface BranchRepository extends JpaRepository<BranchEntity, Integer> {

}
