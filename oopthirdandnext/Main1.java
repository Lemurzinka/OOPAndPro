package oopthird;

public class Main1 {

	public static void main(String[] args) {
		
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
		

	}

}
