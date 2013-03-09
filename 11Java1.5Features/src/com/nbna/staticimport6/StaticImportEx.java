package com.nbna.staticimport6;
/*
 * By using static imports we have eliminated the two disadvantages discussed in 
 * WithOutStaticImportEx1 and WithOutStaticImportEx2
 */
import static com.nbna.staticimport6.TimeConversionConstants.*;

public class StaticImportEx {

public static void main(String[] args) {
		
		int hours =5;
		int sec;	
		
		sec = hours* HOURS_INTO_SEC;
		
		System.out.println(sec);
		
	}

}
