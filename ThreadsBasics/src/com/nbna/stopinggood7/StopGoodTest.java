package com.nbna.stopinggood7;

import java.io.IOException;

/*
 * To demo join meaning to show how to wait for another thread explicitly
 */
public class StopGoodTest {

	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Thread namethread= null; 
		
		String[] names = {"sai","slowguy","fastestguy"};
		
		for(String s: names){		
		HumanStop name = new HumanStop(s);
		Thread namethread = new Thread(name);	
		namethread.start();	
		
		System.in.read();		
		name.stop = true;
		
		}
		
		
		System.out.println("Already out of for loop...");
	}

}
