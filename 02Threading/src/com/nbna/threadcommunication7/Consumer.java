package com.nbna.threadcommunication7;

public class Consumer implements Runnable{
	
	Producer prod; 

	public Consumer(Producer prod) {
		this.prod = prod;
		System.out.println("I am consumer I will bother producer");
	}
	
	public void run(){
		
			
				try {
					while(! prod.doneproducing){
						System.out.println("Are all orders ready");
					Thread.sleep(10);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			System.out.println("You idiot you made me wait");
		
	}

}
