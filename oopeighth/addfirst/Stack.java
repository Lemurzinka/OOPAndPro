package oopeighth;

import java.util.Arrays;

public class Stack {
	private Object[] dataArray; 
    private int size; 
    private int capacity; 
    private final int MAX_STACK_SIZE = Integer.MAX_VALUE -1;
	
    
    
    public Stack () {
    	dataArray = new Object[0];
    	capacity = dataArray.length;
    	size= 0;
    }
    
    public void push (Object value) {
    	if (size >= capacity) {
    		boolean resize = up();
    		if (!resize) {
    			throw new RuntimeException("Can not add element");
    		}
    		dataArray[size] = value;
    		size +=1;
   
 		
    	}
    }

    public Object pop () {
    	if (size == 0) {
    		return null;
    	}
    	size -=1;
    	Object element = dataArray[size];
    	dataArray[size] = null;
    	return element;
    }
    
    
    public Object peek () {
    	if (size == 0) {
    		
    		return null;
    		
    	}
    	return dataArray[size-1];
    }
    
    public int size() {
    	return size; 
    }
    
    public boolean up () {
    	
    	if (capacity >= MAX_STACK_SIZE) {
    		return false;
    	}
    	
    	long newCapacityL = (capacity *3L) / 2L+1L;
    	int newCapacity = (newCapacityL < MAX_STACK_SIZE) ? (int) newCapacityL:MAX_STACK_SIZE;
    	dataArray = Arrays.copyOf(dataArray, newCapacity);
    	capacity = newCapacity;
    	return true;
    	
    }

	@Override
	public String toString() {
		return "Stack [dataArray=" + Arrays.toString(dataArray) + ", size=" + size + ", capacity=" + capacity
				+ ", MAX_STACK_SIZE=" + MAX_STACK_SIZE + "]";
	}


    
    
}
