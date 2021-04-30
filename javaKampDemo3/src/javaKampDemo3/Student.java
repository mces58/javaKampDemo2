package javaKampDemo3;

public class Student extends User{
	
	private String schoolNumber;
	
	
	public Student(String firstName, String lastName, String courseName) {
		super(firstName, lastName, courseName);
	}


	public String getSchoolNumber() {
		return schoolNumber;
	}


	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	
	

}