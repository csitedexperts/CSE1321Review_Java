package oop;


public class StudentMain {

	public static void main(String[] args) {

		int x =5;
		System.out.println(x);
		String  hello = "Hello World";
		System.out.println(hello);

		Student mike = new Student(1, "Michael Liu", "Male", 4.0f, true);
		Student lia = new Student(2, "Lia Kendrik", "Female", 2.4f, false);
		Student dave = new Student(3, "David Michael", "Male", 3.0f, true);

		System.out.println(mike);
		System.out.println(lia);
		System.out.println(dave);


		Student s1 = new Student(); // s1 is an object
		Student s2 = lia; // s2 is a reference

		System.out.println(s2);
		
		s1.setId(5);
		s1.gender = "F";
		s1.setCgpa(3.5f);
		s1.isCurrent = true;
		s1.name = "Tyler"; 

		System.out.println(s1);

	}

}
