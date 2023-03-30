package com.SecureHome.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SecureHome.main.model.CibilScore;
import com.SecureHome.main.model.LoanDisbursement;
import com.SecureHome.main.model.SanctionalDetails;
import com.SecureHome.main.service.HomeLoanService;

@RestController
public class HomeLoanController {

	@Autowired
	HomeLoanService service;
	
	@PostMapping("/postSanctionDetails")
	public String saveSanctionDetails(@RequestBody SanctionalDetails sd)
	{
		SanctionalDetails sdetails=service.saveSanctionDetails(sd);
		return sdetails.getSanctionId() +" Saved In Database";
	}
	
	@GetMapping("/getSanctionDetails")
	public List<SanctionalDetails> getSanctionDetails()
	{
		List<SanctionalDetails> list=service.getSanctionDetails();
		return list;
	}
	
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
	
	@PostMapping("/postCibilScore")
	public String saveCibilScore(@RequestBody CibilScore cb)
	{
		CibilScore cscore=service.saveCibilScore(cb);
		return cscore.getCibilId()+" Saved In Database";
	}
	
	@GetMapping("/getCibilScore")
	public List<CibilScore> getCibilScore()
	{
		List<CibilScore> list=service.getCibilScore();
		return list;
	}
}
