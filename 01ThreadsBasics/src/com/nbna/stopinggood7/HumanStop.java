package com.nbna.stopinggood7;
/*
 * To demo the effect of join. 
 */
public class HumanStop implements Runnable {

	String name;
	boolean check=false; 

	public HumanStop(String name) {
		System.out.println("Hi I am: " + name);
		this.name = name;
	}

	public void run() {

		System.out.println("I("+ this.name +") will run now since OS wants me to run now:");
		
		for (int step = 0; step < 100000; step++) {

			for(int j=0; j<9999999; j++);
			if(check) {
				System.out.println("User hit enter on the console so killing this thread gracefully");
				return;				
			}
			System.out.println(this.name + " step number is: " + step);	
			
		}

	}
	
	

}
