package com.nbna.simplestthread1;
/*
 * To Demo how multiple threads can be spun on multiple object at same time
 */
public class Test1 {

	
	public static void main(String[] args) {
		
		String[] names = {"sai","hari","lazyguy","ram","sri"};
		
		for(String s: names){		
		Human name = new Human(s);
		Thread namethread = new Thread(name);		
		namethread.start();
		}
		
		System.out.println("Already out of for loop...");
	}

}
