package mm223fj_assign2;
import java.util.Scanner; 
public class CountA {
	public static void main(String[]args){
		int countSmall=0; 
		int countBig = 0; 
	    String sentence; 
	    
		System.out.println("Provide a line of text: ");
		Scanner Scan = new Scanner(System.in); 
		sentence = Scan.nextLine(); 
		Scan.close();
		for( int i=0; i<sentence.length(); i++ ) { //Scans through the sentence
		    if( sentence.charAt(i) == 'a'  ) {
		        countSmall++;
		    }
		    if (sentence.charAt(i) =='A'){
		    	countBig++; 
		    }
		    
		}
		System.out.println("Number of small As : " + countSmall); 
		System.out.println("Number of big As: " + countBig);
	}

}
