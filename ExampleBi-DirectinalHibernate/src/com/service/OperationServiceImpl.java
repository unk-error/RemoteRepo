package com.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.AadharCard;
import com.model.Person;
import com.util.HibernateUtil;
@SuppressWarnings("deprecation")
public class OperationServiceImpl implements OperationService{
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Scanner sc = new Scanner(System.in);

	
	@Override
	public void addPersonWithAadharCard() {
	Person p = new Person();
	AadharCard ac = new AadharCard();
	Session session =sf.openSession();
	
	System.out.println("Please enter person name here");
	p.setPname(sc.next());
	System.out.println("Resident Address here");
	p.setPaddress(sc.next());
	System.out.println("Retype Your name here");
	ac.setAname(sc.next());
	System.out.println("Enter aadhar card number");	
	ac.setAnumber(sc.next());
	
	p.setAadharCard(ac);
	session.save(p);
	session.beginTransaction().commit();
	System.out.println("Data stored successfully...!");
	}


	@Override
	public void getAllPersonDataWithAadharData() {
	Session session = sf.openSession();	
	Query<Person> query = session.createQuery("from Person");
	List<Person> plist= query.getResultList();
	System.out.println(plist);
	}

	@Override
	public void singlePersonDataWithAadharData() {
	Session session = sf.openSession();
	System.out.println("Enter person id which person Data you want");
	int id = sc.nextInt();
	Person p = session.get(Person.class, id);
	if (p != null) {
	System.out.println(p);	
	}else {
	System.out.println("You entered wrong number");	
	}
		
	}

	@Override
	public void updatePerson() {

		
		
		
	}

	@Override
	public void updateAadharUsingPersonId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAadharDataWithPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllAadharDataWithPersonData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void singleAadharDataWithPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAadharData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePersonUsingAadharData() {
		// TODO Auto-generated method stub
		
	}

}
