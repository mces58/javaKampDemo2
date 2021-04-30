package javaKampDemo3;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("Ali", "PEKMEZ", "JAVA - REACT");
		User user2 = new User("Mehmetcan", "ESER", "JAVA - REACT");
		
		
		User [] users = {user1 ,user2};
		
		for (User user : users) {
			
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			System.out.println(user.getCourseName() + "\n");
		}
		
		
		Instructor instructor1 = new Instructor("Engin", "DEMIROG", "Ogretmen", "JAVA - REACT");
		Instructor instructor2 = new Instructor("Ahmet", "BALCI", "Ogretmen", "PYTHON");

		
		Instructor [] instructors = {instructor1 , instructor2};
		
		for (Instructor instructor : instructors) {
			
			System.out.println(instructor.getFirstName());
			System.out.println(instructor.getLastName());
			System.out.println(instructor.getDetail());
			System.out.println(instructor.getCourseName() + "\n");
		}
		
		
		UserManager userManager = new UserManager();
		
		userManager.userAdd(user2);
		userManager.userDelete(user2);
		System.out.println();
		
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.enter(instructor1);
		instructorManager.lessonsToday(instructor1);
		System.out.println();
		
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.rollCall(user2);
		studentManager.complate(user2);
		
	}
}
