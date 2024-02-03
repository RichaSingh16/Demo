
public class App {

	public static void main(String[] args) {
		int[] values = { 3, 4, 45 };
		System.out.println(values[1]);
		int[][] grid = {
				{34,5,6},
				{4,6},
				{45,667,87}
		};
		System.out.println(grid[0][2]);
		String[][] texts = new String[2][3];
		System.out.println(texts[1][2]);
		texts[0][1]="I am there!";
		System.out.println(texts[0][1]);
		
		for(int row=0 ; row < grid.length ; row++)
		{
			for(int col=0; col < grid[row].length ; col++)
			{
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
		
	}

}
