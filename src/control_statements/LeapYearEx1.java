package control_statements;
/* LeapYearEx1.java */
import java.io.IOException;
import java.util.Scanner;
public class LeapYearEx1{
public static void main(String args[]) throws IOException { 
	
	int Year = 2018;
	
	if( ((Year%4)==0 &&(Year%100) !=0)||(Year%400)==0)
		System.out.println("" +Year +" is a leap year.");
	else
		System.out.println("" +Year +" is not a leap year.");
	
 }
} 
