package onarray;

public class MaxValue {
	static int max, num;

	static int maxVal() {
		int ar[] = { 10, 20, 30, 100, 50, 60, 90 };
		max = ar[0];
		for (int i = 0; i < ar.length; i++) {

			if (max < ar[i]) {
				max = ar[i];

			}

		}
		return max;
	}

	public static void main(String[] args) {

		System.out.println("The max value in Array is : "+maxVal());
		
	}
}
