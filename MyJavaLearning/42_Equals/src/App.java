import java.util.Objects;

class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}

public class App {

	public static void main(String[] args) {
		Person person1 = new Person(2,"Ram");
		Person person2 = new Person(2,"Ram");
		person1 = person2;
		System.out.println(person1.equals(person2));
		
		Double value1 =2.1;
		Double value2 =2.1;
		System.out.println(value1.equals(value2));
		
		Integer number1=3;
		Integer number2=3;
		System.out.println(number1.equals(number2));
		
		String text1 = "hi";
		String text2 = "hibjh".substring(0,2);
		System.out.println(text2);
		System.out.println(text1.equals(text2));

	}

}
