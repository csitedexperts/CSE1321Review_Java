package test2_Questions;

public class vowelCheck {
	public static void main(String[] args) {
	
		char ch = 'a';
		
		if((ch == 'a') || (ch == 'A') ||(ch == 'e') || (ch == 'E') 
				|| (ch == 'i') || (ch == 'I') || (ch == 'o') || (ch == 'O')
				|| (ch == 'u') || (ch == 'U'))
			System.out.println("The character \"" + ch + "\" is a vowel");
		
		else
			
			System.out.println("The character '" + ch + "' is NOT a vowel");
		
		
	}
	
}
