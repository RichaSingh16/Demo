
public class Field {
private Plant plant = new Plant();
 public Field()
 {
	 // Size is protected ; Field is in the same package as plant.
	System.out.println(plant.size); 
 }
}
