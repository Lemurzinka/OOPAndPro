package oopthird;

public class CSVStringConverter implements StringConverter {

	@Override
	public String toStringRepresentation(Student student) {
		
		String toStringr = (student.getName() + ";" + student.getLastName()+ ";" + student.getGender()+ ";" + student.getId() + ";" + student.getGroupName());
		
		return (toStringr);
	}

	@Override
	public Student fromStringRepresentation(String str) {
		
		Student newStudent = new Student();
		String [] words = str.split("[;]");
		newStudent.setName(words[0]);
		newStudent.setLastName(words[1]);
		newStudent.setGender(Gender.valueOf(words[2]));
		Integer id = null;
		newStudent.setId((id.valueOf(words[3])));
		newStudent.setGroupName(words[4]);
		
		return newStudent;
	}

	
	
}
