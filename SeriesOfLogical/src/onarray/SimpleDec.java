package onarray;

import java.util.Arrays;

public class SimpleDec {

	public static int sumo() {
		int nayan[] = { 10, 20, 30, 40, 50, 60, 90 };
		int sum = 0;
		System.out.println("My array is : "+Arrays.toString(nayan));
		
		for (int i = 0; i < nayan.length; i++) {
			sum += nayan[i];
		}
		return sum;
	}
	
	
	

	public static void main(String[] args) {
	
	System.out.println("My array total is : "+sumo());
	
//	int nayan[] = new int[6];
//	nayan[0]=20;
//	nayan[2]=14;
//	nayan[3]=30;
//	nayan[4]=10;
//	nayan[5]=7;
//	
//	for (int i : nayan) {
//	System.out.println(i);	
//	}
	
	}	
}
