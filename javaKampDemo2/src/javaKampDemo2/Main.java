package javaKampDemo2;

public class Main {
	
	public static void main(String[] args) {
		
		
		Course course1 = new Course(
				0,
				"JAVA + REACT",
				"Yazýlým Geliþtirici Yetiþtirme Kampý",
				"Engin DEMÝROÐ"		
				);
		
		Course course2 = new Course(
				1, 
				"C# + ANGULAR", 
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
				"Engin DEMÝROÐ");
		
		Course course3 = new Course(
				2, 
				"Programlamaya Giriþ Ýçin Temel Kurs", 
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.",
				"Engin DEMÝROÐ");
		
		
		Course[] courses ={course1,course2,course3};
		
		for (Course course : courses) {
			
			System.out.println(course.courseId);
			System.out.println(course.courseName);
			System.out.println(course.courseDescription);
			System.out.println(course.courseTeacher + "\n");
		}
		
		User user1 = new User(
				100,
				"Mehmetcan",
				"sivas58",
				"mehmetcan@gmail.com");
		
		User user2 = new User(101,
				"Ali",
				"izmir35",
				"ali@gmail.com");
		
		User [] users = {user1,user2};
		
		for (User user : users) {
			
			System.out.println(user.userId);
			System.out.println(user.userName);
			System.out.println(user.userPassword);
			System.out.println(user.userEmail + "\n");
			
		}
		
		UserManager manager = new UserManager();
		
		manager.enter(user1, course1);
		manager.delete(user1, course1);
		
	}

}
