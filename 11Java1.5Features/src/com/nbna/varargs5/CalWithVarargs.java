package com.nbna.varargs5;

public class CalWithVarargs {
	
	/*
	 * Rules: 
	 * 1. There can only be one vararg in any method
	 * 2. The vararg can only be the last argument of any method 
	 */

	void addnumbers(int ...inputvariables){
		
		int sum = 0;
		int sum1=0;
		
		for (int variable: inputvariables)
			sum+= variable;
		
		for (int i=0; i<inputvariables.length; i++)
			sum1+=inputvariables[i];
		
		System.out.println("sum: "+sum);
		System.out.println("sum1: "+sum1);		
				
	}
	
}
