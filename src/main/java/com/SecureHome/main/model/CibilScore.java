package com.SecureHome.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CibilScore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cibilId;
	private int gencibilScore;
	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails accountDetails;
	
	public int getGencibilScore() {
		return gencibilScore;
	}
	public void setGencibilScore(int gencibilScore) {
		this.gencibilScore = gencibilScore;
	}
	public int getCibilId() {
		return cibilId;
	}
	public void setCibilId(int cibilId) {
		this.cibilId = cibilId;
	}
	public AccountDetails getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}
	
	
}
