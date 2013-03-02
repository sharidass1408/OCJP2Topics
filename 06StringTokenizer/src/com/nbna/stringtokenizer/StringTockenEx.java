package com.nbna.stringtokenizer;

import java.util.StringTokenizer;

public class StringTockenEx {

	
	public static void main(String[] args) {
		
		String actual_string = "He is a gentle man";
		System.out.println(actual_string);
		
		/*
		 * To Demo how string tokenizer is used by passing " " delimiter. 
		 */
		StringTokenizer tokenized_string = new StringTokenizer(actual_string," ");
		System.out.println(actual_string);
		
		while(tokenized_string.hasMoreTokens()){
			String word = tokenized_string.nextToken();
			System.out.println(word);
			
		}
		
		}

}
