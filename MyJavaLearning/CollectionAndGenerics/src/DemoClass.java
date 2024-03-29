import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
//import java.util.Iterator;

//Collection -> 1.2   Generics->1.5
public class DemoClass {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(3);
		values.add(65);
		values.add(74);
		values.add(23);
		values.add(2, 22);
		
		values.forEach(System.out::println);
		
		//1-> fetch data using iterator
		//2->enhance for loop
		/*
		 * Iterator i =values.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */
		
		
		
		// 2->using enhance for loop	
		/*
		 * for(int i:values) { System.out.println(i); }
		 */
	}

}
