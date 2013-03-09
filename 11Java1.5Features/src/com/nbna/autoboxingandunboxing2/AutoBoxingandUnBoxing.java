package com.nbna.autoboxingandunboxing2;

public class AutoBoxingandUnBoxing {

	
	public static void main(String[] args) {
		/*
		 * 1) To Demo the code which was never an issue in any version of java
		 */
		Integer i = new Integer(5); 
		int k= 10;		
		k++;
		System.out.println(k);
		
		/*
		 * 2) The below can not be demoed here since we are using java 1.7
		 * but if we compile the code using 1.4 or earlier version then one of them
		 * will complie
		 */
		Integer a = 5;  //Boxing example, system is not complaining because it has boxed 5 into Integer
		int b= a;		//UnBoxing example, system is not complaining because it has unboxed Interger(5) to int 5
		a++;	      	// UnBoxing and Boxing took place at this step thats why system does not complain.
		System.out.println(a);

	}

}
