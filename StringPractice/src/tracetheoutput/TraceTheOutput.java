package tracetheoutput;

public class TraceTheOutput {

	TraceTheOutput(){
		System.out.println("Hey im constructor here");
	}
	
	{
		System.out.println("This is my Non static block");
	}
	
	static {
		System.out.println("This is my static method");
	}
	
	
	
	
	public static void main(String[] args) {
		
		TraceTheOutput t = new TraceTheOutput(); 
	}
}
