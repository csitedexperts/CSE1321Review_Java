package oop;

public class CircleDome {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(1);
		
		System.out.println("c1.radius = " + c1.getRadius());
		
		double c1_radius = c1.getRadius();
		System.out.println("c1.radius = " + c1_radius);
//		c1_radius = c1.setRadius(1);
		//		c1.radius = 12;
		
//		c1.radius =1;    // Ctrl + Spacebar
		c1.getArea();
		c1.printCir();
	
		Circle c2 = new Circle();
		c2.setRadius(10);
		System.out.println("c2.radius = " + c2.getRadius());
		
		//		c2.radius = 10;
//		c2.getArea();
		c2.printCir();

	}

}
