package oopseventh;

public class Ship implements Runnable{

	private boolean turn; 
	private int box;
	private Port port; 
	private String name;




	public Ship(boolean turn, int box, Port port, String name) {
		super();
		this.turn = turn;
		this.box = box;
		this.port = port;
		this.name = name;
	}




	public boolean isTurn() {
		return turn;
	}




	public void setTurn(boolean turn) {
		this.turn = turn;
	}


	public int getBox() {
		return box;
	}



	public void setBox(int box) {
		this.box = box;
	}



	public Port getPort() {
		return port;
	}




	public void setPort(Port port) {
		this.port = port;
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}









	@Override
	public void run() {
		try {
			port.dockDistribution(this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
