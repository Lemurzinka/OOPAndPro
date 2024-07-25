package oopfirst;

public class Main1 {

	public static void main(String[] args) {
		
		Products product1 = new Products(80, "Unc.", 110);
		product1.setDescription("Banana");
		
		Products product2 = new Products(70, "Cherry", 55);
		
		System.out.println(product1.toString());
		System.out.println(product2.toString()); 
	}

}
