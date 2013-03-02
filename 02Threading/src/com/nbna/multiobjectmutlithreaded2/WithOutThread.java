package com.nbna.multiobjectmutlithreaded2;

public class WithOutThread {

	
	public static void main(String[] args) {
		
		Customer c1_obj = new Customer("Customer1");
		Customer c2_obj = new Customer("Customer2");
		Customer c3_obj = new Customer("Customer3");
		
		c1_obj.run();
		c2_obj.run();
		c3_obj.run();
		

	}

}
