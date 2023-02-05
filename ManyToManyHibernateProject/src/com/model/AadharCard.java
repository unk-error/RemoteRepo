package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AadharCard {

	@Id
	private int aadharno;

	private String aadharholdername;

	private String address;

	private String dob;

	@OneToOne(cascade = CascadeType.ALL)
	private PanCard pancard;

	public int getAadharno() {
		return aadharno;
	}

	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}

	public String getAadharholdername() {
		return aadharholdername;
	}

	public void setAadharholdername(String aadharholdername) {
		this.aadharholdername = aadharholdername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public PanCard getPancard() {
		return pancard;
	}

	public void setPancard(PanCard pancard) {
		this.pancard = pancard;
	}

	@Override
	public String toString() {
		return "AadharCard [aadharno=" + aadharno + ", aadharholdername=" + aadharholdername + ", address=" + address
				+ ", dob=" + dob + ", pancard=" + pancard + "]";
	}
	
	
	
	
}
