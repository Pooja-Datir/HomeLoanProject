package com.SecureHome.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SanctionalDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sanctionId;
	private String sanctionDate;
	private String sanctionApplicantName;
	private long sanctionApplicantMobileNo;
	private int sanctionAmount;
	private double sanctionRateOfInterest;
	private double processingRate;
	private double sanctionEmi;
	private int sanctionTenure;
	private String status;
	
	
	public int getSanctionId() {
		return sanctionId;
	}
	public void setSanctionId(int sanctionId) {
		this.sanctionId = sanctionId;
	}
	public String getSanctionDate() {
		return sanctionDate;
	}
	public void setSanctionDate(String sanctionDate) {
		this.sanctionDate = sanctionDate;
	}
	public String getSanctionApplicantName() {
		return sanctionApplicantName;
	}
	public void setSanctionApplicantName(String sanctionApplicantName) {
		this.sanctionApplicantName = sanctionApplicantName;
	}
	public long getSanctionApplicantMobileNo() {
		return sanctionApplicantMobileNo;
	}
	public void setSanctionApplicantMobileNo(long sanctionApplicantMobileNo) {
		this.sanctionApplicantMobileNo = sanctionApplicantMobileNo;
	}
	public int getSanctionAmount() {
		return sanctionAmount;
	}
	public void setSanctionAmount(int sanctionAmount) {
		this.sanctionAmount = sanctionAmount;
	}
	public double getSanctionRateOfInterest() {
		return sanctionRateOfInterest;
	}
	public void setSanctionRateOfInterest(double sanctionRateOfInterest) {
		this.sanctionRateOfInterest = sanctionRateOfInterest;
	}
	public double getProcessingRate() {
		return processingRate;
	}
	public void setProcessingRate(double processingRate) {
		this.processingRate = processingRate;
	}
	public double getSanctionEmi() {
		return sanctionEmi;
	}
	public void setSanctionEmi(double sanctionEmi) {
		this.sanctionEmi = sanctionEmi;
	}
	public int getSanctionTenure() {
		return sanctionTenure;
	}
	public void setSanctionTenure(int sanctionTenure) {
		this.sanctionTenure = sanctionTenure;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
