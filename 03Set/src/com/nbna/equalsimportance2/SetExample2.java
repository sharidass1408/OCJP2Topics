package com.nbna.equalsimportance2;

import java.util.HashSet;
import java.util.Set;

import com.nbna.objectsexamples0.Cal;

public class SetExample2 {

	public static void main(String[] args) {
		
		Cal cal1 = new Cal("Cal1");
		Cal cal2 = new Cal("Cal1");
		
		Set s = new HashSet();
		/*
		 * 1) To Demo the difference between adding objects with same value 
		 *   before and after overriding the equals and hash code
		 */
		System.out.println("When adding cal1: "+s.add(cal1));
		System.out.println("When adding cal2: "+s.add(cal2));
		

	}

}
