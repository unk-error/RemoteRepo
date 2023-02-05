package onarray;

import java.util.Scanner;

public class SortingHere {
    	
	public static void main(String[] args) {
	int temp , n ;
	Scanner sc = new Scanner(System.in);
	System.out.println("How many element you want to enter :");
	n = sc.nextInt();	
	int a[] = new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("All element added successfully");
	
	for (int k = 0; k < n; k++) 
    {
        for (int j = k + 1; j < n; j++) 
        {
            if (a[k] > a[j]) 
            {
                temp = a[k];
                a[k] = a[j];
                a[j] = temp;
            }
            
        }
       for (int i : a) {
		System.out.print(i+",  ");
	} 
       System.out.println();
    }

		
	}
}
