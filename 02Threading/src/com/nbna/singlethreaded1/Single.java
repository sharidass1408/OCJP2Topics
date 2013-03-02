package com.nbna.singlethreaded1;

public class Single {

	
	public static void main(String[] args) {
		
		Customer c_object = new Customer();
		Thread mythread = new Thread(c_object);
		mythread.start();		

	}

}
