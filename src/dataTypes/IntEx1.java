package dataTypes;

public class IntEx1{
	public static void main(String args[]) {
		System.out.println("int type min value: " + Integer.MIN_VALUE);
		System.out.println("int type max value: " + Integer.MAX_VALUE);
		System.out.println("int type size: " + Integer.SIZE);

		int  Value1 = -2147483648;  // Legal Assigning
		int  Value2 = 2147483647 ; // Legal Assigning
		
		long Value3 = (long) 2 * Value2;
		
		System.out.println("Value1: " +Value1);
		System.out.println("Value2: " +Value2);
		
		System.out.println("Value3: " +Value3);


	}
}
