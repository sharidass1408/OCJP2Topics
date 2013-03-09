package com.nbna.annotation.override3a;

public class Test {

	public static void main(String[] args) {
		
		Son son = new Son();
		Father father = new Father();
		/**
		 * What is the output of the programm? why? How to avoid?
		 */
		father.readBooks();
		son.readBooks();
		
		father.cookFood();
		son.cookFood();
	}

}
