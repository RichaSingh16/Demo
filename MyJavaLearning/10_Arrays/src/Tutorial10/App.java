package Tutorial10;

public class App {

	public static void main(String[] args) {
		int value = 5;

		int[] values;
		values = new int[3];
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);

		}
		int[] number = {1,2,3};
		for(int i=0 ; i<number.length ; i++)
		{
			System.out.println(number[i]);
		}
		
		int[] num = {1,2,3,4,3};
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println(num[i]);
		}
	}

}


