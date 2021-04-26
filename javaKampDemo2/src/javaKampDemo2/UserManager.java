package javaKampDemo2;

public class UserManager {

	public void enter(User user, Course course) {
		
		String message = " adlı kursa başarılı bir şekilde giriş yaptınız.";
		
		System.out.println(user.userName +" " + course.courseName + message);
	}
	
	
	public void delete(User user , Course course) {
		
		String message = " adlı kurstan kaydınızı sildiniz.";
		
		System.out.println(user.userName + " " + course.courseName + message);
	}
	
}
