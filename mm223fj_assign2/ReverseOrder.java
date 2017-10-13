package mm223fj_assign2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
public class ReverseOrder {
public static void main(String[]args){
	System.out.println("Enter positive integers. End by giving a negative integer");
	ArrayList<Integer> numbers = new ArrayList<Integer>(); 
	Scanner scan = new Scanner(System.in); 
	int value; 
	
	do{
		value = scan.nextInt(); 
		if (value <= 0){
			Collections.reverse(numbers);
			int count = numbers.size(); 
			System.out.println("Number of positive integers in Arraylist : " + count); 
			System.out.println(numbers);
		}else{
			numbers.add(value); 
		}
	}
	
	while(value > 0); 
	
	scan.close(); 


}
}
