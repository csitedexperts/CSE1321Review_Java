package classPackage;
public class Pencil {
	int serialNo;
	String model;
	String type;
	boolean hasEraser;
	public void canWrite() {
		System.out.println("This pencil can write");	
	}
	//Returns a string representation of the object. 
	//In general, the toString method returns a string
	//that "textually represents" this object.
	
	@Override
	public String toString() {
		
		return serialNo + " " + model + " " + type ;
	}
	
} // In C++ };
