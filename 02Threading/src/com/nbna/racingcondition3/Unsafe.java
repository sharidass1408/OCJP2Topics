package com.nbna.racingcondition3;
/*
 * Let us think that only one berth is available in a train, and two passengers
 *  are asking for that berth.
 * In reservation counter no.1 the clerk has sent a request to the server to allot that berth to
 * his passenger. 
 * In counter no. 2 the second clerk has also sent a request to the server to allot that berth to his passenger. 
 * Let us see now see to whom that berth is allotted?
 */
public class Unsafe {

	
	public static void main(String[] args) {
		
		Reserve obj = new Reserve(1);
		
		Thread t1= new Thread(obj);
		
		Thread t2 = new Thread(obj);
		
		t1.setName("First Person");
		t2.setName("Second Person");
		
		
		t1.start();
		t2.start();

	}

}
