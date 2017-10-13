package mm223fj_assign1;
import java.util.Scanner; 
public class Time {
public static void main(String[]args){
	int seconds; 
	int hours;
	int minutes; 
	int leftOver; // seconds for output
	
	System.out.println("Enter the amount of Seconds");
	Scanner Scan = new Scanner(System.in); 
	seconds = Scan.nextInt();
	Scan.close();
	hours = seconds/3600;
	if (seconds>3600){
	System.out.println("Hours: "+hours);
	}else{
	System.out.println("Hours:"+" 0");
	}
	minutes = (seconds%3600)/60; 
	System.out.println("Minutes: "+minutes);
	leftOver = (seconds%3600)%60; 
	System.out.println("Seconds: "+leftOver); 
	System.out.println("Total time measured in seconds: " + seconds);
}
}
