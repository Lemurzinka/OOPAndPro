package oopfirst;

import java.util.Arrays;

public class Network {

	private Phone[] numbers = new Phone[0];

	public Network() {
		super();
	} 
	
	public Phone [] getRegisteredNumbers () {
		return numbers;
	}
	
	public void setRegisteredNumbers (Phone[]registeredNumbers ) {
		this.numbers = registeredNumbers;
	}
	
	
	
@Override
	public String toString() {
		return "Network [numbers=" + Arrays.toString(numbers) + "]";
	}

public void addNumberToNetwork (Phone number) {
	Phone [] temp = this.numbers;
	Phone [] phonesInNetwork = new Phone[temp.length + 1];
	for (int i = 0; i < temp.length; i++) {
		phonesInNetwork[i] = temp[i];
	}
	phonesInNetwork[phonesInNetwork.length - 1] = number;
	this.numbers = phonesInNetwork;

}
	
	public Phone getPhoneByNumber (long number) {
		Phone [] registeredNumbers = this.getRegisteredNumbers();
		for (int i = 0; i < registeredNumbers.length; i++) {
			if (registeredNumbers[i].getNumber() == number) {
				return registeredNumbers[i];
			}
		}
		return null;
	}
	
	
	
	
	
	
}
