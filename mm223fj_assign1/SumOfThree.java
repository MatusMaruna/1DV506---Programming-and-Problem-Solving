package mm223fj_assign1;
import java.util.Scanner; 
public class SumOfThree {
	public static void main(String[]args){
		int sum; 
		String number; 
		int firstDigit; 
		int secondDigit; 
		int thirdDigit; 
		
		System.out.println("Provide a three digit number:");
		Scanner Scan = new Scanner(System.in); 
		number = Scan.nextLine(); 
		Scan.close();
		
	    firstDigit = Integer.parseInt(String.valueOf(number).substring(0,1));
	    secondDigit = Integer.parseInt(String.valueOf(number).substring(1,2)); 
	    thirdDigit = Integer.parseInt(String.valueOf(number).substring(2,3)); 
	    sum = firstDigit + secondDigit + thirdDigit; 
	    System.out.println("Sum of Digits: "+sum); 
		

		
	}

}
