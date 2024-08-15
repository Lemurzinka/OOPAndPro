package oopseventh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Receiver implements Runnable {

	private Action action; 
	private File file;
	public Receiver(Action action, File out, String fileName) throws IOException {
		super();
		this.action = action;
		file = new File (out, fileName);
		
		file.createNewFile();
	}
	@Override
	public void run() {
	
		
		try(OutputStream os = new FileOutputStream(file)){
			for (; !action.isStop();) {
				
					os.write(action.getBytes());
					}}
				 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	} 
	
	
	
	
}
