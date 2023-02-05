package swapnums;

public class SwapNumbers {

	public static void swapLogic1(int a, int b) {
		System.out.println("Before swapping value of a is " + a);
		System.out.println("Before swapping value of b is " + b);
		b = a + b - (a = b);
		System.out.println("The value of a after swapping " + a);
		System.out.println("The value of b after swapping " + b);

	}

	public static void main(String[] args) {
		swapLogic1(10, 20);
	}
}
