package com.nbna.treeset_compareable3;

public class Student implements Comparable{
	
	String name;
	int ssn;
	public Student(String name, int ssn){
		this.name = name;
		this.ssn = ssn;
	}

	public String toString(){		
		//return ("Name(SSN): " +name+ "("+ssn+")")  ;		
		return (name+ "("+ssn+")")  ;
	}
	
	/*public boolean equals(Object o){		 
		Student passedobject = (Student)o;
		
		 * 1) Comparing ssn as well
		 
		return name.equals(passedobject.name) && (ssn == passedobject.ssn);		
	}
	
	public int hashCode(){ 
		return 0;			
	}*/
	
	/*
	 * 2) To demo that we can compare objects with their Names
	 * 	  Note that compareTo string method is overridden by String class to 
	 *    arrange words lexicographically, follows BTree algorithm
	 */
	/*public int compareTo(Object obj) {
		
		Student st = (Student)obj;		
		return (this.name).compareTo(st.name);
				
	}	*/
	
	/*
	 * 3) To demo that we can compare objects with their SSN's 
	 */
	public int compareTo(Object anotherobj) {
		
		Student st = (Student)anotherobj;
		
		if(this.ssn > st.ssn){
			return 1; // put this object to the right of  another object
		} else if (this.ssn < st.ssn ){
			return -1; // put it to the left of this object
		}else 		
			return 0; //put it either to left or right but this should not be a possibility for sets		
	}	
	
	
}
