package com.SecureHome.main.service;

import java.util.List;

import com.SecureHome.main.model.LoanDisbursement;

public interface LoanDisbursementService {

	LoanDisbursement saveLoanDisbursement(LoanDisbursement ld);

	List<LoanDisbursement> getLoanDisbursement();
}
