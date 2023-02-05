package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
	
	
	Configuration cfg = new Configuration().configure("com/hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	
	Student s = new Student();
	s.setSid(11);
	s.setName("nayan");
	s.setAddress("PunePCMC");
	
	session.save(s);
	session.beginTransaction().commit();
	
	System.out.println("My data saved successfully");
	}
	
	
}
