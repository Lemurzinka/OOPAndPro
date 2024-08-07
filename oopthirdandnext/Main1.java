package oopthird;

import java.io.File;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args)   {
		
		Student student1 = new Student("Denis", "Dan", Gender.MALE);
		Student student2 = new Student("Jack", "Clones", Gender.MALE);
		Student student3 = new Student("Polo", "Alpo", Gender.MALE);
		Student student4 = new Student("Poko", "Kastro", Gender.MALE);
		
		Group g1 = new Group("UP-22-1");
		try {
			g1.addStudent(student4);
			g1.addStudent(student2);
			g1.addStudent(student3);
			
		} catch (GroupOverflowException e) {
			
			e.printStackTrace();
		}
		System.out.println(g1.toString());
		
		try {
			System.out.println(g1.searchStudentByLastName("Kastro"));
			System.out.println(g1.searchStudentByLastName("Lanko"));
		} catch (StudentNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(g1.removeStudentByID(1));
		System.out.println(g1.removeStudentByID(11));
		System.out.println(g1.toString());
		
		
//		ReadAndAddStudent ra = new ReadAndAddStudent();
//		System.out.println(ra.readStudent());
		
		CSVStringConverter csv = new CSVStringConverter();
		String csv1 = csv.toStringRepresentation(student1);
		
	    System.out.println(csv.toStringRepresentation(student1));
	    System.out.println(csv.fromStringRepresentation(csv1));
	    
	    
	    
	    GroupFileStorage gfs = new GroupFileStorage();
	    
	    
	    
File file1; 
File file2;
CompareFiles cf = new CompareFiles();
 if (args.length ==2) {
	 file1 = new File(args[0]);
	 file2 = new File(args[1]);
 }else {
		file1 = new File("D:\\new.csv");
		file2 = new File("D:\\\\new-copy.csv");
	}
	   cf.isEquels(file1, file2);

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	  
	}

}
