package oopfirst;

public class Phone {
    
	private long number;
    private Network network;
    
    
	

	
	public Phone(long number) {
		super();
		this.number = number;
	
	}





	public Phone() {
		super();
	}





	public long getNumber() {
		return number;
	}





	public void setNumber(long number) {
		this.number = number;
	}





	public Network getNetwork() {
		return network;
	}





	@Override
	public String toString() {
		return "Phone [number=" + number + ", network=" + network + "]";
	}





	public void setNetwork(Network network) {
		this.network = network;
	}





	public Network registration (Network network) {
		setNetwork(network);
		return network;
	}
	
	public void registerInNetwork(Network network) {
    setNetwork(network);
    network.addNumberToNetwork(this);
	} 
	
	public void callToSomeone (long number) {
		if(this.network == null) {
			System.out.println("Your phone is not registered in network");
		} else {
			Phone phone2 = this.network.getPhoneByNumber(number);
			if (phone2 == null) {
				System.out.println("The number of abonent is not registered in network");
			}else {
				phone2.incomingCall(this.number);
			}
		}
	}
	
	public void incomingCall (long number) {
		System.out.println("Incoming call from " + number + " to your number (" + this.number + ")");
	}
	
}
