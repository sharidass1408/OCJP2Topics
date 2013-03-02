package com.nbna.deadlockex5;

public class BookTicket implements Runnable {
	
	Object train,comp;

	public BookTicket(Object train, Object comp) {
		this.train = train; 
		this.comp = comp;
	}
	
	public void run(){
		synchronized(train){
			System.out.println("BookTickett locked on train");
			
				try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			 System.out.println("BookTicket now waiting to lock on compartment..");
			 
			 synchronized(comp){
				 System.out.println("BookTicket locked on compartment");
				 
				 System.out.println("Sucessfully Booked Tickets");
			 }
			
			
		}
		
	}

}
