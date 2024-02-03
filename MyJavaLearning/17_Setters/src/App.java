class Humman{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class App {

	public static void main(String[] args) {
		Humman obj = new Humman();
		//obj.age=22;
		//obj.name="Samer";
		obj.setAge(55);
		obj.setName("Samer");
		System.out.println(obj.getName() );
		System.out.println( obj.getAge());

	}

}
