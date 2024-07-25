package oopfirst;

public class Main1 {

	public static void main(String[] args) {
		
		Product product1 = new Product(80, "Unc.", 110);
		product1.setDescription("Banana");
		
		Product product2 = new Product(70, "Cherry", 55);
		
		System.out.println(product1.toString());
		System.out.println(product2.toString()); 
	}

}
