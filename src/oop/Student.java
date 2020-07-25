package oop;

 public class Student {
	public int id;
	String name;
	public String gender;
	private float cgpa;
	
	public boolean isCurrent;

	public Student( )
	{
		
	}
	
	public Student(int id, String name, String gender, float cgpa,boolean isCurrent)
	{
	this.id = id;
	this.name = name;
	this.gender = gender;
	
	this.cgpa = cgpa;
	this.isCurrent = isCurrent; 
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public void setCgpa(float Cgpa) {
		this.cgpa = Cgpa;
	}

	public float getCgpa() {   // get-> ret 
		return cgpa;
	}
	
	

	public void study(){

	}
	public void sleep(){

	}

	public void enjoy(){

	}
	
	public void work(){

	}

	@Override
	public String toString() {
		return "Student id=" + id + ", name=" + name + ", gender=" + gender + ", cgpa=" + getCgpa() + ", isCurrent="
				+ isCurrent;
	}

	

}


