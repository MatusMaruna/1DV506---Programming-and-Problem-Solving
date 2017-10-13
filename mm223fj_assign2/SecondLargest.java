package mm223fj_assign2;
import java.util.Scanner; 
public class SecondLargest {
	public static void main(String[]args){
		int num; 
		int i = 1;
		int large = 0; 
		int secondLarge = 0; 

		Scanner scan = new Scanner(System.in);
		
		while(i<11){ // starting at one so i<11 for 10 digits
			System.out.println("Please provide a digit"); 
			num = scan.nextInt();
			i++; 

		if(num >=large){
			secondLarge = large; 
			large = num;
		}

		if(num >=secondLarge && num < large){
			secondLarge = num; 
		}
			
			
		}
		System.out.println("The second largest is :" + secondLarge);
		scan.close(); 
		}
		}
			


	

