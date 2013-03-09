package com.nbna.generics1;

import java.util.ArrayList;
import java.util.Iterator;

public class WithOutGenerics1 {

	
	public static void main(String[] args) {
		
		ArrayList arl = new ArrayList();
		
		arl.add("Apple");
		arl.add("Mango");
		arl.add("Grapes");
		arl.add("Guava");
		arl.add("Pears");
		arl.add("Orange");
		arl.add(3);	
		
		System.out.println("Contents after Removing: "+ arl);
		
		System.out.println("Using Iterator: ");
		/*
		 * To demo the significance of generics
		 */
		Iterator it = arl.iterator();		
		while(it.hasNext()){
			System.out.println(it.next());			
			//String st = (String) it.next();
			//System.out.println(st);			
		}
		
		System.out.println("Using for loop: ");
		for (Object o : arl){
			System.out.println(o);
		   // String st = (String) o;	
		  //System.out.println(st);
		}
		
		
	}

}
