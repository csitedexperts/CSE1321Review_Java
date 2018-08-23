package dataTypes;

public class FloatEx1{
	public static void main(String args[]) {

		System.out.println("float type min value: " + Float.MIN_VALUE);
		System.out.println("float type max value: " + Float.MAX_VALUE);
		System.out.println("float type bit size: " + Float.SIZE);
		

		float Value1, Value2, Sum;
		// Value1 = 3.123456789; // Illegal
		// Value2 = 350.0; // Illegal
		
		Value1 = 3.123456789f; // Legal
		Value2 = 350.0f; // Legal

		Sum = Value1 + Value2;
		System.out.println("Value1 = " +Value1);
		System.out.println("Value2 = " +Value2);
		System.out.println("Sum = " +Sum);
	}
}
