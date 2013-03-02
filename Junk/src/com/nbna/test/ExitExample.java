package com.nbna.test;

public class ExitExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			System.out.println("Hi");
			//System.exit(0);
			System.out.println("Hello");
		} catch (Exception e) {
			System.out.println("This is an exception");
			
		}finally{
			
			System.out.println("THis is finally");
		}

	}

}
