package mm223fj_assign1;
import java.util.Scanner; 
public class Convert {
	public static void main(String[]Args){
		double farenheit; 
		double celsius; 
		
		System.out.println("Farenheit : "); 
		Scanner Scan = new Scanner(System.in); 
		farenheit = Scan.nextDouble(); 
		Scan.close();
		celsius = (farenheit - 32)*5/9; 
		System.out.printf("%.1f",celsius);  
		
	}

}
