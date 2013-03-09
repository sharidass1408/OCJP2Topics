package com.nbna.annotation.override3a;

public class Father {

	public void readBooks(){
		System.out.println("Father reads books");
	}
	
	public void cookFood(){
		
		System.out.println("Father cooks Food");
	}
	
	public int earnsMoney(int rent, int income, 
			float shop, long training, double resturant, int cooking){	
		System.out.println("Father earns money");
		return rent+income;	
	}
}
