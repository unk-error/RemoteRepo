package com.service;

import java.util.Scanner;

public class Testo {

	
	
	public static void main(String[] args) {
	boolean flag = true;
	OperationService os = new OperationServiceImpl();
	Scanner sc = new Scanner(System.in);

	while (true) {
		System.out.println("WELCOME TO MENU");	
		System.out.println("01 addPersonWithAadharCard");	
		System.out.println("02 getAllPersonDataWithAadharData");	
		System.out.println("03 singlePersonDataWithAadharData");	
		System.out.println("04 updatePerson");	
		System.out.println("05 updateAadharUsingPersonId");	
		System.out.println("06 addAadharDataWithPerson");	
		System.out.println("07 getAllAadharDataWithPersonData");	
		System.out.println("08 singleAadharDataWithPerson");	
		System.out.println("09 updateAadharData");	
		System.out.println("10 updatePersonUsingAadharData");	
		System.out.println("Exit");	

		System.out.println("What you want to do, please select");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1:
		os.addPersonWithAadharCard();	
			break;
		case 2:
		os.getAllPersonDataWithAadharData();	
			break;

		case 3:
		os.singlePersonDataWithAadharData();	
			break;

		case 4:
		os.updatePerson();	
			break;


			
			
		case 10:
		flag=false;	
			break;

			
		default:
			break;
		}
		
		
		
	  }
	
	}
}
