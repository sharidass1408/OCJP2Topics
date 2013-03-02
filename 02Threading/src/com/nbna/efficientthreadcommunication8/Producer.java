package com.nbna.efficientthreadcommunication8;

public class Producer implements Runnable{
	
	
	boolean doneproducing = false; 
	
	public Producer() {
		
		System.out.println("I am producer object");
	}
	
	public void run(){
			/*
			 * The producer is producing items one after another. 
			 */
				synchronized(this){
				try {
					Thread.sleep(10);
					System.out.println("Product 1 ready\n");
					Thread.sleep(10);
					System.out.println("Product 2 ready\n");
					Thread.sleep(10);
					System.out.println("Product 3 ready\n");
					Thread.sleep(10);
					System.out.println("Product 4 ready\n");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				notify();// The thread which takes the lock on the object will notify to other threads just before unlocking on the object
				
			}
							
		}
		
	}


