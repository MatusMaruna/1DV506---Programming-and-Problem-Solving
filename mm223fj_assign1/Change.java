package mm223fj_assign1;
import java.util.Scanner; 
public class Change {
	public static void main(String[]args){
		double price; 
		int payment; 
		int change; 
		int thousandKr; 
		int fiveHundredKr; 
		int oneHundredKr; 
		int fiftyKr; 
		int twentyKr; 
		int tenKr; 
		int fiveKr; 
		int oneKr; 
		
		System.out.println("Price : "); 
		Scanner Scan = new Scanner(System.in); 
		price = Scan.nextDouble();
		System.out.println("Payment : "); 
		payment = Scan.nextInt(); 
		price = (double)Math.round(price * 100)/100; 
		change = (int) (payment - price); 
		Scan.close(); 
		if(payment<price){
			System.out.println("Not enought money");
		}else{
			System.out.println("Change: " + change); 
			thousandKr = change/1000; 
			fiveHundredKr = (change%1000)/500; 
			oneHundredKr = ((change%1000)%500)/100; 
			fiftyKr = (((change%1000)%500)%100)/50; 
			twentyKr = ((((change%1000)%500)%100)%50)/20; 
			tenKr = (((((change%1000)%500)%100)%50)%20)/10; 
			fiveKr = ((((((change%1000)%500)%100)%50)%20)%10)/5; 
			oneKr = (((((((change%1000)%500)%100)%50)%20)%10)%5)/1; 
			
			System.out.println("1000kr bills : "+thousandKr+"\n"+"500kr bills: "+fiveHundredKr+"\n"+"100kr bills: "+oneHundredKr+"\n"+"50kr bills: "+fiftyKr+"\n"+"20kr bills: "+twentyKr+"\n"+"10kr coins: "+tenKr+"\n"+"5kr coins: "+fiveKr+"\n"+"1kr coins: "+oneKr+"\n"); 
		
					
			
			
		}
	}

}
