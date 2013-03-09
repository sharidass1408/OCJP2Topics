package com.nbna.staticimport6;

public class WithOutStaticImportEx2 implements TimeConversionConstants{

	public static void main(String[] args) {
		
		int hours =5;
		int sec;
		/*
		 * The disadvantage of this approach is that you are implementing the interface
		 * to just use the constants. The purpose of the interface is defeated, since now you 
		 * are forced to provide bodies for all the methods. This is called anti pattern 
		 */
		sec = hours* HOURS_INTO_SEC;
		
		System.out.println(sec);
		
		
	}


}
