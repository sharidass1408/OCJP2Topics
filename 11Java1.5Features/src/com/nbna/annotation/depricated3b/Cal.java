package com.nbna.annotation.depricated3b;

public class Cal {
	
	int add(int a, int b){		
		return a+b;
	}
	/*
	 * To Demo how to deprecate our own methods. This is done so that people would stop
	 * using the method from now on. 
	 */
	@Deprecated
	int squareroot(int a){
		return 1; // return something not important for this ex		
	}
	
	int efficientsquareroot(int a){
		return 1;		
	}
	
}
/**
 * Why Deleting is not an option?
 */
