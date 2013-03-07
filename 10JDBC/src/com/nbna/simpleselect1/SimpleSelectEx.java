package com.nbna.simpleselect1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SimpleSelectEx {

	
	public static void main(String[] args) {
		
		SimpleSelectEx sse = new SimpleSelectEx();		
		ArrayList studentList = sse.getStudentList();		
		System.out.println(studentList);		
	}
	
	public ArrayList getStudentList(){
		ArrayList studentList =new ArrayList();
		ArrayList student = null;
		
		Connection conn = null;
		Statement st;
		try {

			conn = getConnection();
			System.out.println("Connected to the database");		

			String query = "Select * from students";
			System.out.println("Performing query:" + query + "....");

			st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			System.out.println("Performed query sucessfully now iterating through the result set" + rs);
			while (rs.next()) {
				student = new ArrayList();
				student.add(rs.getInt(1));
				student.add(rs.getString(2));
				student.add(rs.getInt(3));
				student.add(rs.getInt(4));
				student.add(rs.getInt(5));
				student.add(rs.getInt(6));
				System.out.println("Student :: " + student);
				studentList.add(student);
			}

		} catch (SQLException e) {
			System.out.println("SQL Exception occured");
		} catch (Exception e) {
			System.out.println("Unknown Exception occured");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Exception occured while closing file");
			}
		}
		
	
		return studentList;
}
	
	
	private Connection getConnection(){
		
		System.out.println("MySQL Connect.");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "nbna_database";
		//String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "sriram1408";		
		
			try {
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());				
				conn = DriverManager.getConnection(url+dbName,userName,password);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return conn;
	}
	
}
