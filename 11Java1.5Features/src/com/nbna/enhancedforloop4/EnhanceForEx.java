package com.nbna.enhancedforloop4;

import java.util.ArrayList;
import java.util.List;
/*
 * This program not ony demos enhance for loop, it demos 3 concepts
 */
public class EnhanceForEx {

	
	public static void main(String[] args) {
		//1) Generics
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(400);
		
		//2) Unboxing because every element of list is converted back to int
		//3) Finally ehaced for loop is demoded		
		for( int i: list){
			System.out.println(i);
		}
		
		/*
		 * To Demo other usage of enhanced for loop. The only difference is that 
		 * in the above one it is iterating through collection. In the below 
		 * code it is iterating through a array of strings. 
		 */		
		String[] names = {"abc","def","xyz"};
		
		for(String name: names)
			System.out.println(name);
		
	}

}
