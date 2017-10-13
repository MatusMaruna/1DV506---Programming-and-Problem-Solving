package mm223fj_assign2;
import java.util.Scanner; 
public class Backwards {
	public static void main(String[]args) {
		
		String text; 
		String reverse = ""; 
		System.out.println("Provide a string of text: "); 
		Scanner Scan = new Scanner(System.in); 
		text = Scan.nextLine(); 
		Scan.close(); 
		for (int i = text.length()-1; i >=0; i--){
			reverse = reverse + text.charAt(i);
		}
		System.out.println(reverse); 
		
		
		
		
	}

}
