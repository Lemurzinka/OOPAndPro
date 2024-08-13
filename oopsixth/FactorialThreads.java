package oopsixth;

import java.math.BigInteger;

public class FactorialThreads implements Runnable{

private int number; 
private BigInteger result = BigInteger.ZERO;

	
	
	public FactorialThreads(int number) {
	super();
	this.number = number;

}



	public BigInteger getResult() {
		return result;
	}



	public BigInteger calculateFactorial(int n) {
		BigInteger bi = new BigInteger("1");
		for (int i = 2; i<= n; i++ ) {
			bi = bi.multiply(new BigInteger("" + i));
		}
		return bi;
	}


	@Override
	public void run() {
		Thread thr = Thread.currentThread();

			BigInteger fact = calculateFactorial(this.number);
			System.out.println(thr.getName() + "->" + fact);


		
	}

}
