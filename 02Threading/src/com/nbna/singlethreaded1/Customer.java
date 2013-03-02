package com.nbna.singlethreaded1;

public class Customer implements Runnable{

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
		System.out.println("This is a task 1");
	}
	void task2(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("This is a task 2");
	}
	void task3(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("This is a task 3");
	}
}
