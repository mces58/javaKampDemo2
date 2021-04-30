package javaKampDemo3;

public class UserManager {
	
	public void userAdd(User user) {
		
		String message = " kursuna eklendi. ";
		
		System.out.println(user.getFirstName() + " " + user.getCourseName() + message);
	}

	public void userDelete(User user) {
		
		String message = " kursundan silindi.";
		
		System.out.println(user.getFirstName() + " " + user.getCourseName() + message);
	}
}
