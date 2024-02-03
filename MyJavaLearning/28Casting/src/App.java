
public class App {

	public static void main(String[] args) {
	byte byteValue = 20;
	short shortValue = 55;
	int intValue =988;
	long longValue =56677;
	float floatValue = 3447.3f;
	double doubleValue = 32.57;
	
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Double.MIN_VALUE);
	
	intValue = (int)longValue;
	System.out.println(intValue);

	doubleValue = intValue;
	System.out.println(doubleValue);
	
	intValue = (int)floatValue;
	System.out.println(intValue);
	
	//the following won't as we expect it to
	//128 is too big for byte.
	byteValue =(byte)128;
	System.out.println(byteValue);
	
	shortValue =(short)intValue;
	System.out.println(shortValue);

	}

}

