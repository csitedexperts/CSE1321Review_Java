package switchCase;

public class SwitchCaseB {

	public static void main(String[] args) {
		System.out.println(trickOrTreat("Dots"));
	}


	public static int trickOrTreat (String candy) {
		int treat = 15;
		switch(candy) {

		case "Tootsie Roll":  
			treat --;

		case "Candy Corn":
			treat += 3;

		case "Twizzlers":
			treat *= 2; 
			break;
		case "Dots":
			treat --;

		case "Kit Kat":
			treat += 2;               

		}
		return treat;
	}

}
