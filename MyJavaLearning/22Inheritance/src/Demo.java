
public class Demo {

	public static void main(String[] args) {
		VeryAdvCalc cal =new VeryAdvCalc();
		int r1 = cal.add(4,6);
		int r2 = cal.sub(8,3);
		int r3 = cal.multi(2,3 );
		int r4 = cal.div(45, 5);
		double r5 = cal.power(5, 2);		
		System.out.println(r1 +" "+r2 +" "+ r3 +" " +r4 +" "+r5);
		System.out.println(r3);
		System.out.println(r4);
	}

}
