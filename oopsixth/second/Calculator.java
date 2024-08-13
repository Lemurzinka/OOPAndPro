package oopsixth;

public class Calculator {
	
	public static long calculateSumOfArr (int [] arr) {
		long sum = 0; 
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
