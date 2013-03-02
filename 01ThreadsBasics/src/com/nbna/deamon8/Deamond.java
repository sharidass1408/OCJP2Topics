package com.nbna.deamon8;

public class Deamond implements Runnable {
	
	String name;
	boolean godsaidstop=false;

	public Deamond(String name) {
		this.name= name;
		System.out.println("Hi, I am "+this.name+" a deamon thread");
	}
	
	public void run(){
		System.out.println("I("+ this.name +") will run now since OS wants me to run now:");
		
		for (int step = 0; ; step++) { // Notice infinte loop

			for(int j=0; j<9999999; j++);
			if(godsaidstop) {
				System.out.println("Sure god I will stop now");
				return;
			}
						
			System.out.println(this.name + " step number is: " + step);
		}
	}

}
