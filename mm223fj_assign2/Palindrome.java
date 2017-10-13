package mm223fj_assign2;
import java.util.Scanner; 
public class Palindrome {
	public static void main(String[]args){
	String text; 
	int i = 0; 
	int x = 0; 
	int p = 1; 
	System.out.println("Please enter a string: ");
	Scanner Scan = new Scanner(System.in); 
	text = Scan.nextLine(); 
	Scan.close(); 
	text = text.toLowerCase(); // changes everything to lowercase because big A does not equal small a 
	while(i<text.length()){	
		i++; 
	if(text.charAt(x)==text.charAt(text.length()-p)){ // compares string starting at the first letter and the last letter
		x++; 
		p++; 
	}else{
		System.out.println("Not a palindrome");
		return; 
	}
	while(i==text.length()){
	   System.out.println("Text is a palindrome");
	   i++; 
	}
	}
	
	
	}
}
