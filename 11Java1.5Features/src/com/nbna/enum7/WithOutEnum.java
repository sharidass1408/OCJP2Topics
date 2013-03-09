package com.nbna.enum7;


public class WithOutEnum {

	static final String MI = "Michigan";
	static final String IL = "Illinois";
	static final String TX = "Texas";
	static final String CA = "California";
		
	
	public static void main(String[] args) {
		/*
		 * The MI.compareTo(CA) logic will not result in correct result output since the 
		 * compoarision is Lexograhical comparision of strings.
		 */
		int result= MI.compareTo(CA);
		//int result= compareArea(MI,CA);
		if(result>0)
			System.out.println(MI+ " has greate area than " + CA);
		else if (result ==0)
			System.out.println(MI+ " has equal area as " + CA);	
		else
			System.out.println(MI+ " has less area as " + CA);	

	}


	private static int compareArea(String state1, String state2) {
		/*
		 * Do the relevant logic here and retun an int value. 
		 */		
		return 0;
	}

}
