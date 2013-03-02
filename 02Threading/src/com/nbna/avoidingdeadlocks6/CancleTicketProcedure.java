package com.nbna.avoidingdeadlocks6;

public class CancleTicketProcedure implements Runnable {
	
	Object trainseat,ticketcounter;

	public CancleTicketProcedure(Object trainseat, Object ticketcounter) {
		this.trainseat= trainseat;
		this.ticketcounter = ticketcounter;		
	}
	
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (trainseat) {

			System.out
					.println(name + ": I am going home I am unmarking my seat");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//System.out.println("Waiting for customer to leave the ticket counter");

			synchronized (ticketcounter) {
				System.out.println(name + ": Sucessfully done with getting up and cancelation");
			}

		}

	}
	

}
