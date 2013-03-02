package com.nbna.join4;
/*
 * To demo join meaning to show how to wait for another thread explicitly
 */
public class JoinTest {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		//Thread namethread= null; 
		
		String[] names = {"sai","slowguy","fastestguy"};
		
		for(String s: names){		
		HumanJ name = new HumanJ(s);
		Thread namethread = new Thread(name);	
		namethread.start();	
		/*
		 * To demo that we are forcing the main thread (which is the JoinTest classes thread in this case)
		 * to complete execution only after fastestguy thread is done. 
		 */
		
		if(s.equals("fastestguy"))	namethread.join();
		}
		
		
		System.out.println("Already out of for loop...");
	}

}
