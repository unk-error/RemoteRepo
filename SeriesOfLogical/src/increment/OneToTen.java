package increment;

//1
//2 3
//4 5 6
//7 8 9 10


public class OneToTen {

	public static void main(String[] args) {
		int sample = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
			System.out.print(sample+" ");
			sample++;	
			}
		System.out.println();		
		}
	}
	
}
