package com.nbna.filestreams3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteUsingDataStreams2 {

	public static void main(String[] args) {

		try {
			File glass = new File("C:\\Folder_with_Files\\Glass1.txt");
			FileInputStream strawfromglass = new FileInputStream(glass);
			DataInputStream dstrawfromglass = new DataInputStream(strawfromglass);
			
			File mouth = new File("C:\\Folder_with_Files\\Mouth1.txt");
			System.out.println("Sucessfully created file with prefix: Mouth" +
					" sufix:txt at location " +	mouth.createNewFile());
			FileOutputStream strawfrommouth = new FileOutputStream(mouth);
			DataOutputStream dstrawfrommouth = new DataOutputStream(strawfrommouth);
			
			int juice= dstrawfromglass.read(); //This only reads bytes
						
			while(juice!=-1){
				dstrawfrommouth.write(juice);
				juice = dstrawfromglass.read();
				
			}
			
			System.out.println("Done with creating new file");
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception occured, Sorry for Inconvenience");
		} catch (IOException e) {
			System.out.println("I/O found exception occured, Sorry for Inconvenience");
		}

	}

}
