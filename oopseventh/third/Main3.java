package oopseventh;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main3 {

	public static void main(String[] args) {
		String fileName = "smth.txt"; 
        String directoryPath = "C:\\Users\\DENIS\\ForTest";
	
	File directory = new File (directoryPath);
	if (!directory.exists() || !directory.isDirectory()) {
		return;
	}
	
	List<File> found = new ArrayList<File>();
	ExecutorService exe = Executors.newFixedThreadPool(10);
	search(directory, fileName, found, exe);
	exe.shutdown();
	if(found.isEmpty()) {
		System.out.println("No such file.");
	}else {
		System.out.println("Files: " + fileName + ":");
		for(File file: found) {
			System.out.println(file.getAbsolutePath());
		}
	}
	}
	
private static void search (File dir, String name, List<File> found, ExecutorService exe) {
	File[] files = dir.listFiles();
	if (files != null) {
		for (File file: files) {
			if (file.isDirectory()) {
				search (file, name, found, exe);
				
			}else {
				exe.execute(new FileSearch(file, name, found));
			}
		}
	}
} 
}
