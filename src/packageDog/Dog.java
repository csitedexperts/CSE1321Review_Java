package packageDog;

class Dog{
	String name;
	float age;  
	boolean isTrained;
	String color;
	float weight;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog(String name, float age, boolean isTrained, String color, float weight){
		this.name = name;
		this.age = age;
		this.isTrained = isTrained;
		this.weight = weight;

	}

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
		return name + " " + age  + " " + isTrained;  
	}

}  // End of Dog Class 
//In C++ }; 
