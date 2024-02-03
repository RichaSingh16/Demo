class Plant
{


	public static final int ID = 7;
	private String name;
	
	public String getData() {
		String data = "Some stuff  : " + calculatorGrowthForecast();
		return data;
	}
	
	private int calculatorGrowthForecast()
	{
		return 9;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class App {

	public static void main(String[] args) {
		
       Plant plant = new Plant();
       plant.setName("ram");
       System.out.println(plant.getName());
       String result=plant.getData();
       System.out.println(result);
	}
	
}
