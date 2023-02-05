package fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many fibo print ");
		int ui = sc.nextInt();

		int n1 = 0, n2 = 1;
		System.out.print(n1 + "  " + n2);
		for (int i = 0; i < ui; i++) {
			int sum = 0;
			sum = n1 + n2;
			System.out.print("  " + sum);
			n1 = n2;
			n2 = sum;

		}

	}

}
