package javaKampDemo2;

public class Main {
	
	public static void main(String[] args) {
		
		
		Course course1 = new Course(
				0,
				"JAVA + REACT",
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp�",
				"Engin DEM�RO�"		
				);
		
		Course course2 = new Course(
				1, 
				"C# + ANGULAR", 
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
				"Engin DEM�RO�");
		
		Course course3 = new Course(
				2, 
				"Programlamaya Giri� ��in Temel Kurs", 
				"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.",
				"Engin DEM�RO�");
		
		
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
