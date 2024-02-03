
public class Car extends Machine{
	
	@Override
	public void start() {
		System.out.println("Car start.");
	}

	public void wipeWildShield()
	{
		System.out.println(" wiping windshield.");
	}
	public void showInfo()
	{
		System.out.println("Car name: " + name);
	}
}

