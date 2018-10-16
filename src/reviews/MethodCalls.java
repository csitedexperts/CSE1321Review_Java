package reviews;

public class MethodCalls {

	public static void main(String[] args) {
		int i = 1;
		while ( i < 5) {
			aMethod(2+i, i);
			i = i + 1;
		}
	}

	static void aMethod(int a, int num) {
		for (int k = 1; k<= a; k++) {
			System.out.print(num + "  ");
			num = num + 1;
		}
		System.out.println();
	}
}
