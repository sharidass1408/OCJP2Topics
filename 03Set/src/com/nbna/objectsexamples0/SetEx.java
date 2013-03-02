package com.nbna.objectsexamples0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.nbna.objectsexamples0.Apple;
import com.nbna.objectsexamples0.Cal;
import com.nbna.objectsexamples0.Car;
import com.nbna.objectsexamples0.Father;

public class SetEx {
	public Set s = new HashSet();
	
	public SetEx(){
		Car c1 = new Car("Car1");
		Car c2 = new Car("Car2");		
		Apple a1 = new Apple("Apple1");
		Apple a2 = new Apple("Apple2");				
		Father f1= new Father("Father1");
		Father f2= new Father("Father2");
		
		
		s.add(c1);
		s.add(c2);
		s.add(a1);
		s.add(a2);
		s.add(f1);
		s.add(f2);
		s.add("hi");
		s.add(10);
	}
	
}
