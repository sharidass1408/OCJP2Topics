package com.nbna.hashmap1;
import java.util.HashMap;
import java.util.Map;
/*
 * To count the words and occurances of each word as a collection
 */
import java.util.Set;

public class HashMapEx {

	
	public static void main(String[] args) {
		
		Map mp = new HashMap();
		
		
		
		
		for(int i=0; i<args.length;i++){
			
			if(mp.containsKey(args[i])){ // if map already contains the Element
				
				Integer val = (Integer)mp.get(args[i]); //Then get the value and increment the value and put it back
				int intVal= val.intValue();
				intVal++;
				mp.put(args[i], new Integer(intVal)); // replace the value the key.
				
			}else
			mp.put(args[i],  new Integer(1)); //First Entry
		}
	/*
	 * To demo how map works
	 */
		
	System.out.println(mp);
	
	/*
	 * To demo that we can just display keys
	 */
    Set keys = mp.keySet();    
  //  System.out.println("The key set is: "+keys);    
	
	}

}
