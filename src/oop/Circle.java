package oop;
public  class Circle{
	
	public double radius; // default visibility
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	
	public Circle() {  // default constructor
		 System.out.println("default constructor called");
	 }

	 double getArea() { // private visibility
		double area = 3.14 * radius * radius;
		System.out.println("Area = " + area);
		return area;
	} // End of the getArea()
	public void printCir() {  // public visibility
	//	 getArea();
		double cir = 2* 3.14 * radius;
		System.out.println("Cir = " + cir);
	}  // End of the printCir()
} // end of the Circle class