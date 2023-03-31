package com.SecureHome.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureHome.main.model.LoanDisbursement;
import com.SecureHome.main.repository.LoanDisbursementRepository;
import com.SecureHome.main.service.LoanDisbursementService;
@Service
public class LoanDisbursementServiceImpl implements LoanDisbursementService{

	@Autowired
	LoanDisbursementRepository repo;
	
	@Override
	public LoanDisbursement saveLoanDisbursement(LoanDisbursement ld) {
		LoanDisbursement ldisbursement=repo.save(ld);
		return ldisbursement;
	}

	@Override
	public List<LoanDisbursement> getLoanDisbursement() {
		List<LoanDisbursement> list=repo.findAll();
		return list;
	}
}
