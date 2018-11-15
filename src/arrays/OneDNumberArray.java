package arrays;

public class OneDNumberArray {

	public static void main(String[] args) {
		int number = 5;
		int count = 0; boolean flag = false;
		int[] grid = new int[] {5, 7, 4, 5, 7, 7, 3, 1} ;
		for (int i = 0; i < grid.length; i++){
			if(grid[i] == number) {
			flag = true; count= count + 1;
			}
		}
//		if (count >=1)
		if(flag ) /// Means if flag == true
			System.out.println("My number " + number + " is found " + count + " times");
		else
			System.out.println("My number " + number + " is NOT found");
	}
}
