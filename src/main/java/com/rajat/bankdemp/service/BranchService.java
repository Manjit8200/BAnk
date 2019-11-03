package com.rajat.bankdemp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajat.bankdemp.domain.BranchEntity;
import com.rajat.bankdemp.repository.BranchRepository;

@Service
@Transactional
public class BranchService {
	@Autowired
	private BranchRepository branchRepository;	
	
	public boolean addBranch(BranchEntity branchEntity) {
		branchRepository.save(branchEntity);		
		return false;
	}	
	
	public List<BranchEntity> getAllBranch(){
		return branchRepository.findAll();
	}

}
