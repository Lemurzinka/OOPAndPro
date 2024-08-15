package oopseventh;

public class Dock {

	
	private int number;

	public Dock(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	} 
	
	
	public synchronized void uploadShip (Ship ship) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			ship.setBox(10-i);
			System.out.println("Dock " + number + ": " + ship.getName() + " boxes: " + ship.getBox());
			Thread.sleep(500);
		}
		System.out.println(ship.getName() + " completed uploading");
	}
	
	
}
