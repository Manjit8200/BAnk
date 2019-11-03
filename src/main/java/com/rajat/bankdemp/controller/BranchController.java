package com.rajat.bankdemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.bankdemp.domain.BranchEntity;
import com.rajat.bankdemp.service.BranchService;

@RestController
@RequestMapping(value="/branch")
public class BranchController {
	
	
	@Autowired
	private BranchService branchService;
	
	@RequestMapping(value="/add-branch")
	public boolean addBranch(@RequestBody BranchEntity branchEntity) {
		branchService.addBranch(branchEntity);
		return false;
	}
	
	
	@RequestMapping(value="/get-all-branch")
	public List<BranchEntity> getAllBranch(){		
		return branchService.getAllBranch();
	}

}
