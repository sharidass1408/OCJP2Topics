package com.nbna.BufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BuffReaderEx {

	
	public static void main(String[] args) {		
		InputStreamReader is = new InputStreamReader(System.in);
		File file = new File("C:\\Folder_with_Files\\Book1.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			while(str!= null){	
			
			if(str.compareTo("Diwali celebrations in Little India, Singapore.")==0)
			System.out.println(str); 			
			str = br.readLine();	
			
			}
			
			
		} catch (FileNotFoundException e) {			
			System.out.println("File Not Found Exception occured");
		} catch (IOException e) {
			System.out.println("IOException occured");
		}
		
	}

}
