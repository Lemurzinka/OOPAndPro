package oopsecond;

public class Main1 { public static void main (String [] args) {
	Cat cat1 = new Cat ("fish", "white", 3, "Alaska");
	Dog dog1 = new Dog("bone", "black", 15, "Mars");
	
	Veterinarian vet1 = new Veterinarian("Serjo");
	
	vet1.treatment(dog1);
	vet1.treatment(cat1);
}

}
