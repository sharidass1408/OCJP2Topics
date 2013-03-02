package com.nbna.enumeration5;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationEx {

	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		Vector v2=v;
		Vector v3=v;
		
		int x[] = {20,10,30,15,60};		
		
		for(int i=0; i<x.length; i++){
			v.add(x[i]);
		}
	
		/*
		 * Traversing using Iterator
		 */
		
		System.out.println("Printing elements using ListIterator");
		ListIterator listit = v.listIterator();
		
		System.out.println("In forward direction");
		while(listit.hasNext())
			System.out.println(listit.next()+"\t");
		/*
		 * To Traverse using Enumerator
		 */
				
		Enumeration e = v.elements();
		System.out.println("Printing elements using enumeration");
		while(e.hasMoreElements()){
			
			System.out.println(e.nextElement());
		}
		
		ArrayList a = new ArrayList(v3);
		
		
			
	}

}
