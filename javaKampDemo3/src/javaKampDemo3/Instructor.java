package javaKampDemo3;

public class Instructor extends User{
	
	private String detail;
	
	
	public Instructor(String firstName, String lastName, String detail, String courseName) {
		super(firstName, lastName,courseName);
		this.detail = detail;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


}
