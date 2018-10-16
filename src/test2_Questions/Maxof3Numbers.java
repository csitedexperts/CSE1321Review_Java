package test2_Questions;

public class Maxof3Numbers {

	public static void main(String[] args) {
		int i = 5;
		int j = 20;
		int k = 15;
		
		int max = (int) max(i, j, k);
		System.out.println("The maximum of " + i + " " + j + " and "+ k + " is: " + max);
	} // Emd of main()

	public static double max(int num1, int num2, int num3) {
		int max_num = num1;   
		if (num2 > max_num)
			max_num = num2;
		else if (num3 > max_num)
			max_num = num3;
		return  max_num;
	}

}
