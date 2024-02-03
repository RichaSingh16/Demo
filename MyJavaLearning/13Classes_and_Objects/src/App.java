class Person {
	//class can contain
	// 1. Data
	// 2. Subroutines Method
	String name;
	int age;
}
public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.age =22;
		person1.name ="Rame";
		
		Person person2 = new Person();
		person2.age =43;
		person2.name ="Ramesh";
		System.out.println(person1.name + " " + person1.age );
		System.out.println(person2.name + " " + person2.age);
		

	}

}
