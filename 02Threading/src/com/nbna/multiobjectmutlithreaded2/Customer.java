package com.nbna.multiobjectmutlithreaded2;

public class Customer implements Runnable{
	
	String name;
	
	Customer(String name){		
		this.name = name;
	}
	
	public void run(){
		task1();
		task2();
		task3();
	}
	
	void task1(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("This is a task 1 performed on "+this.name);
	}
	
	void task2(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("This is a task 2 performed on "+this.name);
	}
	
	void task3(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("This is a task 3 performed on "+this.name);
	}
}
