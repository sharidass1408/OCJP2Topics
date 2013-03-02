package com.nbna.stopingbad6;

import java.io.IOException;

/*
 * To demo join meaning to show how to wait for another thread explicitly
 */
public class StopBadTest {

	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Would not be able to show killing of all the treads
		
		String[] names = {"sai"};//,"slowguy","fastestguy"};
		
		for(String s: names){		
		HumanStop name = new HumanStop(s);
		Thread namethread = new Thread(name);	
		namethread.start();
		System.in.read();
		namethread.stop();
		System.out.println();
		System.out.println("Killed thread.....Gabbar Singh Style.......................");
		
		}
		
		
		System.out.println("Already out of for loop...");
	}

}
