package mm223fj_assign1;
import java.util.Scanner; 
public class BMI {
	public static void main(String[]args) {
		double height; 
		double weight; 
		double bmi; 
		
		System.out.println("Please enter your height in meters:");
		Scanner Scan = new Scanner(System.in);
		height = Scan.nextDouble();
		System.out.println("Please enter your weight in kilograms:");
		weight = Scan.nextDouble();
		Scan.close(); 
		bmi = (weight/(height*height)); // BMI is calculated with the formula weight/(height)^2
		 System.out.printf("Height:"+" "+height+"\n"+"Weight:"+" "+weight+"\n"+"BMI:"+" "+Math.round(bmi)+"\n"); 
		 
		
		
	}
	

}
