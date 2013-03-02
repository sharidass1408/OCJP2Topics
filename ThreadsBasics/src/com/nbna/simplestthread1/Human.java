package com.nbna.simplestthread1;

public class Human implements Runnable {//extends Thread {

	String name; 
	public Human(String name) {
		this.name = name;
		System.out.println("Hi I am: "+ name + "'s thread");		
	}

	public void run(){
		
		System.out.println("I("+ this.name +") will run now since OS wants me to run now:");
		
		for(int i = 0; i<10; i++){			
			
			System.out.println(this.name + " Step number: "+ i);
			
			
			}		
	
	}
	
}

/*
 * for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
			for(int j = 0; j<999999999; j++);
*/