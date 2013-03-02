package com.nbna.threadcommunication7;

public class Producer implements Runnable{
	
	
	boolean doneproducing = false; 
	
	public Producer() {
		
		System.out.println("I am Producer I will produce stuff");
	}
	
	public void run(){
			/*
			 * The producer is producing items one after another. 
			 */
				
				try {
					Thread.sleep(20);
					System.out.println("Product 1 ready\n");
					Thread.sleep(30);
					System.out.println("Product 2 ready\n");
					Thread.sleep(10);
					System.out.println("Product 3 ready\n");
					Thread.sleep(10);
					System.out.println("Product 4 ready\n");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				doneproducing = true;
			
			}
		
	}


