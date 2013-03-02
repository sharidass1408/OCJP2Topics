package com.nbna.bufferedReader8;

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
		
		File file = new File("C:\\Folder_with_Files\\Book1.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			//String str = br.readLine();
			while(br.readLine()!= null){	
			
			System.out.println(br.readLine()); 			
			
			
			}
			
			
		} catch (FileNotFoundException e) {			
			System.out.println("File Not Found Exception occured");
		} catch (IOException e) {
			System.out.println("IOException occured");
		}
		
	}

}
