package Tetorial;

import java.util.Scanner;

public class NewExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please inter a command: ");
		String text = input.nextLine();
		
		
		switch(text) {
		case"Start"->
			System.out.println("Machine started.");
			
			
		case"Stop"->
			System.out.println("Machine stopped.");
			
		default->	
			System.out.println("Command not recognized");
		} 
		
		
		
		// Second way to writing
		
		/*
		 String result = " ";
		switch(text) {
		case"Start"-> result="Machine started.";
			//System.out.println("Machine started.");
			
			
		case"Stop"->result = "Machine stopped.";
			
		default->	result ="Command not recognized";
		}
		System.out.println(result);
	}  
	  */
		
		
		//another way
		/*
		String result = " ";
		result = switch(text)
				{
		case"Start"->"Machine started.";
			//System.out.println("Machine started.");
			
			
		case"Stop"-> "Machine stopped.";
			
		default->"Command not recognized";
		};
		
		System.out.println(result);
	}  
	*/
		
		

	}


