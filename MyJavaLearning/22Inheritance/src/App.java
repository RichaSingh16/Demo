
public class App {

	public static void main(String[] args) {
		Machine mac1 =new Machine();
		mac1.start();
		mac1.stop();
		
		Car car1=new Car();
		car1.start();
	    car1.wipeWildShield();
	    car1.stop();
	    car1.showInfo();

	}

}
