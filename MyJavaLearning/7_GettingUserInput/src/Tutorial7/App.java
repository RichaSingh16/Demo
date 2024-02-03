package Tutorial7;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			//output the prompt
			System.out.println("entera line of text : ");
			//wait for the user to enter the text
			String line = input.nextLine();
			// Tell them what them entered
			System.out.println("You entered " + line);
		}


	}

}
