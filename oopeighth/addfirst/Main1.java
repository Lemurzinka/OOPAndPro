package oopeighth;


public class Main1 {

	public static void main(String[] args) {

		
		MyStack<Integer> stack = new <Integer>MyStack(new Integer[10]);
	

	
	for (int i = 0; i <=10; i++) {
		stack.push(i);
	}

	System.out.println(stack);
System.out.println(stack.pop());
System.out.println();
System.out.println(stack.peek());
System.out.println(stack);


for (Object element : stack) {
	System.out.println(element);
}
	}

}
