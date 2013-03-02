package com.nbna.vector4;

import java.util.ListIterator;
import java.util.Vector;

public class VectorEx {

	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		int x[] = {20,10,30,15,60};
		/*
		 * To demo adding elements to v
		 */		
		for(int i=0; i<x.length; i++){
			v.add(x[i]);
		}
		
		/*
		 * To Demo how to retrieve elements from vector
		 */
		System.out.println("Vector elements: ");
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
		
		System.out.println("Elements using ListIterator");
		ListIterator listit = v.listIterator();
		
		/*System.out.println("In forward direction");
		while(listit.hasNext())
			System.out.println(listit.next()+"\t");
		*/
		System.out.println("In backward direction");
		while(listit.hasPrevious())
			System.out.println(listit.previous()+"\t");
		
		
		
	}

}
