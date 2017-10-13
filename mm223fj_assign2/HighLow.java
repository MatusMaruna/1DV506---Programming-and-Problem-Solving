package mm223fj_assign2;
import java.util.Random;
import java.util.Scanner;  
public class HighLow {
	public static void main(String[] args) {
		int number; 
		int guess; 
		int i = 1;  // number of iterations of the script
		System.out.println("Guess the number between 1-100");
		Scanner scan = new Scanner(System.in); 
		guess = scan.nextInt(); 
		Random rand = new Random(); 
	    number = rand.nextInt(100);
	    while(i!=4) {  // since it's starting at one then number of guesses will be 3 higher
		if (number > guess)	{                            
         System.out.println("Guess "+ i+ " : " + guess);
         System.out.println("Clue : " + "higher");
         i ++; // add one to iteration 
         if(i<4) // if i<4 there is no more guesses
 		guess = scan.nextInt(); 
		}
	    if(guess > number) {
	    	System.out.println("Guess "+ i+ " : " + guess);
	         System.out.println("Clue : " + "lower");
	         i ++; 
	         if(i<4){
	         guess = scan.nextInt(); }
	    }
	    if(guess == number){
			System.out.println("You won the game!");
	    }
	    if(i==4){
	    	System.out.println("The number was : " +number);
			System.out.println("You lost the game!"); 

		}	 
		}
	}
}
	

	
	

	


