package control_statements;


/* LeapYearEx1.java */
import java.io.IOException;
import java.util.Scanner;
public class LeapYearEx1{
public static void main(String args[]) throws IOException { 
	Scanner scnr = new Scanner(System.in);

	System.out.print("Enter the year to be tested: ");
	int year = scnr.nextInt();
	if( ((year%4)==0 &&(year%100 !=0))||(year%400)==0)
		System.out.println(year +" is a leap year.");
	else
		System.out.println(year +" is not a leap year.");
	scnr.close();
 }
} 

