
class Person {
	
	String name;
	int age;
	void speaks() {
		System.out.println("My name is : " + name );
	}
	int calculateYearsToRetirement()
	{
		int yearLeft = 60- age;
		return yearLeft;
	}
public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.age =22;
		person1.name ="Rame";
		person1.speaks();
		person1.calculateYearsToRetirement();

	}

}
}
