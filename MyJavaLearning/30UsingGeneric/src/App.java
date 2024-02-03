import java.util.ArrayList;
import java.util.HashMap;
class Abc{
	
}
public class App {

	public static void main(String[] args) {
		
		///////Before java5///////////
		
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("Orange");
		String fruit =(String) list.get(1);
		System.out.println(fruit);
		
		
		///////// Modern Style ////////
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Dog");
		str.add("Cow");
		str.add("Cat");
		String oneAnnimal = str.get(0);
		String annimal = str.toString();
		System.out.println(annimal);
		System.out.println(oneAnnimal);
		
		//////// there can be more than one argument   ///////
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		//////// java 7 Style///////
		
		ArrayList<Abc> somelist = new ArrayList<>();

	}

}
