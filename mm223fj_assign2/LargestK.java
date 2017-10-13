package mm223fj_assign2;
import java.util.Scanner; 
public class LargestK {
	public static void main(String[]args){
		int k; 
		int sum;
		int i=0; 
		System.out.print("Please enter an integer: ");
		Scanner Scan = new Scanner(System.in); 
		k = Scan.nextInt(); 
		Scan.close(); 
		for(sum = 0;  sum+i<k; ){ // k is the input
		i++; 
		i++;  //increases by 2 
		sum = sum + i; // sum of the numbers + i 
		}
		System.out.println("The largest K is " + i);
		}
		}

			
