package Seettt;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExamLinkedHashSetttt {

	
	
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> se = new LinkedHashSet<Integer>();
		se.add(120);	
		se.add(240);	
		se.add(15);	
		se.add(120);	
		se.add(170);	
		se.add(170);	
		se.add(125);	
		se.add(60);	
		se.add(null);	
		se.add(null);	
		se.add(null);	
		se.add(null);	
		
		
		
//		print kartana kasepan yetat it means insertion order not maintain
//	 	sobat duplicate ghet nahi 
		for (Integer val : se) {
		System.out.println(val);	
		}
		
		System.out.println("Iterate with iterator");
		Iterator<Integer> numbers = se.iterator();
		while(numbers.hasNext()) {
			System.out.println(numbers.next());
		}
		
		
		}
}
