package mm223fj_assign4.stack;

import java.util.Iterator;

public class IteratorObject implements Iterator<Object> {
	private Object[] elements;
	private int max; 
	private int nextElement = 0; 
	
	public IteratorObject(Object[] array, int size) {
		elements = array; 
		max = size; 
	}

	public boolean hasNext() {
		if(nextElement >= max){
			return false; 
		}else{
		return true;
	}
	}

	public Object next() {
		return elements[nextElement++]; 
	}

}
