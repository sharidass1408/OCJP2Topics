package com.nbna.objectsexamples0;

public class Cal {
	
	String name;
	
	public Cal(String name){
		this.name = name;
	}

	public String toString(){		
		return name;		
	}
	
	public boolean equals(Object o){		// Very very important 
		Cal passedobject = (Cal)o;
		return name.equals(passedobject.name);		
	}
	
	public int hashCode(){ // beauty of contract
		return 0;			
	}

}
