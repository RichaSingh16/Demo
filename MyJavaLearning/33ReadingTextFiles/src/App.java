import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class App {

	public static void main(String[] args) throws FileNotFoundException {
		//String fileName ="C:\\Users\\ASHISH\\Desktop\\example.txt";
		String fileName ="example.txt";
		File textFile =new File(fileName);
		Scanner in = new Scanner(textFile);
		
		int value = in.nextInt();
		System.out.println("Read Value :" + value);
		in.nextLine();
		int count =1;
		while(in.hasNextLine()) {
			String line =in.nextLine();
			System.out.println(count + ":" + line);
			count++;
		}
        in.close();
	}

}