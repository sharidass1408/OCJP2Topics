package com.nbna.sequenceinputstream6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputstream {

	
	public static void main(String[] args) {
		
		try {
			 
			File f1 = new File("C:\\Folder_with_Files\\File1.txt");
			File f2 = new File("C:\\Folder_with_Files\\File2.txt");
			
			 
			FileInputStream fis1= new FileInputStream(f1);
			FileInputStream fis2= new FileInputStream(f2);
			
			Vector voffiles = new Vector();
			/*
			 * Add file objects to the files vector
			 */
			voffiles.add(fis1);
			voffiles.add(fis2);
			/*
			 * Creating an emumeration
			 */
			Enumeration e = voffiles.elements();			
			SequenceInputStream sis = new SequenceInputStream(e);
			
			
			int i = sis.read();
			
			while(i!=-1){
				System.out.print((char)i);
				i = sis.read();
			}
			
			
		} catch (FileNotFoundException e) {			
			System.out.println("FileNotFoundException occured");
		} catch (IOException e1) {
			System.out.println("IOException occured");
		}catch(Exception e){
			System.out.println("Exception occured");
		}

	}

}
