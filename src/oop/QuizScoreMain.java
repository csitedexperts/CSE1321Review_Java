package oop;

class QuizScore {
	int id;
	String name;
	int score;
	public QuizScore(int id, String name) {
		this.id = id;
		this.name = name;
		score = 10;
		System.out.println("id = " + this.id );
		System.out.println("name = " + this.name );
		System.out.println("score = " + score );
	}
	
	public void deductScore() {
		score = score - 1 ;
		System.out.println("Score = " + score );

	}
}

public class QuizScoreMain {
	public static void main(String[] args) {
		
		QuizScore s1 = new QuizScore(101, "Mokter");
		QuizScore s2 = new QuizScore(102, "Hossain");
		
		s1.deductScore();
		s1.deductScore();
		s1.deductScore();
		
	}

}
