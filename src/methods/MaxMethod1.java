package methods;

public class MaxMethod1 {
	public static void main(String[] args){ // main method 
		int i = 5, j = 20, k = 15;
		
		System.out.println("The maximum of " + i + " and "+ j + " is: " + max(i, j));
		System.out.println("The maximum of " + i + " " + j +  " and "+ k + " is: " + max(i, j, k));
		int min = min (i, j);
		System.out.println("The min of " + i + " and "+ j + " is: " + min);
	} // Emd of main()

	public static int max(int num1, int num2) {
		int result;   
		if (num1 >= num2)
			result = num1;
		else  
			result = num2; 
		return result;
	}

	public static int min(int num1, int num2) {
		int result;   
		if (num1 <= num2)
			result = num1;
		else  
			result = num2; 
		return result;
	}
	
	public static int max(int num1, int num2, int num3) {
		int max = num1;   
		if (num2 > max)
			max = num2;
		else if (num3 > max)
			max = num3;
		return max;
	}

}
