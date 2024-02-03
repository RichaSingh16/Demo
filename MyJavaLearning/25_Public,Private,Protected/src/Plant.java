

public class Plant {
	// Bad practice
	public String name;
	
	//this is acceptable practice-----it's final
	public final static  int ID =7;
	protected String size;
	
	private String type;
	
	public Plant() {
		this.name ="Freedy";
		this.type ="plant";
		this.size = "medium";
	}

}
