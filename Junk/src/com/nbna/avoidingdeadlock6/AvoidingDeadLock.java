package com.nbna.avoidingdeadlock6;

public class AvoidingDeadLock {

	public static void main(String[] args) {
		Object train = new Object();
		Object compartment = new Object();
		
		BookTicket obj1 = new BookTicket(train, compartment);
		CancelTicket obj2 = new CancelTicket(train,compartment);
		
		Thread t1= new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
