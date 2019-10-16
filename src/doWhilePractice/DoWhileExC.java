package doWhilePractice;

public class DoWhileExC {

	public static void main(String[] args) {

		int timeLeft = 150, routines = 0;
		System.out.println("Final Number of Routines performed: " + routines); 

		//do {
			if (timeLeft > 120) 
				routines += 3;
			else if (timeLeft > 90)
				routines += 2;
			else if (timeLeft > 60)
				routines ++;

		//	timeLeft -= 20;
	//	}while (timeLeft >= 0);
		System.out.println("Final Number of Routines performed: " + routines); 

	}


}
