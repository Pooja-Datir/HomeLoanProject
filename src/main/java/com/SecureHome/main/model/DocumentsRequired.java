package com.SecureHome.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class DocumentsRequired {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentId;
	@Lob
	private byte[] adharcard;
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] salarySlip;
	@Lob
	private byte[] propertyDocument;
	@Lob
	private byte[] blankCheque;
	@Lob
	private byte[] passport;
	@Lob
	private byte[] ankStatement;
	
	public int getDocumentId() {
		return documentId;
	}
	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}
	public byte[] getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(byte[] adharcard) {
		this.adharcard = adharcard;
	}
	public byte[] getPancard() {
		return pancard;
	}
	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}
	public byte[] getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(byte[] salarySlip) {
		this.salarySlip = salarySlip;
	}
	public byte[] getPropertyDocument() {
		return propertyDocument;
	}
	public void setPropertyDocument(byte[] propertyDocument) {
		this.propertyDocument = propertyDocument;
	}
	public byte[] getBlankCheque() {
		return blankCheque;
	}
	public void setBlankCheque(byte[] blankCheque) {
		this.blankCheque = blankCheque;
	}
	public byte[] getPassport() {
		return passport;
	}
	public void setPassport(byte[] passport) {
		this.passport = passport;
	}
	public byte[] getAnkStatement() {
		return ankStatement;
	}
	public void setAnkStatement(byte[] ankStatement) {
		this.ankStatement = ankStatement;
	}
	
	
	
}
