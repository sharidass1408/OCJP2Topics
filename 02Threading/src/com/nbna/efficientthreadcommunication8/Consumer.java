package com.nbna.efficientthreadcommunication8;

public class Consumer implements Runnable{
	
	Producer producer; 

	public Consumer(Producer prod) {
		this.producer = prod;
		System.out.println("I am Consumer object");
	}
	
	public void run(){
		
			synchronized(producer){
			
				try {
					System.out.println("Waiting for Producer");
					producer.wait();
					}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("You are great guy");
		
	}

}
