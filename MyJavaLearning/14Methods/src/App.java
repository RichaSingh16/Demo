class Robbot {
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int height) {
		System.out.println("jumping:" + height);
	}
}
public class App {

	public static void main(String[] args) {
		Robbot rob = new Robbot();
				rob.speak("I am rob.");
				rob.jump(22);
				

	}

}
