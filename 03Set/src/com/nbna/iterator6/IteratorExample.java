package com.nbna.iterator6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.nbna.objectsexamples0.Car;
import com.nbna.objectsexamples0.SetEx;

public class IteratorExample {

	public static void main(String[] args) {

		SetEx se = new SetEx();
		/*
		 * 1)To Demo how iterator is defined
		 */
		Iterator iterator_of_s = se.s.iterator();

		/*
		 * 2) To Demo how iterator is used
		 */

		System.out.println("Printing elements of iterator");
		while (iterator_of_s.hasNext()) {
			/**
			 * Which one should I use? 30 or 31 why
			 */

			 //Car o1 = (Car) iterator_of_s.next();
			 Object o = iterator_of_s.next();
			 System.out.println(o);
		}

	}

}
