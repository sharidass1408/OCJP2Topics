package com.nbna.searilzation_objectstreaming4;

import java.io.Serializable;

public class Student implements Serializable{
	public String name;
	public int verbal,quant;
	public int total;	
	
	public Student(String name,int verbal,int quant) {
		
		this.name = name;
		this.verbal= verbal;
		this.quant = quant;	
		this.total = verbal+quant;
	}
	
	public String toString(){
		
		return "Name: "+name+ " Verbal score: "+verbal+ " Quant score: "+quant+" Total score: "+total;  
	}
}
