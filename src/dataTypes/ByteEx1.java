package dataTypes;

public class ByteEx1{
	public static void main(String args[]) {
		
		System.out.println("byte type min value: " + Byte.MIN_VALUE);
		System.out.println("byte type max value: " + Byte.MAX_VALUE);
		System.out.println("byte type size: " + Byte.SIZE);

		byte  Value1 = 100;  // Legal Assigning
		byte  Value2 = 127; // Legal Assigning
		
		int sum = Value1 + Value2;
		
		System.out.println("Value1: " +Value1);
		System.out.println("Value2: " +Value2);

	}
}
