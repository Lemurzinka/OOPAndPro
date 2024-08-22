package oopthird;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Group {

	private String groupName; 
	private ArrayList<Student> students = new ArrayList<Student>();

	

	
	public Group(String groupName) {
		super();
		this.groupName = groupName;
		this.students = new ArrayList<>();
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
 
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		ArrayList<Student> temp = sortStdLastName();
		StringBuilder array = new StringBuilder("Group: " + groupName + "; " + temp.size() + " students: " + System.lineSeparator());
		for (Student i: temp) {
			array.append("Student: " + i.getLastName() + " " + i.getName() + "; id: " + i.getId()+ " |" + i.getGender() + System.lineSeparator() );
		}
		return array.toString();
	} 
	
	public void addStudent (Student student) throws GroupOverflowException {
		if (student!= null) { 
		if (students.size()<10) {
			student.setGroupName(groupName);
			students.add(student);
			student.setId(students.indexOf(student));
		}
		
			
		}}
		
		
		
		
		
	
	
	public Student searchStudentByLastName (String lastName) throws StudentNotFoundException{
		
		for (Student student : students) { 
			if (student.getLastName().equals(lastName)) {
				return student;
			}
			
		}
		 throw new StudentNotFoundException();
		
	}
	
	public boolean removeStudentByID (int id) {
		
		for (Student student : students) { 
			if (student.getId() == id) {
				students.remove(student);
				return true;
			}
			
		}return false;
		
	}
	
	public ArrayList<Student> sortStdLastName () {
		
	Collections.sort(students, new StudentsLastNameComparator());

	return students;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(groupName, students);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		return Objects.equals(groupName, other.groupName) && Objects.equals(students, other.students);
	}
	
	
	public boolean isEqualsInGroup () {
		

		
	for (int i = 0; i<students.size(); i++) {
for (int j = i+1 ; j<students.size(); j++) {
	if (students.get(i).equals(students.get(j))) {
		return true;
	}
	}

}
	
		return false;
		
	}
	
	
}
