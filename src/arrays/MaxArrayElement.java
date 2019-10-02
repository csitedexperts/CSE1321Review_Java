package arrays;

public class MaxArrayElement {

	private static int FindMax(int[] A) { 
		int temp = A[0]; 
		for (int i = 1; i < A.length; i++)
		{ 
			if (temp < A[i])  
			{ temp = A[i]; 	}
		} 

		return temp;
	} 


	public static void main(String [] args) {
	
	int[] marks = new int[5];
		marks[0] = 10;
		marks[1] = 7;
		marks[2] = 50;
		marks[3] = 3;
		marks[4] = 1;
		System.out.println(FindMax(marks));

/*		
		int[] numArray = {5, 23, 45, 4, -3, 2221};

		int maxValue = FindMax(numArray);
		System.out.println(maxValue);
*/			
	}


}
