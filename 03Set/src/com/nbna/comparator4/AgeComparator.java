package com.nbna.comparator4;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	
	public int compare(Object obj1, Object obj2) {
		
		Student st1= (Student) obj1;
		Student st2= (Student) obj2;
		
		if (st1.age < st2.age)
			return -1;
		else if (st1.age > st2.age)
			return 1;
		else
			return 0;
		
	}

}
