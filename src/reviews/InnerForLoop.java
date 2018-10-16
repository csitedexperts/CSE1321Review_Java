package reviews;

public class InnerForLoop {

	public static void main(String[] args) {

		for (int i = 0; i <= 2; i ++)
		{
			for (int j = 3*i; j<= 3*i+ 3; j++)
			{	
				System.out.print(j + "; ");
			}
			System.out.print("\n");

		}

	}
}
