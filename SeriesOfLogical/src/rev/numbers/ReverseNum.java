package rev.numbers;

import java.util.Scanner;

public class ReverseNum {

	static void logic1(int ui) {
		System.out.println("Calling method");
		int temp = 0;
		while (ui != 0) {
			temp = temp * 10 + ui % 10;
			ui = ui / 10;
		}
		System.out.println("Your reversed value is " + temp);
	}

	static void logic2(int ui) {

		StringBuffer sbf = new StringBuffer(String.valueOf(ui));
		sbf.reverse();
		System.out.println("Your reversed value is " + sbf);

	}

	static void logic3(int ui) {

		StringBuilder sbf = new StringBuilder(String.valueOf(ui));
		sbf.reverse();
		System.out.println("Your reversed value is " + sbf);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number here :");
		int ui = sc.nextInt();
//		There are three logics for reversed numbers
//		logic1(ui);
//		logic2(ui);
//		logic3(ui);
		
	}

}
