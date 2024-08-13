package oopsixth;

import java.util.Random;

public class Thr2 {
	public static void main(String[] args) {

		long startSimple;
		long endSimple;
		long startThreats;
		long endThreats;
		long elapsedTime; 
		
		int[] array = new int[100000000];
		initArray(array);
		
		startSimple = System.nanoTime();
		System.out.println("Simple algorythm: sum = "+Calculator.calculateSumOfArr(array));
		endSimple = System.nanoTime();
		elapsedTime = endSimple-startSimple;
		System.out.println("Time: "+(double)elapsedTime/1000000000+"seconds");
		
		
		
		SumOfElementsThreads sum1 = new SumOfElementsThreads(array, 0, 25000000 );
		SumOfElementsThreads sum2 = new SumOfElementsThreads(array, 25000000, 50000000);
		SumOfElementsThreads sum3 = new SumOfElementsThreads(array, 50000000, 75000000);
		SumOfElementsThreads sum4 = new SumOfElementsThreads(array, 75000000, 100000000);
		
		Thread threadRange1 = new Thread(sum1);
		Thread threadRange2 = new Thread(sum2);
		Thread threadRange3 = new Thread(sum3);
		Thread threadRange4 = new Thread(sum4);
		
		threadRange1.start();
		threadRange2.start();
		threadRange3.start();
		threadRange4.start();
		
		try {
			startThreats = System.nanoTime();
			threadRange1.join();
			threadRange2.join();
			threadRange3.join();
			threadRange4.join();
			endThreats = System.nanoTime();
			elapsedTime = startThreats -endThreats;
			System.out.println("Multithread algorythm: sum = "+(sum1.getSum()+sum2.getSum()+sum3.getSum()+sum4.getSum()));
			System.out.println("Time: "+(double)elapsedTime/1000000000+"seconds");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initArray(int[] array) {
		Random rn = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(10);
		}
	}

}
