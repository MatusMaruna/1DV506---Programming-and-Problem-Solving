package mm223fj_assign3;
import java.util.Scanner; 
public class SweID {
public static void main(String[]args){
	String id; 
	System.out.println("Enter a ID number in the form YYMMDD-NNNN: ");
	Scanner scan = new Scanner(System.in); 
	id = scan.nextLine();
	System.out.println(id);
	System.out.println("Birth Date: " + getFirstPart(id));
	System.out.println("Second Part: " + getSecondPart(id));
	System.out.println("Male: " + isMale(id));
	System.out.println("Female: " + isFemale(id));
	String id2 = "990104-7777"; 
	System.out.println("Are strings Equal: " + areEqual(id,id2));
	System.out.println("Is the id valid: " + isCorrect(id));
	
}
public static int getFirstPart(String id){
	String[] integer = id.split("-"); 
	int firstPart = Integer.valueOf(integer[0]); 
	return firstPart; 
	
}
public static int getSecondPart(String id){
	String[] integer = id.split("-"); 
	int secondPart = Integer.valueOf(integer[1]); 
	return secondPart; 
}
public static boolean isMale(String id){
	String[] integer = id.split("-"); 
	String secondPart = String.valueOf(integer[1]); 
		if(secondPart.charAt(2)%2==0){ 
			return false; 	
		}else{
			return true; 
		}
	}
public static boolean isFemale(String id){ 
	String[] integer = id.split("-"); 
	String secondPart = String.valueOf(integer[1]); 
		if(secondPart.charAt(2)%2==0){ 
			return true; 	
		}else{
			return false; 
		}
	}
public static boolean areEqual(String id, String id2){ 
		if(id2.equals(id)){
			return true; 	
		}else{
			return false; 
		}
	
}
public static boolean isCorrect(String id){ 
	int check = 0; 
	int sum = 0;
	int sum1 = 0; 
	int number1 = 0; 
	int number2 = 0; 
	String[] integer = id.split("-"); 
	String firstPart = String.valueOf(integer[0]);
	String secondPart = String.valueOf(integer[1]);
	int year = Integer.parseInt(firstPart.substring(0,1));
	int year1 = Integer.parseInt(firstPart.substring(0)); 
	int year2 = Integer.parseInt(firstPart.substring(1)); 
	int month = Integer.parseInt(firstPart.substring(2,3));
	int month1 = Integer.parseInt(firstPart.substring(2)); 
	int month2 = Integer.parseInt(firstPart.substring(3)); 
	int day = Integer.parseInt(firstPart.substring(4,5));
	int day1 = Integer.parseInt(firstPart.substring(4)); 
	int day2 = Integer.parseInt(firstPart.substring(5)); 
	int n1 = Integer.parseInt(secondPart.substring(0));
	int n2 = Integer.parseInt(secondPart.substring(1));
	int n3 = Integer.parseInt(secondPart.substring(2));
	int n4 = Integer.parseInt(secondPart.substring(3));
   if(month>12||month2<0){ 
	   return false; 
   }else{
	   check++; 
   }
   if(day>31 || day2<0){ 
		return false; 
	}else{
		check++;
	}
   
   //does not work
   for(int i=0; i<firstPart.length(); i++){ 
	   int number = Integer.parseInt(firstPart.substring(i)); 
	   if(i%2==0){ 
		  if(number*2 > 9){ 
			  number1 = number%10; 
			  number2 = number/10;  
			  number = number1 + number2; 
		  }
		  sum = sum + (number * 2); 
	   
   }else{ 
	   sum = sum + (number * 1); 
   } 
   }
	   
	   for(int x=0; x<=2; x++){ 
		 int number = Integer.parseInt(secondPart.substring(x)); 
		   if(x%2==0){ 
			  if(number*2 > 9){ 
				  number1 = number%10; 
				  number2 = number/10;  
				  number = number1 + number2; 
			  }
			  sum1 = sum1 + (number * 2); 
		   
	   }else{ 
		   sum1 = sum1 + (number * 1); 
	   } 
	   }
		   if(Math.abs(((sum + sum1)%10)-10) == n4){ 
			   check++; 
		   }else{ 
			   return false; 
		   }
	   while(check == 3){ 
	   return true;  
   }
   
	return false;
} 
} 





