package com.nbna.annotation.override3a;

public class Son extends Father{
	
	//@Override
	public void reaBooks(){
		System.out.println("Son readsBooks");
	}
	
	//@Override
	public void cookFood(){
		System.out.println("Son cookFood");
	}
	
	//@Override
	public int earnsMoney(int rent, int income){
		System.out.println("Son earns money");
		return rent+income;
	}

}
