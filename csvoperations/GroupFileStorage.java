package oopthird;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GroupFileStorage {



	 GroupFileStorage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 void saveGroupToCSV (Group gr) throws IOException {
		File file = new File (gr.getGroupName()+ ".csv");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			for(Student i: gr.getStudents()) {
				if (i != null) {
					bw.write(new CSVStringConverter().toStringRepresentation(i));
					bw.newLine();
				}
			}}catch(IOException e ) {
				throw e; 
			}
	}
	
Group loadGroupFromCSV(File file) throws IOException {
		Group gr = new Group(file.getName().replace(".csv", ""));
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String temp = "";
			
			for (int i = 0;; i++) {
				temp = br.readLine();
				if (temp == null) {
					break;
				}
				try {Student st = new CSVStringConverter().fromStringRepresentation(temp);
				gr.addStudent(st);
				}catch (GroupOverflowException e) {
					System.out.println(e);
				}
				
			}return gr;
		}catch (IOException e) {
			throw e;
		}
	}
	
	File findFileByGroupName (String groupName, File workFolder) {
		if (workFolder.isDirectory()) {
			File [] files = workFolder.listFiles();
			for (File file: files){
				if (file.isFile() && file.getName().replace(".csv", "").equalsIgnoreCase(groupName)) {
					return file;
				}
			}
		}System.out.println("No such file");
		return null;
	}
	

	
	
	
	
}
