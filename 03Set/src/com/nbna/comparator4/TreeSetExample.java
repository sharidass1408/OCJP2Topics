package com.nbna.comparator4;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {

	
	public static void main(String[] args) {
		
		Student s1 = new Student("Abu", 1234,26,1);
		Student s2 = new Student("Bob", 2345,50,2);
		Student s3 = new Student("Cathy",3456,22,3);
		Student s4 = new Student("Dawn",4567,35,4);
		Student s5 = new Student("Cindy", 1000,40,5);
		HashSet st_set = new HashSet();
		st_set.add(s1);
		st_set.add(s2);
		st_set.add(s3);
		st_set.add(s4);
		st_set.add(s5);
		
		System.out.println(st_set);
		
		/*
		 * 1)To compare the objects by Age
		 */
		/*System.out.println("Sort by Age");
		TreeSet tree_st_set = new TreeSet(new AgeComparator());
		tree_st_set.addAll(st_set);
		System.out.println(tree_st_set); */
		
		/*
		 * 2)To compare the objects by SSN
		 */
		System.out.println("Sort by SSN");
		TreeSet tree_st_set1 = new TreeSet(new SsnComparator());
		tree_st_set1.addAll(st_set);
		System.out.println(tree_st_set1);
		
		
	}

}
