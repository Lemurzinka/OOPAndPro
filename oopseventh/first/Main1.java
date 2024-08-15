package oopseventh;

public class Main1 {

	public static void main(String[] args) {
		Port port = new Port();
		
		Ship ship = new Ship(false, 10, port, "Alaska2");
		Ship ship2 = new Ship(false, 10, port, "Alaska1");
		Ship ship3 = new Ship(false, 10, port, "Alaska12");
		
		Port port1 = new Port();
		Port port2 = new Port();

		
		Thread thr1 = new Thread(ship);
		Thread thr2 = new Thread(ship2);
		Thread thr3 = new Thread(ship3);
		
		
		thr1.start();
		thr2.start();
		thr3.start();
		
	}

}
