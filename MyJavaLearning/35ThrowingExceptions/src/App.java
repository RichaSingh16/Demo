import java.io.IOException;

public class App {

	public static void main(String[] args) {
		Test test = new Test();
		try {
			test.run();
		} 
		//catch (IOException e) {
		catch (ServerException e){
			System.out.println(e.getMessage());
			
			//e.printStackTrace();
		}

	}

}