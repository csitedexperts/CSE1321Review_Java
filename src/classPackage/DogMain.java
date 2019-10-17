package classPackage;


class Dog{
	String name;
	int  numLegs;
	float age;  
	boolean isTrained;
	String color;
	float weight;
	
	public Dog() {
		System.out.println("Dog() constructor called....");
	}
	
	void canMove()
	{
		System.out.println("My doc can move ....");

	}

	void makeSound()
	{
		System.out.println("My doc can make sound....");

	}


	@Override
	public String toString() {
		return name + " " +  numLegs + " " + age ;  
	}
	
}  // End of Dog Class 
//In C++ }; 

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x1;
		x1 = 15;
		// int x1 = 20;
		System.out.println("x1 = " + x1);

		Dog d1 = new Dog();

		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Dog d4 = new Dog();
		Dog d5 = new Dog();
		Dog d6 = new Dog();

		d1.name = "Lassie"; // d1's name = "Lassie"
		d1.numLegs = 4;
		d1.age = 3.5F;

		d1.isTrained = true;
		d1.color = "Black";
		d1.weight = 45;

		d1.canMove();
		d1.makeSound();
		
		System.out.println("d1 = " + d1);

		d2.name = "Tom"; // d1's name = "Lassie"
		d2.numLegs = 4;
		d2.age = 2.5F;

		d2.isTrained = false;
		d2.color = "White";
		d2.weight = 145;

		d2.canMove();
		d2.makeSound();
		

		System.out.println("d2 = " + d2);
		
		System.out.println("=================");
	}

}
