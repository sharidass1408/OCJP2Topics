package com.nbna.arraylist1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	
	public static void main(String[] args) {
		
		ArrayList arl = new ArrayList();
		
		arl.add("Apple");
		arl.add("Mango");
		arl.add("Grapes");
		arl.add("Guava");
		arl.add("Pears");
		arl.add("Orange");
		
		
		System.out.println("Contents of ArrayList: "+ arl);
		
		arl.remove(3);
		arl.remove("Apple");
		
		System.out.println("Contents after Removing: "+ arl);
		
		System.out.println("Using Iterator: ");
		
		Iterator it = arl.iterator();
		
		while(it.hasNext()){
			
			if((it.next()).equals("Orange")){
			System.out.println("found organe");
			}else
			 System.out.println("Not found");
		}
		
		

	}

}
