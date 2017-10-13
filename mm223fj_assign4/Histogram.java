package mm223fj_assign4;
import java.io.File;
import java.io.IOException;
import java.util.Scanner; 
public class Histogram {
	public static void main(String []args) throws IOException{ 
	String path = "C:\\Users\\Lenovo\\java_courses\\1DV506\\src\\mm223fj_assign4\\HistogramTest.txt"; 
	int numberCount = 0; 
	int outOfBoundCount = 0; 
	int ten = 0; 
	int twenty = 0; 
	int thirty = 0; 
	int fourty = 0; 
	int fifty = 0; 
	int sixty = 0; 
	int seventy = 0; 
	int eighty = 0; 
	int ninety = 0; 
	int hundred = 0;  
	
	File file = new File(path); 
	System.out.println("Reading integers from the file: " + path); 
	Scanner scan = new Scanner(file);
	while(scan.hasNextInt()){ 
		int number = scan.nextInt(); 
		if(number<=100 && number>0){ 
			numberCount++; 
		}else{ 
			outOfBoundCount++; 
		}
		 if(number>=1 && number<=10){ten++;} 
		 if(number>=11 && number<=20){twenty++;} 
		 if(number>=21 && number<=30){thirty++;}
		 if(number>=31 && number<=40){fourty++;} 
		 if(number>=41 && number<=50){fifty++;} 
		 if(number>=51 && number<=60){sixty++;} 
		 if(number>=61 && number<=70){seventy++;} 
		 if(number>=71 && number<=80){eighty++;} 
		 if(number>=81 && number<=90){ninety++;} 
		 if(number>=91 && number<=100){hundred++;} 
	}
	scan.close(); 
	
	//Printing out the results 
	System.out.println("Numbers in the interval [1,100] :"+ numberCount);
	System.out.println("Others :" + outOfBoundCount);
	System.out.println("Histogram");
	System.out.print("1  - 10  | "); 
	for(int i = 0; i<ten; i++){System.out.print("*");}
	System.out.println("");
	System.out.print("11 - 20  | ");
	for(int i = 0; i<twenty; i++){System.out.print("*");}
	System.out.println("");
	System.out.print("21 - 30  | "); 
	for(int i = 0; i<thirty; i++){System.out.print("*");}
	System.out.println("");
	System.out.print("31 - 40  | "); 
	for(int i = 0; i<fourty; i++){System.out.print("*");}
	System.out.println("");
	System.out.print("41 - 50  | "); 
	for(int i = 0; i<fifty; i++){System.out.print("*");}
	System.out.println("");
	System.out.print("51 - 60  | "); 
	for(int i = 0; i<sixty; i++){System.out.print("*");}
	System.out.println("");
	System.out.print("61 - 70  | "); 
	for(int i = 0; i<seventy; i++){System.out.print("*");}
	System.out.println("");
	System.out.print("71 - 80  | "); 
	for(int i = 0; i<eighty; i++){System.out.print("*");}
	System.out.println("");
	System.out.print("81 - 90  | "); 
	for(int i = 0; i<ninety; i++){System.out.print("*");}
	System.out.println("");
	System.out.print("91 - 100 | "); 
	for(int i = 0; i<hundred; i++){System.out.print("*");}
}
}
