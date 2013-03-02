package com.nbna.yeild3;
/*
 * To Demo how multiple threads can be spun on multiple object at same time
 */
public class YeildTest {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		String[] names = {"sai","slowguy","lazyguy","fastguy","fastestguy"};
		
		for(String s: names){		
		HumanY name = new HumanY(s);
		Thread namethread = new Thread(name);	
		namethread.start();
		
		
		}
		
		System.out.println("Already out of for loop...");
	}

}
