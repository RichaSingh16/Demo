class Persons
{
	int age;
	String name;
	void speak()
	{
		System.out.println("My name is : " + name );
	}
	int calculateYearsToRetirement()
	{
		int yearLeft = 60- age;
		return yearLeft;
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
}
public class App2 {

	public static void main(String[] args) {
		Persons person1 = new Persons();
		person1.age=22;
		person1.name="Ram";
		person1.speak();
		int years = person1.calculateYearsToRetirement();
		System.out.println(years);
		String name = person1.getName();
		int age = person1.getAge();
		System.out.println(name);
		System.out.println(age);

	}

}
