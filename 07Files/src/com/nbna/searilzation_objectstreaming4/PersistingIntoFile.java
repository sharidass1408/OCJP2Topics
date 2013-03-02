package com.nbna.searilzation_objectstreaming4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersistingIntoFile {

	
	public static void main(String[] args) {
		/*
		 * Creating 3 student objects
		 */
		Student s1 = new Student("Studen1",90,90);
		Student s2 = new Student("Studen2",60,60);
		Student s3 = new Student("Studen3",88,88);
		
		/*
		 *Adding Students to studentarray which is of type Student 
		 */
		Student[] studentarray = {s1,s2,s3};		
		File file = new File("C:\\Folder_with_Files\\ObjectFile1.txt");
		
		
		
		try {
			/*
			 * Proceed only if file is successfully created
			 */
			if(file.createNewFile()){
				System.out.println("Sucessfully created files");
				/*
				 * Create output stream and its corresponding ObjectOutputStream
				 */
				FileOutputStream filestream = new FileOutputStream(file);
				ObjectOutputStream obfilestream = new ObjectOutputStream(filestream);
				/*
				 * Iterate through the studentarray and insert each element into file object
				 */
				for(Student student: studentarray){
				obfilestream.writeObject(student);
				System.out.println(student);
				}	
				
				
			}else{
				System.out.println("A file with this name exists already");
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception occured");			
		}catch ( IOException e){
			System.out.println("I/O Exception occured");
		}
		finally{
		    System.out.println("Seting the value of file to readable");
		    file.setReadable(true);
		    file.setExecutable(true);
		}
		
	}

}
