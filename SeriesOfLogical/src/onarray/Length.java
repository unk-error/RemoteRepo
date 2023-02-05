package onarray;

public class Length {

	
	public static int len() {
	int ar[] = { 10, 20, 30, 40, 50, 60, 90 };
	int   i=0;
	try {
	while (ar[i] != 'a') {
	i++;
		
	}	
		
	} catch (Exception e) {
		
	}
	
	return i;
	}
	public static void main(String[] args) {
	System.out.println("My array length is : "+len());	
	}
	
}
