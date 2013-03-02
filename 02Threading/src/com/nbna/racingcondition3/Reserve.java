package com.nbna.racingcondition3;

public class Reserve implements Runnable{
	int available = 1;
	int wanted;

	public Reserve(int i) {
		wanted = i;
	}

	public void run() {
		System.out.println("Available Breths= " + available);
		if (available >= wanted) {
			String name = Thread.currentThread().getName();

			System.out.println(wanted + " berths reserved for " + name);

				try {
			Thread.sleep(1000);
				available = available - wanted;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else
			System.out.println("Sorry, no berths");

	}

}
