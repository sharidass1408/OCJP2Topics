package com.nbna.sleep2;
/*
 *To demo the effect of lazy guys thread going to sleep at 5th step  
 */
public class HumanS implements Runnable {

	String name;

	public HumanS(String name) {
		System.out.println("Hi I am: " + name);
		this.name = name;
	}

	public void run() {

		System.out.println("I("+ this.name +") will run now since OS wants me to run now:");
		
		

		for (int step = 0; step < 10; step++) {

			for(int j=0; j<9999999; j++);
			System.out.println(this.name + " step number is: " + step);
			
			if(name.equals("lazyguy") &&  step == 5){
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}

		}

	}

}
