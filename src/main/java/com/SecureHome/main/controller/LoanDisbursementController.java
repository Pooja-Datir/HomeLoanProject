package com.SecureHome.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SecureHome.main.model.LoanDisbursement;
import com.SecureHome.main.service.LoanDisbursementService;

@RestController
public class LoanDisbursementController {

	@Autowired
	LoanDisbursementService service;
	
	@PostMapping("/postLoanDisbursement")
	public String saveLoanDisbursement(@RequestBody LoanDisbursement ld)
	{
		LoanDisbursement ldisbursement=service.saveLoanDisbursement(ld);
		return ldisbursement.getDisbursementId()+" Saved In Database";
	}
	
	@GetMapping("/getLoanDisbursement")
	public List<LoanDisbursement> getLoanDisbursement()
	{
		List<LoanDisbursement> list=service.getLoanDisbursement();
		return list;
	}
	
}
