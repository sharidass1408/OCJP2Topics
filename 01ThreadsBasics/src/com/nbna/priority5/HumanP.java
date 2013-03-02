package com.nbna.priority5;
/*
 * To demo the effect of join 
 */
public class HumanP implements Runnable {

	String name;

	public HumanP(String name) {
		System.out.println("Hi I am: " + name);
		this.name = name;
	}

	public void run() {

		System.out.println("I("+ this.name +") will run now since OS wants me to run now:");
		
		for (int step = 0; step < 100000; step++) {

			for(int j=0; j<9999999; j++);
			System.out.println(this.name + " step number is: " + step);
			
			
		}

	}

}
