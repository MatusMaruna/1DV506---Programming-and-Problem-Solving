package mm223fj_assign4.stack;
import java.util.Iterator;

public class StackClass implements Stack {
	private Object[] array = {1,2,3,4,5};
	int size = array.length; 

public int size(){ 
	return size; 
}
public boolean isEmpty(){ 
	if(array.length == 0){ 
		return true; 
	}else{
		return false; 
	}
}
public void push(Object n){ 
 Object[] push = new Object[size+1];  
for(int i = 0; i<array.length; i++){ 
	push[i+1] = array[i]; 
}
push [0] = n; 
array = push;
size++; 
}
public Object pop(){
	Object[] pop = new Object[size-1]; 
	for(int i = 0; i<pop.length; i++){ 
		pop[i] = array[i+1]; 
	}
	Object top = null;
	top = array[0]; 
	array = pop; 
	size--; 
	return top;  
}
public Object peek(){ 
	return array[0];
}
public Iterator<Object> iterator() {
return new IteratorObject(array,size);}

}