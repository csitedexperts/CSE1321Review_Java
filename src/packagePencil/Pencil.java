package packagePencil;
public class Pencil {
	int serialNo;
	String model;
	String type;
	boolean hasEraser;
	
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Pencil(){
		serialNo =101;
		model = "Amazon";
		type = "HB";
		hasEraser = true;
	  // System.out.println("The Pencil() constructor is called.....");
	}

	public Pencil(int serialNo, String model, String type, boolean hasEraser) {
//		super();
		this.serialNo = serialNo;
		this.model = model;
		this.type = type;
		this.hasEraser = hasEraser;
	}


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
