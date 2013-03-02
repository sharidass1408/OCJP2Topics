package com.nbna.linkedhashset5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.nbna.objectsexamples0.Apple;
import com.nbna.objectsexamples0.Car;
import com.nbna.objectsexamples0.Father;

public class LinkedHashSetExample {

	
	public static void main(String[] args) {
		
		Car c1 = new Car("Car1");
		Car c2 = new Car("Car2");
		
		Apple a1 = new Apple("Apple1");
		Apple a2 = new Apple("Apple2");
				
		Father f1= new Father("Father1");
		Father f2= new Father("Father2");
		
		
		
		Set hs = new HashSet();		
		
		hs.add(c1);
		hs.add(c2);
		hs.add(a1);
		hs.add(a2);
		hs.add(f1);
		hs.add(f2);
		hs.add("Hello");
		hs.add(10);
		hs.add(11.2);		
		System.out.println("Elements of s set:  "+ hs);	
		
		/*
		 * 3) To Demo that Linked Hash Set stores data in the order in which it is added
		 */
		Set lhs = new LinkedHashSet();
		lhs.add(c1);
		lhs.add(c2);
		lhs.add(a1);
		lhs.add(a2);
		lhs.add(f1);
		lhs.add(f2);
		lhs.add("Hello");
		lhs.add(10);
		lhs.add(11.2);		
		System.out.println("Elements of Lhs set: "+ lhs);
		
		System.out.println("Note: Linked Hash Set stores data in the order in which it is added");
		
		

	}

}
