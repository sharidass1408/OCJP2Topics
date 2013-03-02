package com.nbna.zipandunzip7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzippingEx {

	
	public static void main(String[] args)  {
		
		File file = new File("C:\\Folder_with_Files\\ZippedFiles.zip");
		
			try {
				FileInputStream fis = new FileInputStream(file);
				ZipInputStream zis = new ZipInputStream(fis);
				/*
				 * This is the only difference between normal input streams and zipinput streams
				 */
				ZipEntry ze = zis.getNextEntry();
				
							
				
				while(ze!=null){
					System.out.println();
					System.out.println("The file name is: "+ ze.getName());		
										
					/*while(zis.available()>=1){
						System.out.print((char)zis.read());
					}*/
					ze = zis.getNextEntry();
					
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException occured");
			} catch(IOException e){
				System.out.println("IOException occured");
			}
		

	}

}
