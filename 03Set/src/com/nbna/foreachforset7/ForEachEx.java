package com.nbna.foreachforset7;

import java.util.Iterator;

import com.nbna.objectsexamples0.SetEx;

public class ForEachEx {

	public static void main(String[] args) {

		SetEx se = new SetEx();

		for (Object o : se.s)
			System.out.println(o);
	}

}
