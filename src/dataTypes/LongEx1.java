package dataTypes;
public class LongEx1{
	
	public static void main(String args[]) {
		
		System.out.println("long type min value: " + Long.MIN_VALUE);
		System.out.println("long type max value: " + Long.MAX_VALUE);
		System.out.println("long type size: " + Long.SIZE);

		long  year = 10;
		long  lightSpeed = 186000;
		long  distance;
		distance = year*365*24*60*60*lightSpeed;
		System.out.print("In " +year + " years " );
		System.out.print("light rays will travel about ");
		System.out.println(distance + " miles");
	}
	
}
