package com.nbna.deadlockex5;

public class CancelTicket implements Runnable{
	Object train,comp;
	
	public CancelTicket(Object train, Object comp) {
		this.train =train;
		this.comp=comp;
	}
	
	public void run(){
		synchronized(comp){
			System.out.println("CancelTicket locked on compartment");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Cancel Ticket now waiting to lock on train..");
			synchronized(train){
				System.out.println("CancelTicket locked on train");
				
				System.out.println("Sucessfully Canceled Tickets");
			}
		}
	}

}
