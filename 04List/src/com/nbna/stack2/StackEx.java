package com.nbna.stack2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class StackEx {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Stack st = new Stack();
				
		int choice;
		int position;
		Object element;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			
			System.out.println("STACK OPERATIONS"); 
			System.out.println("1 Push an element");
			System.out.println("2 Pop an element");
			System.out.println("3 Search an element");
			System.out.println("4 Exit");
			System.out.println("Please make a choice");
			
			choice = Integer.parseInt(br.readLine());
			
			switch(choice){
			
			//To Demo push
			case 1: System.out.println("Enter the element to push: ");
					element = br.readLine().trim();
					st.push(element);
					break;
			
			//To Demo pop
			case 2: System.out.println("Pop the element as per selection");
					Object obj = st.pop();
					System.out.println("Popped= "+ obj);
					break;
					
			//To Demo search
			case 3: System.out.println("Which element do you wnat to search?");
					element = br.readLine().trim();
					position = st.search(element); //returns the position automatically 
					if(position == -1)
						System.out.println("Element not found");
					else
						 System.out.println("Element found at  position: "+position);
					break;
			
			case 4:
				   System.out.println(st);break;
				   
			//To Demo exit
			case 5: 
				try {
					System.exit(0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					System.out.println("HI I am finally");
				}
												
			}
			
		}
		

	}

}
