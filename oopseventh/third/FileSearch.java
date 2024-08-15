package oopseventh;

import java.io.File;
import java.util.List;

public class FileSearch implements Runnable {

	private File file; 
	private String name; 
	private List<File> found;
	
	public FileSearch(File file, String name, List<File> found) {
		super();
		this.file = file;
		this.name = name;
		this.found = found;
	}
	@Override
	public void run() {
	if(file.getName().equals(name)) {
		synchronized (found) {
			found.add(file);
		}
	}
	}
	
	
}
