package com.SecureHome.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LoanDisbursement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int disbursementId;
	private String disbursementDate;
	private String disbursementApplicantName;
	private long disbursementApplicantMobileNo;
	private int disbursementAmount;
	private double disbursementRateOfInterest;
	private double disbursementEmi;
	private String status;
	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails accountDetails;
	
	
	public int getDisbursementId() {
		return disbursementId;
	}
	public void setDisbursementId(int disbursementId) {
		this.disbursementId = disbursementId;
	}
	public String getDisbursementDate() {
		return disbursementDate;
	}
	public void setDisbursementDate(String disbursementDate) {
		this.disbursementDate = disbursementDate;
	}
	public String getDisbursementApplicantName() {
		return disbursementApplicantName;
	}
	public void setDisbursementApplicantName(String disbursementApplicantName) {
		this.disbursementApplicantName = disbursementApplicantName;
	}
	public long getDisbursementApplicantMobileNo() {
		return disbursementApplicantMobileNo;
	}
	public void setDisbursementApplicantMobileNo(long disbursementApplicantMobileNo) {
		this.disbursementApplicantMobileNo = disbursementApplicantMobileNo;
	}
	public int getDisbursementAmount() {
		return disbursementAmount;
	}
	public void setDisbursementAmount(int disbursementAmount) {
		this.disbursementAmount = disbursementAmount;
	}
	public double getDisbursementRateOfInterest() {
		return disbursementRateOfInterest;
	}
	public void setDisbursementRateOfInterest(double disbursementRateOfInterest) {
		this.disbursementRateOfInterest = disbursementRateOfInterest;
	}
	public double getDisbursementEmi() {
		return disbursementEmi;
	}
	public void setDisbursementEmi(double disbursementEmi) {
		this.disbursementEmi = disbursementEmi;
	}
	public AccountDetails getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
