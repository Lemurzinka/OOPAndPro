package oopeighth;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyStack<T> implements Iterable<T>{
	private T[] dataArray; 
private int top = 0;
    

    


	public MyStack(T[] dataArray) {
	super();
	this.dataArray = dataArray;

}

	public void push (T value) {
    	if (top >= dataArray.length) up ();
    		dataArray[top] =  value;
    		top +=1;
   
 		
    	}
    

    public Object pop () {
    	T element = null;
    	if (top != 0) {
    		top --;
    		element = (T) dataArray[top];
    		dataArray[top] = null;
    	}
    
    	return element;
    }
    
    
    public Object peek () {
    	T element = null; 
    	if (top != 0) {
    		
    		element = dataArray[top-1];
    		
    	}
    	return element;
    }
    

    public void up () {
    	T [] old = dataArray;
    	int newCapacity = dataArray.length *3/2+1;
    	dataArray= Arrays.copyOf(old, newCapacity);
    	
    }



	@Override
	public String toString() {
		return "Stack [dataArray=" + Arrays.toString(dataArray) + ", top=" + top + "]";
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private int currentElement = top-1;

			@Override
			public boolean hasNext() {
				return (currentElement >0) && (top !=0);
			}

			@Override
			public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return dataArray[currentElement--];
			}
		
		
		};
	
	}


    
    
}
