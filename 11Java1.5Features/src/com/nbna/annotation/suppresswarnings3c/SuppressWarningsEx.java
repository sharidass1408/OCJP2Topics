package com.nbna.annotation.suppresswarnings3c;

import java.util.ArrayList;
import java.util.Hashtable;
/*
 * To demo how SuppressWarnings annotation tells the compiler to suppress the 
 * warning messages related to the code. 
 */

public class SuppressWarningsEx {
	
	@SuppressWarnings(value ={"unchecked","rawtypes"})
	//Un-comment the above line to notice how compiler will start throwing warnings.
	
	public static void main(String[] args) {		
		
		ArrayList arl = new ArrayList();		
		arl.add("Apple");
		arl.add("Mango");
		arl.add("Grapes");
		arl.add("Guava");
		arl.add("Pears");
		arl.add("Orange");
		arl.add(3);	
		
		Hashtable ht = new Hashtable();
		ht.put(10, "abc");
		ht.put(11, "abc");
		
	}

}
