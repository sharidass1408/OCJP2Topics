package com.nbna.treemap2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample {

	
	public static void main(String[] args) {
		
		Student s1 = new Student("Abu", 1234,26,1);
		Student s2 = new Student("Bob", 2345,50,2);
		Student s3 = new Student("Cathy",3456,22,3);
		Student s4 = new Student("Dawn",4567,35,4);
		Student s5 = new Student("Cindy", 1000,40,5);
		
		HashMap st_map = new HashMap();
		
		st_map.put(s1,new Integer(100));
		st_map.put(s2,new Integer(200));
		st_map.put(s3,new Integer(300));
		st_map.put(s4,new Integer(400));
		
		/*
		 * To Demo how a Map output looks
		 */
		System.out.println(st_map);
		
		/*
		 * To Demo usage of Tree Map interface
		 */
		
		TreeMap tree_map = new TreeMap(new RollNoComparator());
		tree_map.putAll(st_map);
		System.out.println("The Sorted Map: "+tree_map);
		
		
	}

}
