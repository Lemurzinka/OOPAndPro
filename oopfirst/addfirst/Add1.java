package oopfirst;

public class Add1 {

	public static void main(String[] args) {

		Network network = new Network();
		Phone phone1 = new Phone(976643321L);
		Phone phone2 = new Phone(975552220L);

phone1.registerInNetwork(network);
phone2.registerInNetwork(network);

phone1.callToSomeone(975552220L);
	}

}
