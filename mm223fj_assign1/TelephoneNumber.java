package mm223fj_assign1;

import java.text.DecimalFormat;
import java.util.Random;

public class TelephoneNumber {
	public static void main(String[]args) {
	int X; 
	int Z; 
	int Y; 
	Random rand = new Random(); 
	
     X = rand.nextInt(999); 
     Z = rand.nextInt(((9 - 1)+1)+1);
     Y = rand.nextInt(9999); 
     DecimalFormat df1 = new DecimalFormat("000"); 
     DecimalFormat df2 = new DecimalFormat("0000"); 
     System.out.printf("Random Phone Number= "+"0"+df1.format(X)+"-"+Z+df2.format(Y)); 

}}
