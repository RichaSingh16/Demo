class Calculator
{
	//create more then one method in same method name but different type of parameter and different no.of parameter .-->method Overloading
	
	public int Add(int n1,int n2)
	{
		return n1+n2;
	}
	public int Add(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	public double Add(double n1,int n2)
	{
		return n1+n2;
	}
	
}
public class App {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int r1=cal.Add(1, 2);
		System.out.println(r1);
		double r2=cal.Add(33.456, 0);
		System.out.println(r2);
		int r3=cal.Add(1, 2, 3);
		System.out.println(r3);
	}

}
