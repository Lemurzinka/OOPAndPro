package oopeighth;


public class Main1 {

	public static void main(String[] args) {

		
	oopeighth.Stack stack = new oopeighth.Stack();
	
	Object object = new Object();

	System.out.println(stack.toString());
		stack.push(object);
		stack.push(object);
		stack.push(object);
System.out.println(stack.toString());
System.out.println(stack.peek());
System.out.println();
System.out.println(stack.pop());
System.out.println(stack.toString());

	}

}
