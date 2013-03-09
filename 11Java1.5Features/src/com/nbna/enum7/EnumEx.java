package com.nbna.enum7;

/*
 * Points to remember about enum:
 * 1. One will use enum when they want well defined set of enumerated data type
 * 	  i.e when they want each constant has some ordinality 
 * 2. Values inside enum are all static final values
 * 
 */

enum StatesArea {Michigan, Illinois, Texas, California};

public class EnumEx {

	public static void main(String[] args) {
		
		StatesArea MI = StatesArea.Michigan;
		StatesArea CA = StatesArea.California;
		
				
		int result= MI.compareTo(CA);
		if(result>0)
			System.out.println(MI+ " has greate area than" + CA);
		else if (result ==0)
			System.out.println(MI+ " has equal area as " + CA);	
		else
			System.out.println(MI+ " has less area as " + CA);
	}

}
