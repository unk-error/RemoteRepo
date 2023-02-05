package com.model.service;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.AadharCard;
import com.model.AadharCardOffice;
import com.model.PanCard;
import com.model.util.HibernateUtilFi;

public class AadharCardOfficeServiceImpl implements AadharCardOfficeService {
	
	SessionFactory sf = HibernateUtilFi.getsessionfacFactory();
	Session session = sf.openSession();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addAadharOfficeDetailsWithAadharCardAndPanCardDetails() {
	System.out.println("Your Application Started");	
	AadharCardOffice aco = new AadharCardOffice();
	System.out.println("Enter Center Name ");
	aco.setCenterName(sc.next());	
	System.out.println("Enter Center Address ");
	aco.setAddress(sc.next());	
	
	int temp;
	System.out.println("How many Aadhar Card you want to add ");
	temp = sc.nextInt();
		for (int i = 0; i < temp; i++) {
		AadharCard ac = new AadharCard();
		System.out.println("Please enter person name");
		ac.setAadharholdername(sc.next());
		System.out.println("Enter aadhar card number here");
		ac.setAadharno(sc.nextInt());
		System.out.println("Enter person Birthday Date here");
		ac.setDob(sc.next());
		
		aco.getAadharcard().add(ac);
		
		
		for (int j = 0; j < temp; j++) {
		PanCard pc = new PanCard();	
		System.out.println("Enter Person Name ");
		pc.setPholdername(sc.next());
		System.out.println("Enter PanCard Number here ");
		pc.setPcardno(sc.next());
		
		
		ac.setPancard(pc);
		}
		
		}
		session.save(aco);
		session.beginTransaction().commit();
		
	System.out.println("Your Data Inserted...");	
	}

	@Override
	public void getAllAadharOfficeDetailsWithAadharCardAndPanCardDetails() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getSingleAadharOfficeDetailsWithAadharCardAndPanCardDetails() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllAadharCardWithPanCardDetails() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getSingleAadharCardWithPanCardDetails() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAadharOfficeDetails() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAadharCardDetailsUsingAadharOffice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePanCardDetailsUsingAadharCard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteParticularAadharCardUsingAadharOffice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAadharOffice() {
		// TODO Auto-generated method stub

	}

}
