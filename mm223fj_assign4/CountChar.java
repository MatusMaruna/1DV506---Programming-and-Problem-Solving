package mm223fj_assign4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountChar {
public static void main(String[]args) throws IOException{ 
	String path = "C:\\Users\\Lenovo\\java_courses\\1DV506\\src\\mm223fj_assign4\\CountChar.txt";
	int whiteSpace = 0; 
	int lowerCase = 0; 
	int upperCase = 0; 
	int others = 0; 
	String analyze;  
	File file = new File(path); 
	Scanner scan = new Scanner(file); 
	while(scan.hasNextLine()){ 
	analyze = scan.nextLine(); 
	for(int i = 0; i<analyze.length(); i ++){ 
	if(Character.isWhitespace(analyze.charAt(i))||analyze.charAt(i)==' '){ 
		whiteSpace++; 
	}else if(Character.isUpperCase(analyze.charAt(i))){ 
		upperCase++; 
	}else if(Character.isLowerCase(analyze.charAt(i))){ 
		lowerCase++; 
	}else if(!Character.isLetter(analyze.charAt(i))){ 
		others++;  	
	}
	}
	} 
	System.out.println("Number of upper case letters: " + upperCase); 
	System.out.println("Number of lower case letters: " + lowerCase);
	System.out.println("Number of whitespaces: " + whiteSpace );
	System.out.println("Number of others: " + others);
	scan.close(); 
	
}
// The results don't have to completely match up depending on how the text is formated
// if the text is formated differently there might be more or less white spaces similarly depending
// on the code used to analyze 
} 