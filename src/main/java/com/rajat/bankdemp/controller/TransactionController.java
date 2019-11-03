package com.rajat.bankdemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.bankdemp.domain.TransactionEntity;
import com.rajat.bankdemp.service.TransactionService;

@RestController
@RequestMapping(value="/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(value="/generate-transaction")
	public String generateTransaction(@RequestBody TransactionEntity transactionEntity) {		
		if(transactionService.addTransaction(transactionEntity))
			return "Transaction done successfully";
		return "Transaction failure";
	}
	
	@RequestMapping(value="/get-all-transaction")
	public List<TransactionEntity> getAllTransaction(){
		return transactionService.getAllTransaction();
	}
}
