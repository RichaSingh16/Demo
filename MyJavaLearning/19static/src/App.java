class Think{
	public final static int LUCKY_NUMBER = 5 ;
	public String name;
	public static String description;
	public static int count =0;
	public static int id;
	 public Think() {
		 id=count;
		 count++;
		 
	 }
	public void showName()
	{
	System.out.println("object id :" + id +" "+ description + ":" + name); 
		
	}
	public static void showInfo()
	{
		System.out.println(description ); 
	}
}
public class App {

	public static void main(String[] args) {
		
		Think.description ="I am here.";
		Think.showInfo();
		System.out.println("Before creating object,count is : " + Think.count);
		
		Think think1 =new Think();
		think1.name ="Ram";
		System.out.println("After creating object,count is : " + Think.count);
		think1.showName(); 
		 
		Think think2 =new Think();
		System.out.println("After creating object,count is : " + Think.count);
		think2.name="Siys";
		think2.showName();
		//System.out.println(Math.PI);
		System.out.println(Think.LUCKY_NUMBER);

	}

}
