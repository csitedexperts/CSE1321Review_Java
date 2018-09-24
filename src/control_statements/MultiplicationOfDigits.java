package control_statements;

import java.util.Scanner;
public class MultiplicationOfDigits {
	public static void main (String[] args){
	    int number, lastDigit, reverse = 0;
	    int mul = 1;
	    Scanner scan = new Scanner (System.in);
	    System.out.print ("Enter a positive integer: ");
	    number = scan.nextInt();
	    do{
	       lastDigit = number % 10;
	       reverse = (reverse * 10) + lastDigit;
	       number = number / 10;
	       mul = mul * lastDigit;
	    }while (number > 0);
	    System.out.println ("That number reversed is: " + reverse);
	    System.out.println ("Multiplication of the digits:  " + mul);
	  }
	}
