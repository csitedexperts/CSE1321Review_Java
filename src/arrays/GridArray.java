package arrays;

public class GridArray {

	public static void main(String[] args) {
		int count = 1;
		
		int[][] grid = new int[4][5];
		for (int r = 0; r <= 3; r++)
		{
			for (int c = 0; c <= 4; c++)
			{
				grid[r][c] = count;
				count++;
			}
		}

		for (int r = 0; r < 4; r++)
		{
			for (int c = 0; c < 5; c++)
			{
				System.out.print(grid[r][c] + "  ");
						
			}
			
			System.out.println();
		}
		
		/*
		for( int i;  in grid)
		{
			System.out.println(i + ",");
			if(i % 5 == 0)
			{ System.out.println(); }
		}
*/

	}

}
