package Keyboard_Input;
import java.util.Scanner;

public interface Keyboard_Input {

	public static void	main(String args[]) { 
		String name;
		int age;
		Scanner s = new Scanner (System.in);
//		System.out.print("Enter your name and age : ");
		System.out.print("Enter your name : ");
		//name = s.next();
		name = s.nextLine();
		System.out.print("Enter your age : ");
		
		age = s.nextInt();
		System.out.println("Hello " + name + "! you are " + age + " old");

	}
}
