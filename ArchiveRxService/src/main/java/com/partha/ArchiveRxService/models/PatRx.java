package com.partha.ArchiveRxService.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PatRx {
	
	@Id
	private int rxId;
	private long rxNum;
	private int fillAuthorized;
	private String rxSig;
	private String createdDate;
	private String rxStatus;
	private Patient patient;
	private Prescriber prescriber;
	
	public int getRxId() {
		return rxId;
	}
	public void setRxId(int rxId) {
		this.rxId = rxId;
	}
	public long getRxNum() {
		return rxNum;
	}
	public void setRxNum(long rxNum) {
		this.rxNum = rxNum;
	}
	public int getFillAuthorized() {
		return fillAuthorized;
	}
	public void setFillAuthorized(int fillAuthorized) {
		this.fillAuthorized = fillAuthorized;
	}
	public String getRxSig() {
		return rxSig;
	}
	public void setRxSig(String rxSig) {
		this.rxSig = rxSig;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getRxStatus() {
		return rxStatus;
	}
	public void setRxStatus(String rxStatus) {
		this.rxStatus = rxStatus;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Prescriber getPrescriber() {
		return prescriber;
	}
	public void setPrescriber(Prescriber prescriber) {
		this.prescriber = prescriber;
	}
	@Override
	public String toString() {
		return "PatRx [rxId=" + rxId + ", rxNum=" + rxNum + ", fillAuthorized=" + fillAuthorized + ", rxSig=" + rxSig
				+ ", createdDate=" + createdDate + ", patient=" + patient + ", prescriber=" + prescriber + "]";
	}
	
}
