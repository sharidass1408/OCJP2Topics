package com.nbna.yeild3;
/*
 * To demo the effect of other guys yielding for lazy guy
 */
public class HumanY implements Runnable {

	String name;

	public HumanY(String name) {
		System.out.println("Hi I am: " + name);
		this.name = name;
	}

	public void run() {

		System.out.println("I("+ this.name +") will run now since OS wants me to run now:");
		
		
		

		for (int step = 0; step < 1000; step++) {

			for(int j=0; j<9999999; j++);
			System.out.println(this.name + " step number is: " + step);
			
			if(name.equals("lazyguy")&& step ==5){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
			}else if(!name.equals("lazyguy")&& (step==500 || step==800)) {
				System.out.println("I("+ this.name +") will yeild here so that my friend can catch up");
				Thread.yield();				
			}

		}

	}

}
