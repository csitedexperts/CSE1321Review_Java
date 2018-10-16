package reviews;

public class Maxof3Numbers {

	public static void main(String[] args) {
		int i = 5;
		int j = 20;
		int k = 15;
		
		int max = max(i, j, k);
		System.out.println("The maximum of " + i + " " + j + " and "+ k + " is: " + max);
	} // Emd of main()

	public static int max(int num1, int num2, int num3) {
		int max = num1;   
		if (num2 > max)
			max = num2;
		else if (num3 > max)
			max = num3;
		return max;
	}

}
