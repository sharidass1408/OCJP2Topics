package com.nbna.staticimport6;

public class WithOutStaticImportEx1 {

	
	public static void main(String[] args) {
		
		int hours =5;
		int sec;
		
		/*
		 * The disadvantage of this approach is that you have to wirte the name of 
		 * interface every time you use a constant
		 */
		sec = hours* TimeConversionConstants.HOURS_INTO_SEC;
		

	}

}
