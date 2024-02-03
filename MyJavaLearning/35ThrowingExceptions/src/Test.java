import java.io.IOException;

public class Test {
//public void run() throws IOException {
	public void run() throws ServerException{
	//int code =0;
	int code =1;
	if(code !=0) {
		//throw new IOException("Could not connected to server.");
		throw new ServerException("Could not connected to server.");
	}
	System.out.println("Running Successfully");
}
}
