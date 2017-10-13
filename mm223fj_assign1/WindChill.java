package mm223fj_assign1;
import java.util.Scanner; 
public class WindChill {
	public static void main(String[]args){
		double windSpeed; 
		double temperature; 
		double windChill;
 
		
		System.out.println("Please enter the temperature in Celcius: "); 
		Scanner Scan = new Scanner(System.in); 
		temperature = Scan.nextDouble();
		System.out.println("Please enter the wind speed in m/s: ");
		windSpeed = Scan.nextDouble(); 
		Scan.close();
		windChill = 33+(temperature-33)*(0.474+0.454*Math.sqrt(windSpeed)-0.0454*windSpeed); 
		System.out.printf("Wind Chill Temperature : "+"%.1f",windChill);
		
	}

}
