package com.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Addressss;
import com.model.Student;
import com.util.HibernateUtil;
@SuppressWarnings("unused")
public class OperationServiceImpl implements OperationService{

	SessionFactory sf = HibernateUtil.getsessionFactory();
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void insertStduentWithAddress() {
	Session session = sf.openSession();
	Student st = new Student();
	Addressss ad = new Addressss();
	System.out.println("Enter student name here");	
	st.setName(sc.next());
	System.out.println("Enter student UserName here");	
	st.setUname(sc.next());
	System.out.println("Enter student Password here");	
	st.setPass(sc.next());
	System.out.println("Enter student City here");	
	ad.setCity(sc.next());
	System.out.println("Enter student Dist here");	
	ad.setDist(sc.next());
	st.setAddress(ad);
	
	session.save(st);
	session.beginTransaction().commit();
	System.out.println("Your record inserted successfully");
	}

//============================================================	
	

	@Override
	public void showAllData() {
	Session session = sf.openSession();
//	Student stu = new Student();
	Query<Student> query = session.createQuery("from Student");
	List<Student> slist = query.getResultList();
	System.out.println(slist);
	}

//=============================================================	
	
	@Override
	public void getSingleStudentWithAddress() {
	Session session = sf.openSession();
	System.out.println("Which student info you want");
	int ch = sc.nextInt();
	
	Student st= session.get(Student.class, ch);
	if (st != null) {
	System.out.println(st);	
	}else {
	System.out.println("You entered wrong number");	
	}
		
	}

//==============================================================	
	
	@Override
	public void updateStudent() {
	Session session = sf.openSession();		
	System.out.println("Which student details you want to update");
	int ch = sc.nextInt();
	
	Student st= session.get(Student.class, ch);
	if (st != null) {
	System.out.println("Enter Student Name again");	
	st.setName(sc.next());
	System.out.println("Enter Student UserName here");
	st.setUname(sc.next());
	System.out.println("Enter Stduent PassWord here");
	st.setPass(sc.next());
	
	session.update(st);
	session.beginTransaction().commit();
	System.out.println("Your details are updated successfully");
	}else {
		System.out.println("You entered wrong number");	
		}
	}

//============================================================
	
	@Override
	public void updateAddressUsingStudent() {
		Session session = sf.openSession();		
		Addressss ad = new Addressss();
		System.out.println("Which student details you want to update");
		int ch = sc.nextInt();
		
		Student st= session.get(Student.class, ch);
		if (st != null) {
		System.out.println("Please enter your city here");	
		ad.setCity(sc.next());	
		System.out.println("Please enter your Dist here");	
		ad.setDist(sc.next());
		
		st.setAddress(ad);
		
		session.update(st);
		System.out.println("Your Address is updated successfully...");
		}else {
			System.out.println("You entered wrong number");	
			}
	}

	@Override
	public void deleteStudent() {
	Session session = sf.openSession();
	System.out.println("Which stduent you want to delete");
	int ch = sc.nextInt();
	Student s = session.get(Student.class, ch);
	session.delete(s);
	session.beginTransaction().commit();
	System.out.println("Student deleted successfully");
	}

}
