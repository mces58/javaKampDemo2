package javaKampDemo2;

public class UserManager {

	public void enter(User user, Course course) {
		
		String message = " adl� kursa ba�ar�l� bir �ekilde giri� yapt�n�z.";
		
		System.out.println(user.userName +" " + course.courseName + message);
	}
	
	
	public void delete(User user , Course course) {
		
		String message = " adl� kurstan kayd�n�z� sildiniz.";
		
		System.out.println(user.userName + " " + course.courseName + message);
	}
	
}
