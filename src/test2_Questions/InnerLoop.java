package test2_Questions;

public class InnerLoop {
	public static void main(String[] args) {
		int i = 1;
		
		for (   ; i<=5; i++) {
			
			for (int j= 1; j<=i; j++)
			{
				System.out.print(j + "  ");
			}
			
			System.out.println();
		}
		
		
	}
	
}
