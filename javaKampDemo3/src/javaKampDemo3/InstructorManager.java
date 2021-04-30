package javaKampDemo3;

public class InstructorManager extends UserManager{
	
	public void enter(User user) {
		
		String message = " sisteme giris yaptin.";
		
		System.out.println(user.getFirstName() + message);
		
	}

	public void lessonsToday(User user) {
		
		String message = " bugun anlatacagin ders: ";
		
		System.out.println(user.getFirstName() + message + user.getCourseName());
	}
	
	
}
