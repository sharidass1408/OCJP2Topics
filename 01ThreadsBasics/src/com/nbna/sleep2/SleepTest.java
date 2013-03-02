package com.nbna.sleep2;
/*
 * To Demo how multiple threads can be spun on multiple object at same time
 */
public class SleepTest {

	
	//@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		
		String[] names = {"sai","hari","lazyguy","ram","sri"};
		
		for(String s: names){		
		HumanS name = new HumanS(s);
		Thread namethread = new Thread(name);	
		namethread.start();
		
		
		}
		
		System.out.println("Already out of for loop.................");
	}

}
