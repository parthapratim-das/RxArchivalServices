package com.partha.ArchiveRxService.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Prescriber {
	
	@Id
	private int pbrId;
	private String pbrFname;
	private String pbrLname;
	private String pbrAddress;
	private String pbrRegno;
	private String pbrCountry;
	private String pbrPhone;
	public int getPbrId() {
		return pbrId;
	}
	public void setPbrId(int pbrId) {
		this.pbrId = pbrId;
	}
	public String getPbrFname() {
		return pbrFname;
	}
	public void setPbrFname(String pbrFname) {
		this.pbrFname = pbrFname;
	}
	public String getPbrLname() {
		return pbrLname;
	}
	public void setPbrLname(String pbrLname) {
		this.pbrLname = pbrLname;
	}
	public String getPbrAddress() {
		return pbrAddress;
	}
	public void setPbrAddress(String pbrAddress) {
		this.pbrAddress = pbrAddress;
	}
	public String getPbrRegno() {
		return pbrRegno;
	}
	public void setPbrRegno(String pbrRegno) {
		this.pbrRegno = pbrRegno;
	}
	public String getPbrCountry() {
		return pbrCountry;
	}
	public void setPbrCountry(String pbrCountry) {
		this.pbrCountry = pbrCountry;
	}
	public String getPbrPhone() {
		return pbrPhone;
	}
	public void setPbrPhone(String pbrPhone) {
		this.pbrPhone = pbrPhone;
	}
	@Override
	public String toString() {
		return "Prescriber [pbrId=" + pbrId + ", pbrFname=" + pbrFname + ", pbrLname=" + pbrLname + ", pbrAddress="
				+ pbrAddress + ", pbrRegno=" + pbrRegno + ", pbrCountry=" + pbrCountry + ", pbrPhone=" + pbrPhone + "]";
	}
	
}
