package mm223fj_assign4.stack;
import java.util.Scanner; 
import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {
		Stack stack = new StackClass(); 
		System.out.println("Is the Array empty: " +stack.isEmpty()); 
		System.out.println("The size of the array: " +stack.size());
		System.out.println("The top element is: " + stack.peek()); 
		System.out.println("Input next element: ");
		Scanner scan = new Scanner(System.in); 
		Object element = scan.nextLine();  
		stack.push(element);
		scan.close();
		System.out.println("Now the top element is: " + stack.peek());
		System.out.println("Removing the top element: " + stack.pop());
		Iterator<Object> it = stack.iterator(); 
		System.out.println("Printing all of the elements: "); 
		while(it.hasNext()){ 
		System.out.println(it.next()); 
	}

}
}
