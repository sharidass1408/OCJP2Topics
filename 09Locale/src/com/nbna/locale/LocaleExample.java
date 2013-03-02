package com.nbna.locale;

import java.util.Locale;

public class LocaleExample {

	
	public static void main(String[] args) {
		
		Locale locNo = new Locale("hi_in","NO");
		
		
		System.out.println("In "+ locNo.getDisplayCountry()+": "+ locNo.getDisplayLanguage(locNo));
		
		
		

	}

}
