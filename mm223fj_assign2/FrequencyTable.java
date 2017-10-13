package mm223fj_assign2;

import java.util.Random;

public class FrequencyTable {
public static void main(String[]args){
	Random rand = new Random(); 
	int number;  
	int rolls[] = new int[6000]; 
	for (int i = 0; i<=5999; i++){     
		number = 1+ rand.nextInt(6) ; 
		rolls[i] = number; 
	}
	int[] freq = new int[6];
	
	for (int i = 0; i < rolls.length; i++) {
	    freq[rolls[i]-1]++;
	}

	for (int i = 0; i < freq.length; i++) // printing out of the freq table
	    System.out.println((i + 1) + ": " + freq[i]);

	
	
}
}
