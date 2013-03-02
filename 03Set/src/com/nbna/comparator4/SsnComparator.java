package com.nbna.comparator4;

import java.util.Comparator;

public class SsnComparator implements Comparator {

	
	public int compare(Object obj1, Object obj2) {
		
		Student st1= (Student) obj1;
		Student st2= (Student) obj2;
		
		if (st1.ssn < st2.ssn)
			return -1;
		else if (st1.ssn > st2.ssn)
			return 1;
		else
			return 0;
		
	}

}
