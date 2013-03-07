package com.nbna.makinguseofJavaBeans4;

import java.util.ArrayList;



public class Test {

public static void main(String[] args) {
		
		ListAllStudentsDAO listofStudents = new ListAllStudentsDAO();
		System.out.println("Back to Test class after intializing ListAllStudentDAO");
		
		String thisDAOs_query = listofStudents.getQuery();
		System.out.println("Query we are trying to perform is: "+thisDAOs_query);
		
		System.out.println("Calling the getProcessResults method on the object of ListAllStudentsDAO");		
		listofStudents.getProcessResults();
		
	}

}
