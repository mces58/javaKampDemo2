package javaKampDemo3;

public class User {
	
	private String firstName;
	
	private String lastName;

	private String courseName; 
	
	public User( String firstName, String lastName, String courseName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.courseName = courseName;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	
	

}
