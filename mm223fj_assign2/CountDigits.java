package mm223fj_assign2;
import java.util.Scanner; 
public class CountDigits {
	public static void main(String[]args){
		String number; 
		int zero = 0; 
		int odd = 0;  
		int even = 0;  
		System.out.println("Please enter your number");
		
		Scanner scan = new Scanner(System.in); 
		number = scan.nextLine(); 
		scan.close(); 
		int length = number.length(); 
		for (int i = 0;  i<length; i++){
			number.charAt(i); 
			 if(number.charAt(i) != '0'  && number.charAt(i) %2 == 0 ){ // gets the digit at 'i' position and tests if its even odd or zero
					even++; 
				}else if(number.charAt(i)%2 != 0){
					odd++; 
				}else{
					zero++; 
				}
		}
		System.out.println("Zeros: " + zero);
		System.out.println("Odd: " + odd);
		System.out.println("Even: " + even);
		
	}
	

}