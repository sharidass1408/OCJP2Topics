package com.nbna.singleton;

public class DataConnectionEx {

	static DataConnectionEx existinginstance;
	
	private DataConnectionEx() {		
	}
	
	public static DataConnectionEx getInstance(){
		
		if(existinginstance == null){
		existinginstance = new DataConnectionEx();
		System.out.println("Created Instance");
		return existinginstance;
		}
		
		System.out.println("Cannot create instance, this is singleton class");
		return existinginstance;
		
	}
	
	
}
