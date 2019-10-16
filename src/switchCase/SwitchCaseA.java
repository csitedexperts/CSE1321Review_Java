package switchCase;

public class SwitchCaseA {

	public static void main(String[] args) {

		System.out.println(trickOrTreat("Twizzlers"));
	
	}


	public static int trickOrTreat (String candy) {
	int treat = 26;
	switch(candy) {

	case "Tootsie Roll":  
		treat ++;
	case "Candy Corn":
		treat += 2;
		break;

	case "Twizzlers":
		treat -= 2; 
	case "Dots":
		treat --;

	case "Kit Kat":
		treat *= 2;               
		
	}
	return treat;
}

}
