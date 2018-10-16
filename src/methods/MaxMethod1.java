package methods;

public class MaxMethod1 {
	public static void main(String[] args){ // main method 
		int i = 5;
		int j = 20;
		int k = max(i, j);
		System.out.println("The maximum of " + i + " and "+ j + " is: " + k);
	} // Emd of main()

	public static int max(int num1, int num2) {
		int result;   
		if (num1 >= num2)
			result = num1;
		else  
			result = num2; 
		return result;
	}

}
