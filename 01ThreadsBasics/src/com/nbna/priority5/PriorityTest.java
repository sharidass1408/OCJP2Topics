package com.nbna.priority5;


public class PriorityTest {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		//String[] names = {"fastestguy","mediumguy","slowguy"};
		String[] names = {"slowguy", "mediumguy","fastestguy"};
		
		for(String s: names){		
		HumanP name = new HumanP(s);
		Thread namethread = new Thread(name);	
		
		int currentpriority = namethread.getPriority();
		System.out.println("The current priority is: "+ currentpriority);
		
		if(s.equals("slowguy")){					
			System.out.println("My priority did not change");
			
		}else if(s.equals("mediumguy")){
			int changedpriority =currentpriority+2;
			namethread.setPriority(changedpriority);
			System.out.println("The changed priority is: "+ changedpriority);
			
		}else if(s.equals("fastestguy")){
			int changedpriority =currentpriority +4;
			namethread.setPriority(changedpriority);
			System.out.println("The changed priority is: "+ changedpriority);
		}
			
		
		namethread.start();		
		}
		
		
		System.out.println("Already out of for loop...");
	}

}
