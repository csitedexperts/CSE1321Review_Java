package control_statements;

import java.util.Scanner;
public class SumOfDigits {
	public static void main (String[] args){
	    int number, lastDigit, reverse = 0;
	    int sum = 0;
	    Scanner scan = new Scanner (System.in);
	    System.out.print ("Enter a positive integer: ");
	    number = scan.nextInt();
	    do{
	       lastDigit = number % 10;
	       reverse = (reverse * 10) + lastDigit;
	       number = number / 10;
	       sum = sum + lastDigit;
	    }while (number > 0);
	    System.out.println ("That number reversed is: " + reverse);
	    System.out.println ("Sum of the digits:  " + sum);
	  }
	}
