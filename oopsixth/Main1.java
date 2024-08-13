package oopsixth;

public class Main1 {

	public static void main(String[] args) {
	Thread [] thr = new Thread[100];
	
	 
	 for (int i = 0; i<thr.length; i++) {
		 thr[i] = new Thread(new FactorialThreads(i));
		 thr[i].start();
		 try {
			thr[i].sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
	 }

	}

}
