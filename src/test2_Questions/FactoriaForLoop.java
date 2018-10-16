package test2_Questions;


public class FactoriaForLoop {

	public static void main(String[] args) {
		int i = 1, n = 5;
		int fact = 1;
		
		for ( ; i <=n; i++ ) {
			fact = fact * i;
		}
			
		System.out.println("Facorial of " + n + " = " + fact );
		
	}

}
