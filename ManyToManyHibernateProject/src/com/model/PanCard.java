package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PanCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;

	private String pholdername;

	private String pcardno;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPholdername() {
		return pholdername;
	}

	public void setPholdername(String pholdername) {
		this.pholdername = pholdername;
	}

	public String getPcardno() {
		return pcardno;
	}

	public void setPcardno(String pcardno) {
		this.pcardno = pcardno;
	}

	@Override
	public String toString() {
		return "PanCard [pid=" + pid + ", pholdername=" + pholdername + ", pcardno=" + pcardno + "]";
	}
	
	
	
	
	
	
	
}
