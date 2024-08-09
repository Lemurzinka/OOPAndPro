package oopthird;

import java.util.Arrays;

public class Group {

	private String groupName; 
	private Student[] students = new Student[10];
	public Group(String groupName) {
		super();
		this.groupName = groupName;
		
	}
	public Group() {
		super();
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	@Override
	public String toString() {
		Student[] temp = SortStdLastName();
		StringBuilder array = new StringBuilder("Group: " + groupName + "; " + temp.length + " students: " + System.lineSeparator());
		for (Student i: temp) {
			array.append("Student: " + i.getLastName() + " " + i.getName() + "; id: " + i.getId()+ " |" + i.getGender() + System.lineSeparator() );
		}
		return array.toString();
	} 
	
	public void addStudent (Student student) throws GroupOverflowException {
		if (student != null) {for (int i = 0; i<students.length; i++) {
			if (students[i] == null) {
				student.setGroupName(groupName);
				student.setId(i+1);
				 students[i] = student; 
				 return;
				} 
			}
		
		throw new GroupOverflowException();}
		
		
		
		
		
	}
	
	public Student searchStudentByLastName (String lastName) throws StudentNotFoundException{
		
		for (int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				if (students[i].getLastName().equals(lastName)) {
					return students[i];
				}
			}
		} throw new StudentNotFoundException();
		
	}
	
	public boolean removeStudentByID (int id) {
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getId() == id ) {
					students[i] = null;
					return true;
				}
			}
		}return false; 
	}
	
	public Student [] sortStdLastName () {
		Student [] real = new Student [0];
		for (int i = 0, j = 0; i < students.length; i++) {
			if (students[i] != null) {
				real = Arrays.copyOf(real, j +1);
				real[j] = students[i];
				j++;
			}
		}
		Arrays.sort(real, (s1, s2) -> s1.getLastName().compareTo(s2.getLastName()));
	return real;
	}
	
}
