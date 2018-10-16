package test2_Questions;


public class FactorialDoWhileLoop {

	public static void main(String[] args) {
		int i = 1, n = 5;
		int fact = 1;

		do {
			fact = fact * i;
			i++;
		}while(i <= n);

		System.out.println("Facorial of " + n + " = " + fact );
	
	}

}
