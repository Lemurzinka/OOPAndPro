package oopseventh;

public class Port  {
  private Dock[] docks = {new Dock(1), new Dock(2)};
  
  public void dockDistribution (Ship ship) throws InterruptedException {
	  
	  
	  if (ship.isTurn() == true) {
		  docks[0].uploadShip(ship);
		  
	  }
	  else {
		  docks[1].uploadShip(ship); 
	  }
	  
  }

  
}
