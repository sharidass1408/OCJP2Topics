package com.nbna.set1;

import java.util.HashSet;
import java.util.Set;

import com.nbna.objectsexamples0.Apple;
import com.nbna.objectsexamples0.Cal;
import com.nbna.objectsexamples0.Car;
import com.nbna.objectsexamples0.Father;

public class SetExample {
	
	public static void main(String[] args) {
		Car c1 = new Car("Car1");
		Car c2 = new Car("Car2");
		
		Apple a1 = new Apple("Apple1");
		Apple a2 = new Apple("Apple2");
				
		Father f1= new Father("Father1");
		Father f2= new Father("Father2");
		
		/*
		 * 1) To Demo how set is defined
		 */
		Set s = new HashSet();
		Set dup = new HashSet();
		//System.out.println("Elements of s set: "+s);
		/*
		 * 2) To Demo that different objects can be added Set
		 */
		s.add(c1);
		s.add(c2);
		s.add(a1);
		s.add(a2);
		s.add(f1);
		s.add(f2);
		s.add("Hello");
		s.add(10);
		s.add(11.2);
	
		
		/*
		 * 3)Returns a string representation of this collection.
			The string representation consists of a list of the collection's elements in the order they are returned by its iterator, 
			enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space)
		 */
		//System.out.println("Elements of s set: "+s);		
		
		/*
		 * 4)To Demo: addAll 
		 */
		dup.addAll(s);
		System.out.println("Elements of dup set: "+dup);		
		//System.out.println("Size of dup set: "+s.size());
		
		/*
		 * 5) To Demo: containsAll
		 */
		/*dup.add(90);
		boolean check ;
		check = dup.containsAll(s);
		System.out.println("Does 'dup' contain all that 's' contains: "+check);
		*/
		/*
		 * 6) To Demo: contains
		 */		
		/*check = dup.contains(c2);
		System.out.println("Dup contains c2: "+ check);
		
		Car c3 = new Car("Car3");
		check = dup.contains(c3);*/
		//System.out.println("Dup contains c3: "+ check);
		
		/*
		 * 7) To Demo  remove method
		 */
		//dup.remove(c1);
		//System.out.println("The elements in dup are: "+ dup);
		
		/*
		 * 8) To Demo  remove method
		 */
		/*dup.removeAll(s);
		System.out.println("The elements in dup after removeAll(s) are: "+ dup);*/
		
		/*
		 * 9) To Demo that set does not allow duplicate values		  
		 */
		Father f3= new Father("Father3");
		dup.add(f3);
		/*System.out.println("When adding f3 first time: "+ dup.add(f3) +" :as per definition");
		System.out.println("When adding f3 second time: "+ dup.add(f3)+" :as per definition");*/
		
		/*
		 *  10) To Demo that set does not allow to add references with same value 
		 *   which is good as per set definition
		 */
		Father f4 = f3;
		//System.out.println("When adding f4 first time: "+ dup.add(f4)+" :as per definition");
		
		/*
		 * 11) To Demo that set allows objects with same values which is against the definition of sets
		 */
		Father f5 = new Father("Father3");
		System.out.println("When adding f5 first time: "+ dup.add(f5) +" :against definition");
		System.out.println(dup);
	}

}
