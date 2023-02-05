package com.examplea;
//01. Create object and then use it 
//02. Used sum method with Annonymous inner Clas
//03. With the help of Lambda Expression



public class DriverC {

	public static void main(String[] args) {
//	01	
	Testing call = new TestingImpl();
	System.out.println("This is output from first way");
	System.out.println(call.sum(25, 25));
	System.out.println("============================");
//	02
	Testing cal = new Testing() {
		@Override
		public int sum(int a, int b) {
			return a+b;
		}
	};
	System.out.println("This is output from second way");
	cal.sum(100, 200);
	System.out.println("============================");
//	03
	System.out.println("This is output from third way");
	Testing ca = (a,b)->a+b;
	ca.sum(40, 40);
		
		
	}
	
}
