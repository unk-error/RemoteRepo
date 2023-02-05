package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class AadharCardOffice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String centerName;

	private String address;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "a_a_p_id")
	private List<AadharCard> aadharcard = new ArrayList<AadharCard>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<AadharCard> getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(List<AadharCard> aadharcard) {
		this.aadharcard = aadharcard;
	}

	@Override
	public String toString() {
		return "AadharCardOffice [id=" + id + ", centerName=" + centerName + ", address=" + address + ", aadharcard="
				+ aadharcard + "]";
	}
	
	
	
}