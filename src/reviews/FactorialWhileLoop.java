package reviews;

public class FactorialWhileLoop {

	public static void main(String[] args) {
		int i = 1, n = 5;
		int fact = 1;

		while(i <= n) {
			fact = fact * i;
			i++;
		}

		System.out.println("Facorial of " + n + " = " + fact );
	
	}

}
