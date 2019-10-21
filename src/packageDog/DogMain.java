package packageDog;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x1;
		x1 = 15;
		// int x1 = 20;
		System.out.println("x1 = " + x1);

		Dog d1 = new Dog();

		Dog d2 = new Dog();
		Dog d3 = new Dog("Lassie", 4, false, "Black", 50);
		    
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);

		d1.name = "Lassie"; // d1's name = "Lassie"
//		d1.setName("Lassie"); // d1's name = "Lassie"
		
		d1.age = 3.5F;

		d1.isTrained = true;
		d1.color = "Black";
		d1.weight = 45;

		d1.canMove();
		d1.makeSound();
		
		System.out.println("d1 = " + d1);

		d2.name = "Tom"; // d1's name = "Lassie"
		d2.age = 2.5F;

		d2.isTrained = false;
		d2.color = "White";
		d2.weight = 145;

		d2.canMove();
		d2.makeSound();
		

		System.out.println("d2 = " + d2);
		
		System.out.println("=================");
	
        Dog d5 = new Dog();
        Dog d6 = new Dog();

        d5.name = "Massie"; // d5's name = "Massie"
        d5.age = 3.5F;
        d5.isTrained = true;
        d5.color = "Black";
        d5.weight = 45;

        System.out.println("d5 = " + d5);
        System.out.println("d5's name = " + d5.getName());
        System.out.println("d5's age = " + d5.age);

        d5.canMove();
        d5.makeSound();

        System.out.println("d6 = " + d6);

        d6.name = "Tonny"; // d6's name = "Tonny"
        d6.age = 2F;

        d6.isTrained = false;
        d6.color = "White";
        d6.weight = 15;

        System.out.println("d6 = " + d6);
        System.out.println("d6's name = " + d6.name);
        System.out.println("d6's age = " + d6.age);

        System.out.println("d5 = " + d5);
		System.out.println("d6 = " + d6);

        d6.canMove();
        d6.makeSound();
        

	}

	
}
