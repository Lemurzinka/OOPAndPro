package oopseventh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Action {
	
	private byte[] bytes;

	private boolean turn = false; 
	private boolean stop = false;
	

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public static void copy (File out, File in) throws IOException {
		new Action(out, in);
	}
	
	private Action(File out, File in)throws IOException{
		Thread thr1 = new Thread (new Provider(this, in));
		Thread thr2 = new Thread (new Receiver(this, out, in.getName()));
		
		
		thr1.start();
		thr2.start();
		
		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized byte[] getBytes () {
		
		for (; !turn;) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

			turn = false; 
			notifyAll();
		
		return bytes;
	
		
	} 
	
	public synchronized void transferBytes (byte[] bytes) {
		
for (;!turn;) {
	
	try {
		wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	this.bytes = bytes;
	turn = true;
	notifyAll();
}
	}
	
}
