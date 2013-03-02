package com.nbna.deamon8;

public class GodDeamonController implements Runnable {

	Deamond d = new Deamond("deamon");
	Thread t = new Thread(d);
	
	GodDeamonController(){
		System.out.println("Hi Iam god");
		Thread godthread = new Thread(this);		
		godthread.start();
	}
	
	public void startDeamond(){		
		t.start();		
	}
	
	public void stop(){		
		d.godsaidstop= true;		
	}

	
	public void run() {
		
		
		System.out.println("I will call my deamon now");
		startDeamond();
				
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		System.out.println("That should be good enough for this human. You can stop now");		
		
		System.out.println("Exiting from god thread");
		this.stop();
	}
	
}


/*System.out.println("I will do the following steps for you human");
for(int step=0; step<=5; step++){
	System.out.println("Step from god"+ step);
}*/