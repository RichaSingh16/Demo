
public class Example {

	public static void main(String[] args) {
		//int Num[][] = new int[3][3];
		int Num[][]= {{1,2,3,4},{23,33,2,0},{9,0,4,9}};
		//every array in same size
		for(int i=0 ; i<3 ;i++) {
			for(int j=0 ; j<4 ;j++) {
				System.out.print(Num[i][j] + "\t");
				
			}
			System.out.println();
		}

	}

}
