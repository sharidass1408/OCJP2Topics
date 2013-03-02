package com.nbna.filestreams3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteUsingFileStreams1 {

	public static void main(String[] args) {

		try {
			/*
			 * Create a object of file with name glass which you can actually imagine as glass
			 * and a FileInputStream as strawfromglass
			 */
			File glass = new File("C:\\Folder_with_Files\\Glass.txt");
			FileInputStream strawfromglass = new FileInputStream(glass);			
			
			File mouth = new File("C:\\Folder_with_Files\\Mouth.txt");
			System.out.println("Sucessfully created file with prefix: Mouth" +
					" sufix:txt at location " +	mouth.createNewFile());
			FileOutputStream strawfrommouth = new FileOutputStream(mouth);
			
			int juice= strawfromglass.read(); //This only reads bytes
						
			while(juice!=-1){
				strawfrommouth.write(juice);
				juice = strawfromglass.read();
				//System.out.println((char)juice);
				
			}
			
			System.out.println("Done with creating new file");
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception occured, Sorry for Inconvenience");
		} catch (IOException e) {
			System.out.println("I/O found exception occured, Sorry for Inconvenience");
		}

	}

}
