package com.nbna.linkedlist3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) throws IOException {
		
		LinkedList linkl = new LinkedList();
		
		/*linkl.add("America");
		linkl.add("India");
		linkl.add("Japan");*/
		
		System.out.println("List: "+ linkl);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String element;
		int position, choice=0;
		boolean firstelement =true;
		
		while(true){
			
			System.out.println("\n LINKED LIST OPERATIONS");
			System.out.println("1 Add an element");
			System.out.println("2 Remove an element");
			System.out.println("3 Change an element");
			System.out.println("4 Display list");
			System.out.println("5 Exit");
			
			System.out.println("Please make a choice..");
			
			choice = Integer.parseInt(br.readLine());
			
			switch(choice){
			
			//To Demo add(position,element)
			case 1: System.out.println("Enter the element to insert to Linked List: ");
					element = br.readLine().trim();
					if(firstelement){
						firstelement=false;
						position=1;
					}else{
					System.out.println("At what position?");
					position = Integer.parseInt(br.readLine().trim());
					}
					linkl.add(position-1,element);
					break;
			
			//To Demo remove(position)
			case 2: System.out.println("Enter the position from which you want to remove element");
					position = Integer.parseInt(br.readLine().trim());
					linkl.remove(position-1);
					break;
					
			//To Demo set(position,element)
			case 3: System.out.println("Enter position:");
					position = Integer.parseInt(br.readLine().trim());
					System.out.println("Enter new element: ");
					element =br.readLine();
					linkl.set(position-1,element);
					break;
					
			case 4:
				   System.out.println(linkl);break;
			//To Demo exit
			case 5: System.exit(0);
												
			}
			
			
			
			
			
		}
		
		

	}

}
