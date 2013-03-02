package com.nbna.treeset_compareable3;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {

	
	public static void main(String[] args) {
		
		Student s1 = new Student("Abu", 1234);
		Student s2 = new Student("Bob", 2345);
		Student s3 = new Student("Cathy",3456);
		Student s4 = new Student("Dawn",4567);
		Student s5 = new Student("Cindy", 1000);
		HashSet st_set = new HashSet();
		st_set.add(s1);
		st_set.add(s2);
		st_set.add(s3);
		st_set.add(s4);
		st_set.add(s5);
		
		System.out.println(st_set);
		
		TreeSet tree_st_set = new TreeSet(st_set);
		
		System.out.println(tree_st_set);		

	}

}
