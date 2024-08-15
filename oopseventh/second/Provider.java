package oopseventh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.Provider.Service;

public class Provider implements Runnable {
private Action action;
private File file; 
private int buffer = 1_000_000;
private long length;
private long available;
private ProgressPrinter pp = new ProgressPrinter();





public Provider(Action action, File file) {
	super();
	this.action = action;
	this.file = file;
	this.length = file.length();
	available = length;
}

private class ProgressPrinter implements Runnable {

	@Override
	public void run() {
	for (;available>0;) {
		System.out.println((int) ((length - available) / (length / 100)) + "% copied");
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	System.out.println("Finish of the process.");
	}
	
	
}




@Override
public void run() {
Thread thr = new Thread(pp);
thr.start();

try (InputStream is = new FileInputStream(file)){
	byte[] bytesArray = new byte [(int) (length % buffer)];
	readSend(is, bytesArray);
	for (; available>0;) {
		bytesArray = new byte[buffer];
		readSend(is, bytesArray);
	}
	action.setStop(true);
	thr.join();
}catch(InterruptedException | IOException e) {
	e.printStackTrace();
}
	
}

private void readSend (InputStream is, byte[] bytes) throws IOException {
	is.read(bytes);
	action.transferBytes(bytes);
	available -= bytes.length;
}


}
