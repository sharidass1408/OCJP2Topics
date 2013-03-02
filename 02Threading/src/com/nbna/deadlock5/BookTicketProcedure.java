package com.nbna.deadlock5;

public class BookTicketProcedure implements Runnable {
	
	Object trainseat,ticketcounter;

	public BookTicketProcedure(Object trainseat, Object ticketcounter) {
		this.trainseat= trainseat;
		this.ticketcounter = ticketcounter;		
	}
	
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (ticketcounter) {

			System.out.println(name	+ " got hold of ticket counter, thus buying ticket");
/*
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/

			System.out.println("Waiting for customer to get up from seat");

			synchronized (trainseat) {
				System.out.println(name + " Sucessfully done with booking and sitting");
			}

		}

	}
	

}
