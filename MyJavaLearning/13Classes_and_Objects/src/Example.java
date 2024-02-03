
class Calculator
{
	public int add(int num1,int num2)
	{
		int r=num1+num2;
		//System.out.println("In Add");
		return r;
	}
}
public class Example {

	public static void main(String[] args) {
		int n1=4;
		int n2=5;
		//int Add=n1+n2;
		Calculator cal =new Calculator();
		int result=cal.add(n1,n2);
		
		System.out.println(result);
		

	}

}
