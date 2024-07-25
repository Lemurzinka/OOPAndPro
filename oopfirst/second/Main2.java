package oopfirst;

public class Main2 {

	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle(5, 3, 4);
		Triangle triangle2 = new Triangle(4.5, 2.4, 4);
		
		System.out.println(triangle1.calculateTheArea());
		System.out.println(triangle2.calculateTheArea());
	}

}
