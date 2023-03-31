package com.SecureHome.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecureHome.main.model.LoanDisbursement;
@Repository
public interface LoanDisbursementRepository extends JpaRepository<LoanDisbursement, Integer>{

}
