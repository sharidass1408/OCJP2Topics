package com.nbna.treemap2;

import java.util.Comparator;

public class RollNoComparator implements Comparator {

	
	public int compare(Object obj1, Object obj2) {
		
		Student st1= (Student) obj1;
		Student st2= (Student) obj2;
		
		if (st1.rollnumber < st2.rollnumber)
			return -1;
		else if (st1.rollnumber > st2.rollnumber)
			return 1;
		else
			return 0;
		
	}

}
