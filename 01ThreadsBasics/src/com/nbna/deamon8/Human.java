package com.nbna.deamon8;

import java.io.IOException;

public class Human {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		GodDeamonController dc = new GodDeamonController();
		Thread godthread = new Thread(dc);		
		godthread.start();
		
		System.out.println("Exiting out of the Human thread");
	}

}


/*dc.start();		
Thread.sleep(3000);*/

/*System.in.read();
dc.stop();*/