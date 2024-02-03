class Machine{
	public void start()
	{
		System.out.println("Machine start.");
	}
}
class Camera extends Machine{
	public void start()
	{
		System.out.println("Camera start.");
	}
	public void start1() {
		System.out.println("Camera again start.");
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
	
}
public class App {

	public static void main(String[] args) {
		
		Machine mach = new Machine();
		Camera cam = new Camera();
		mach.start();
		cam.snap();
		cam.start();
		cam.start1();
		
		//Upcasting
		Machine obj = new Camera();
       obj.start();
       
       //Downcasting
       Machine mach1 = new Camera();
       Camera obj1 =(Camera) mach1;
       obj1.start1();
       obj1.snap();
	}

}
