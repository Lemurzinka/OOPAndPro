package oopthird;

import java.util.Scanner;

public class ReadAndAddStudent {

	
	public Student  readStudent() {
		  Scanner sc = new Scanner (System.in);	
		Student student = new Student();
	
	System.out.print("Please, enter the student's name: ");
	student.setName(sc.nextLine());
	
	System.out.print("Please, enter the student's last name: ");
	student.setLastName(sc.nextLine());
	
	System.out.print("Please, enter the student's gender (male/female): "); 
	student.setGender(Gender.valueOf(sc.nextLine().toUpperCase())); //Ну в теорії тут можна було зробити ще й якесь цікаве exception, але не думаю, що сенс в цьому прям є)
	
	System.out.print("Please, enter the student's ID: ");
	student.setId(sc.nextInt());
	sc.nextLine(); 
	
	System.out.print("Please, enter the student's group name: ");
	student.setGroupName(sc.nextLine());
	
	return student;
	}
  
	public boolean addStudentToGroup (Student student, Group group) {
		try {
			group.addStudent(student);
			return true;
		} catch (GroupOverflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	
	
	
}
