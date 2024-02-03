package Break;

public class application {
	public static void main(String[] args) {
		int Loop = 0;
		while (Loop < 10) {
			System.out.println("Looping:" + Loop);

			if (Loop == 5) {
				break;
			}
			Loop++;
			System.out.println("Running:");
		}
	}
}
