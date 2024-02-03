package Tetorial;

import java.util.Scanner;

public class App { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please inter a command: ");
		String text = input.nextLine();
		
		switch(text) {
		case"Start":
			System.out.println("Macine started.");
			break;
			
		case"Stop":
			System.out.println("Macine stopped.");
			break;
		default:	
			System.out.println("Command not recognized");
		}
		
		}
	}


