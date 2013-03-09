package com.nbna.generics1;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsExample2 {

	public static void main(String[] args) {

		/*
		 * 1)To show the difference in the code after defining Generics
		 */
		ArrayList<String> arl = new ArrayList<String>();
		
		arl.add("Apple");
		arl.add("Mango");
		arl.add("Grapes");
		arl.add("Guava");
		arl.add("Pears");
		arl.add("Orange");
		//arl.add(3);	//2) To demo that system will not add 3 to the list since it will be converted into Integer		
		
		
		
		System.out.println("Contents after Removing: "+ arl);
		
		System.out.println("Using Iterator: ");
		/*
		 * 3)To show the difference in the code after defining Generics
		 */
		Iterator<String> it = arl.iterator();		
		while(it.hasNext()){						
			String st = (String) it.next();
			System.out.println(st);			
		}
		
		System.out.println("Using for loop: ");
		/*
		 * 3)To show the difference in the code after defining Generics
		 */
		for (String str : arl){
			System.out.println(str);		   
		}		

	}

}
