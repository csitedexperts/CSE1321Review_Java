package dataTypes;
public class DoubleEx1{
	public static void main(String args[]) {

		System.out.println("double type min value: " + Double.MIN_VALUE);
		System.out.println("double type max value: " + Double.MAX_VALUE);
		System.out.println("double type bit size: " + Double.SIZE);

		double Value1, Value2, Sum;
		Value1 = 3.123456789f; // Legal
		Value2 = 350.0f; // Legal

		Sum = Value1 + Value2;
		System.out.println("Value1 = " +Value1);
		System.out.println("Value2 = " +Value2);
		System.out.println("Sum = " +Sum);
	}
}
