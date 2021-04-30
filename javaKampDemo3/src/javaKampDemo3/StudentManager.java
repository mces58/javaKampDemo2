package javaKampDemo3;

public class StudentManager extends UserManager{
	
	public void rollCall(User user) {
		
		String message = " yoklaman alindi.";
		
		System.out.println(user.getFirstName() + message);
	}

	
	public void lessonsToday(User user) {
		
		String message = " bugun ki girecegin ders: ";
		
		System.out.println(message + user.getCourseName());
	}
	
	
	public void complate(User user) {
		
		String message = " tebrikler kursu basariyla tamamladin.";
		
		System.out.println(user.getFirstName() + " " + user.getLastName() +message);
	}
}
