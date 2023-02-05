package com.service;

import java.util.Scanner;

public class TestDrivrrr {


	public static void main(String[] args) {
		OperationService op = new OperationServiceImpl();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			System.out.println("01 insert Stduent With Address");
			System.out.println("02 show All Data");
			System.out.println("03 get Single Student With Address");
			System.out.println("04 update Student");
			System.out.println("05 update Address Using Student");
			System.out.println("06 delete Student");
			System.out.println("07 Exit");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				op.insertStduentWithAddress();
				break;
			case 2:
				op.showAllData();
				break;
			case 3:
				op.getSingleStudentWithAddress();
				break;
			case 4:
				op.updateStudent();
				break;
			case 5:
				op.updateAddressUsingStudent();
				break;
			case 6:
				op.deleteStudent();
				break;
			case 7:
				 flag=false;
				break;

			default:
				System.out.println("You Entered Wrong Number...");
				break;
			}

		}

	}

}
