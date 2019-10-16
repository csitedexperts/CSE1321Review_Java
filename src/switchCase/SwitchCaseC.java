package switchCase;

public class SwitchCaseC {

	public static void main(String[] args) {
		System.out.println(trickOrTreat("Dots"));
	}


	public static int trickOrTreat (String candy) {
		int treat = 14;
		switch(candy) {

		case "Tootsie Roll":  
			treat += 1;
		case "Candy Corn":
			treat -= 3;
			break;

		case "Twizzlers":
			treat /= 2; 
		case "Dots":
			treat ++;
			break;

		case "Kit Kat":
			treat = 2;               

		}
		return treat;
	}

}
