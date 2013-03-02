package com.nbna.comparator4;

public class Student {
	
	String name;
	int ssn;
	int age;
	int rollnumber;
	
	public Student(String name, int ssn, int age, int rollnumber){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		this.rollnumber = rollnumber;
	}

	public String toString(){		
				
		return (rollnumber+"."+name+ "("+ssn+")"+ age+ " years")  ;
	}
	
	/*public boolean compareTo(Object o){
		
		Student st = (Student)o;
		return name.equals(st.name);
		
		
	}*/
		
}
