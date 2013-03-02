package com.nbna.multiobjectmutlithreaded2;

public class Multiple {

	
	public static void main(String[] args) {
		
		Customer C1_obj = new Customer("Customer1");
		Customer C2_obj = new Customer("Customer2");
		Customer C3_obj = new Customer("Customer3");
		
		
		Thread mythread1 = new Thread(C1_obj);
		Thread mythread2 = new Thread(C2_obj);
		Thread mythread3 = new Thread(C3_obj);
		
		mythread1.start();
		mythread2.start();
		mythread3.start();

	}

}
