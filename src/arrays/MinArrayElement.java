package arrays;

public class MinArrayElement {

	private static int FindMin(int[] A) { 
		int temp = A[0]; 
		for (int i = 1; i < A.length; i++)
		{ 
			if (temp > A[i])  
			{ temp = A[i];
			}
		} 
		//System.out.println(temp);
		return temp;
	} 


public static void main(String [] args) {
		// TODO Auto-generated method stub
		int[] Mark = new int [50];
		
		Mark[0] = 23;
		Mark[1] = 54;
		Mark[2] = 50;
		Mark[3] = -45;
		Mark[4] = 65;
		
		FindMin(Mark);
		
		System.out.println(FindMin(Mark));
	}



}
