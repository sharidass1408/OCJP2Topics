package com.nbna.files2;

import java.io.File;
import java.io.IOException;

public class BasicCommands1 {

	
	public static void main(String[] args) {
		
	File file = new File("C:\\Folder_with_Files");
	File file1 = new File("C:\\Folder_with_Files1");
	
	
	try {
		
		/*
		 * 1) To create a file 
		 */
		File newfile2 = new File("C:\\Folder_with_Files\\SaiInfo3.txt");
		System.out.println("Sucessfully created file with prefix: SaiInfo3 sufix:txt at location " +
		newfile2.createNewFile());
		
		
		/*
		 *  To create a Temp file. Note that this generates a random file name 
		 */
		/*File newfile = new File("C:\\Folder_with_Files");		
		
		System.out.println("Sucessfully created file with prefix: SaiInfo sufix:txt at location " +
				"C:\\Folder_with_Files1 :"+file.createTempFile("SaiInfo", ".txt",newfile));*/
		
		/*
		 * 2)Returns true if we have permissions to read a file
		 */
		//System.out.println("Can I read the file: "+file.canRead());
		
		/*
		 * 3)Returns true if we have permissions to write a file
		 */
		//System.out.println("Can I write to the file: "+file.canWrite());
		
		/*
		 * 4)Returns true if file paths are same
		 */
		//System.out.println("Is file same as 'C:\\Folder_with_Files1': "+file.compareTo(file1));
		
		/*
		 * 5)Returns true if given file is absolute 
		 */		
		/*File file2 = new File("MyPersonalInfo.txt");
		File file3 = new File("\\Test\\MyPersonalInfo.txt");
		
		
		System.out.println("Is file absolute: "+file.isAbsolute());
		System.out.println("Is file2 absolute: "+file2.isAbsolute());
		System.out.println("Is file3 absolute: "+file3.isAbsolute());
		System.out.println("Is file4 absolute: "+file4.isAbsolute());*/
		
		/*
		 * 6)To demo that .equals is only comparing the string values of the file paths nothing else
		 */		
		/*File file5 = new File("C:\\Folder_with_Files\\MyPersonalInfo - Copy.txt");
		File file6 = new File("C:\\Folder_with_Files\\MyPersonalInfo.txt");
		File file7 = new File("C:\\Folder_with_Files\\MyPersonalInfo.txt");
		System.out.println("If a file6 is same as file5 :"+file6.equals(file5));
		System.out.println("If a file6 is same as file7 :"+file6.equals(file7));
		*/
		/*
		 * 7) To demo how to create directory with C:\Folder_with_Files2
		 */
		/*File file8 = new File("C:\\Folder_with_Files2");
		System.out.println("Sucessful created file8 : "+file8.mkdir());*/
		//Note that we can use file.mkdirs() also difference is that it would create at least some of parent files
		
		/*
		 * 8) To get the properties of the folder
		 */
		/*System.out.println("File Name: "+file.getName());
		System.out.println("Free space avaliable: "+file.getFreeSpace());
		System.out.println("Name of the parent folder:"+file.getParent()); 
		System.out.println("Total Space avaliable: "+file.getTotalSpace());
		System.out.println("Total Usable Space avaliable: "+file.getUsableSpace());
		System.out.println("Sucessfully deleted: "+file8.delete());		
		*/
		/*
		 * 9)Returns how it gets stored as per rules of os on the platform.
		 */
		System.out.println("Canonical: "+file.getCanonicalFile());
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
