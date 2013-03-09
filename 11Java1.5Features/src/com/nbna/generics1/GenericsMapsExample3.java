package com.nbna.generics1;

import java.util.HashMap;
import java.util.Map;

public class GenericsMapsExample3 {

	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer,String>();
		
		m.put(1, "hello");
		m.put(2, "world");
		
		System.out.println(m);

	}

}
