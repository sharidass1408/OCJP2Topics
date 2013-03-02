package com.nbna.searilzation_objectstreaming4;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
//import com.nbna.searilzation_objectstreaming4.Student;

 public class ReadingFromPersistedFile {

	
	public static void main(String[] args) {
		
		File file = new File("C:\\Folder_with_Files\\ObjectFile.txt");
		
		FileInputStream fis=null;
		ObjectInputStream ois= null;//Beautiful programming
		try {
			 //System.out.println("The value of ois.read() is: "+ ois.read());
			
			 fis = new FileInputStream(file);
			 ois = new ObjectInputStream(fis);
			 
			/*while(ois.readObject() != null){
				Student student = (Student)ois.readObject();
				System.out.println(student);
			}*/
			 boolean check=false;
			 Student student=null;
			 do{ 				
				  student= (Student)ois.readObject();
				  System.out.println(student);
				  check = (student!=null);
				 				 			 
			 } while(check);
			 
			 System.out.println("Other business logic");
			
		 }
		catch(EOFException e){
			System.out.println("End of File has reached");
		}
		catch (FileNotFoundException e) {			
			System.out.println("File not found Exception occured");
		} catch (IOException e) {
			System.out.println("I/O Exception occured");
			e.printStackTrace();
		} catch(RuntimeException e){
			System.out.println("Receiving an runtime exception");
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		finally{ //Beautiful programming			
			
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
