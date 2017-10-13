package mm223fj_assign1;
import java.util.Scanner; 
public class ShortName {
	public static void main(String[]args){
		String firstName; 
		String lastName; 
		char shortFirst; 
		String shortLast; 
		
		System.out.println("First Name: ");
		Scanner Scan = new Scanner(System.in); 
		firstName = Scan.nextLine(); 
		System.out.println("Last Name: ");
		lastName = Scan.nextLine(); 
		Scan.close();
		shortFirst = firstName.charAt(0); 
		if(lastName.length()<4){            // if the lastName is less than 4 characters the shortLast will only select 3 characters
			shortLast = lastName.substring(0,3); 
		}else{
		shortLast = lastName.substring(0,4); 
		}
		System.out.println("Short name: " + shortFirst+". "+shortLast);
		
		
	}

}
