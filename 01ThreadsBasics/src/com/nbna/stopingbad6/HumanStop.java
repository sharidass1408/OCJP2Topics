package com.nbna.stopingbad6;
/*
 * To demo the effect of join. 
 */
public class HumanStop implements Runnable {

	String name;

	public HumanStop(String name) {
		System.out.println("Hi I am: " + name);
		this.name = name;
	}

	public void run() {

		System.out.println("I("+ this.name +") will run now since OS wants me to run now:");
		
		for (int step = 0; step < 10000; step++) {

			for(int j=0; j<9999999; j++);
			System.out.println(this.name + " step number is: " + step);
			
			
		}

	}

}
