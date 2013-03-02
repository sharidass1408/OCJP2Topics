package com.nbna.avoidingdeadlock6;

public class CancelTicket implements Runnable{
	Object train,comp;
	
	public CancelTicket(Object train, Object comp) {
		this.train =train;
		this.comp=comp;
	}
	
	public void run(){
		synchronized(train){
			System.out.println("CancelTicket locked on train");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Cancel Ticket now waiting to lock on compartment..");
			synchronized(comp){
				System.out.println("CancelTicket locked on train");
				
				System.out.println("Sucessfully Cancelled Tickets");
			}
		}
	}

}
