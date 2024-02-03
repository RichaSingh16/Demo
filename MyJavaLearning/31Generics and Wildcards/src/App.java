import java.util.ArrayList;

class Machine
{

	@Override
	public String toString() {
		return "I am a Machine. ";
	}
	public void start()
	{
		System.out.println("Machine starting");
	}
	
}
class Camera extends Machine
{

	@Override
	public String toString() {
		return "I am a Camera. ";
	}
	public void snap()
	{
		System.out.println("Snap!");
	}
}

public class App {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("Two");
		showList(list);

		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());
		showList1(list1);
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());
		showList1(list2);
		showList2(list1);
		

	}

	public static void showList(ArrayList<String> list) {
		for (String value : list) {
			System.out.println(value);
		}
	}

	/*
	 public static void showList1(ArrayList<Machine> list1) {
		for (Machine value : list1) {
			System.out.println(value);
		}
	}
	*/
	
	
/*	public static void showList1(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}
*/
	
	
	public static void showList1(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			System.out.println(value);
			value.start();
			
		}
	}
	
	public static void showList2(ArrayList<? super Camera> list) {
		for (Object value : list) {
			System.out.println(value);
			
		}
	}
}
