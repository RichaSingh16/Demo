class Machine{
String name;
int code;
public Machine()
{
	System.out.println("Constructor running!");
}
public Machine(String name) {
	
	System.out.println("Secand constructor running!");
	this.name = name;
}
public Machine(String name,int code) {
	
	System.out.println("Third constructor running!");
	this.name = name;
	this.code = code;
}

}
public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Siya");
		Machine machine3 = new Machine("ram",2);

	}

}
