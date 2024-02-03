
public class App {

	public static void main(String[] args) {
		
		//inefficient
		
		String info = "";
		info +="My name is rame.";
		info +=" ";
		info +="I am here.";
		System.out.println(info);
		
		//efficient
		
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is riya.");
		sb.append(" ");
		sb.append("I am builder.");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder("");
		s.append("My name is bob.")
		.append(" ")
		.append("I am builder.");
		System.out.println(s.toString());
		
		
		////Formatting//////////
		
		System.out.print("Here is some text.\twhat was tab.\nthat was new line.");
		System.out.println("More text.");
		
		//Formatting integers ////////
		System.out.printf("Total cast:%d;Quantity is %d\n",5,123);
		for(int i=0 ; i<10 ; i++)
		{
			System.out.printf("%d: %s\n",i ,"Here is some text");
		}
		
		//Formatting floating point value/////
		
		System.out.printf("Total value:%.2f\n",22.200);
		System.out.printf("Total value:%-4.2f\n",23452.200);
		System.out.printf("Total value:%-4.2f\n",52.200);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
