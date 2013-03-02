package com.nbna.avoidingdeadlocks6;

public class DeadLock {

	
	public static void main(String[] args) {
		Object trainseat = new Object();
		Object ticketcounter = new Object();
		
		
		BookTicketProcedure btp = new BookTicketProcedure(trainseat,ticketcounter);
		CancleTicketProcedure ctp = new CancleTicketProcedure(trainseat,ticketcounter);

		Thread t1 = new Thread(btp);
		Thread t2 = new Thread(ctp);
		
		t1.setName("Ticket Buyer");
		t2.setName("Ticket Cancler");
		
		t1.start();
		t2.start();
		
	}

}
