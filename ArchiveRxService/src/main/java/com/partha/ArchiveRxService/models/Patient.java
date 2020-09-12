package com.partha.ArchiveRxService.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Patient {
	
	@Id
	private int patId;
	private String patFname;
	private String patLname;
	private String patAddress;
	private String patHomePhone;
	private String patSecondaryPhone;
	private String patCountry;
	public int getPatId() {
		return patId;
	}
	public void setPatId(int patId) {
		this.patId = patId;
	}
	public String getPatFname() {
		return patFname;
	}
	public void setPatFname(String patFname) {
		this.patFname = patFname;
	}
	public String getPatLname() {
		return patLname;
	}
	public void setPatLname(String patLname) {
		this.patLname = patLname;
	}
	public String getPatAddress() {
		return patAddress;
	}
	public void setPatAddress(String patAddress) {
		this.patAddress = patAddress;
	}
	public String getPatHomePhone() {
		return patHomePhone;
	}
	public void setPatHomePhone(String patHomePhone) {
		this.patHomePhone = patHomePhone;
	}
	public String getPatSecondaryPhone() {
		return patSecondaryPhone;
	}
	public void setPatSecondaryPhone(String patSecondaryPhone) {
		this.patSecondaryPhone = patSecondaryPhone;
	}
	public String getPatCountry() {
		return patCountry;
	}
	public void setPatCountry(String patCountry) {
		this.patCountry = patCountry;
	}
	@Override
	public String toString() {
		return "Patient [patId=" + patId + ", patFname=" + patFname + ", patLname=" + patLname + ", patAddress="
				+ patAddress + ", patHomePhone=" + patHomePhone + ", patSecondaryPhone=" + patSecondaryPhone
				+ ", patCountry=" + patCountry + "]";
	}
	

}
