package com.nbna.simplestthread1;
/*
 * To Demo basic thread behavior
 */
public class Test0 {

	public static void main(String[] args) {
		
		Human sai = new Human("sai");
		Thread saithread = new Thread(sai);		
		
		saithread.start();
		/*
		 * Can I explicitly call the run method on the saithread which is a thread?
		 * Yes I can, but if I make such a call then it is no different than calling a 
		 * method, which means concurrency is lost  
		 */
		//saithread.run();	
		sai.run();
		
		System.out.println("Notice that thread is running even after JVM has reached line 18");
	}
	
	

}
