package mm223fj_assign1;
import java.util.Scanner; 
public class Seconds {
	public static void main(String[]args) {
		int hours; 
		int minutes; 
		int seconds; 
		int hoursToSeconds; //used for hours to seconds
		int minutesToSeconds; //used for minutes to seconds
		int total; //used to get the total 
	System.out.println("Number of Hours:");
	Scanner Scan = new Scanner(System.in); 
    hours = Scan.nextInt(); 
    System.out.println("Number of Minutes:");
    minutes = Scan.nextInt(); 
    System.out.println("Number of Seconds:");
    seconds = Scan.nextInt(); 
    Scan.close();
    System.out.print("Hours:"+" "+hours+"\n"+"Minutes:"+" "+minutes+"\n"+"Seconds:"+" "+seconds+"\n");
    hoursToSeconds = ((hours*60)*60); //converting hours to seconds 
    minutesToSeconds = (minutes*60); //converting minutes to seconds
    total = hoursToSeconds+minutesToSeconds+seconds; 
    System.out.print("Total amount of time in Seconds: "+ total); 
    
	
	
	}

}
