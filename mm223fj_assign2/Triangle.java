package mm223fj_assign2;
import java.util.Scanner; 
public class Triangle {
	public static void main(String [] args){
	        int number; 
	        Scanner scan = new Scanner(System.in); 
	        number = scan.nextInt(); 
	        scan.close();
	        if (number%2 == 0 || number < 0   ){ // check if the number is odd and positive
	        	System.out.println("The number needs to be positive and Odd");
	        }else{
	        
	        System.out.println("Right angle triangle:"); 
	        for(int m = 0; m<number; m ++){
	        	for (int z = m; z <number; z++){
	        		System.out.print(" "); // spaces
	        	}
	        	for(int d = 0; d <=m; d++){
	        		System.out.print("*"); // stars
	        		
	        	}
	        System.out.println(""); // move to the next line
	        
	        	}
	        System.out.println("Isosceles Triangle:"); 
	        for(int i = 0; i < number; i++) {
	        	for (int x = i; x < number; x++) {
	                System.out.print(" ");   
	                
	            }
	            for (int y = 0; y <= i; y++) {
	                    System.out.print("*");
	                    System.out.print(" ");
	            }
	            System.out.println("");
	            scan.close(); 
	        }
	        }
	}
}
	    

	
	        
	



