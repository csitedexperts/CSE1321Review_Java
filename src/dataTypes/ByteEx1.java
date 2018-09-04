package dataTypes;

public class ByteEx1{
	public static void main(String args[]) {
		
		System.out.println("byte type min value: " + Byte.MIN_VALUE);
		System.out.println("byte type max value: " + Byte.MAX_VALUE);
		System.out.println("byte type size: " + 	Byte.SIZE);

		byte  value1 = 100;  // Legal Assigning
		byte  value2 = 127; // Legal Assigning
		
		int  value3 = 2* value2;
		
//		byte sum = value1 + value2;
		
		System.out.println("Value1: " +value1);
		System.out.println("Value2: " +value2);
		System.out.println("Value3: " +value3);

	}
}
