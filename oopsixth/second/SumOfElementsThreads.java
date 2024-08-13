package oopsixth;



public class SumOfElementsThreads implements Runnable{

	
	private long sum = 0;
	private int begin; 
	private int finish;
	private int[] arr; 
	
	




	public SumOfElementsThreads() {
	
	}



	public SumOfElementsThreads(int[] arr, int begin, int finish) {
		super();
		this.begin = begin;
		this.finish = finish;
		this.arr = arr;
	}



public long getSum() {
		return sum;
	}



public long calculateSum () {
	long result = 0;
	for (int i = begin; i < finish; i++) {
		result = result+arr[i];
	}
	
	return result;
	
}



	@Override
	public void run() {
sum = calculateSum();
  
      
		
	}

}
