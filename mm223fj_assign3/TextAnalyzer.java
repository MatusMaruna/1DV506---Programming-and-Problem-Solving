package mm223fj_assign3;

public class TextAnalyzer{   
	private int upperCase = 0; 
	private int whiteSpace = 0; 
	private int digitCount = 0; 
	private String textAnalyze; 
	private boolean containsChar = false; 
	
public TextAnalyzer(String text){ 
	textAnalyze = text; 
}
public int charCount(){
	return textAnalyze.length();  
	}
public int whitespaceCount(){
	for(int i = 0; i<textAnalyze.length(); i++){ 
		if(textAnalyze.charAt(i) == ' '){ 
			whiteSpace++; 
		}
	}
	return whiteSpace; 
}
public int upperCaseCount(){ 
	for(int i = 0; i<textAnalyze.length(); i++){ 
		if(Character.isUpperCase(textAnalyze.charAt(i))){
			upperCase++; 
		}
	}
	return upperCase;  
}
public int digitCount(){ 
	for (int i = 0; i<textAnalyze.length(); i++) {
	    if (Character.isDigit(textAnalyze.charAt(i))) {
	        digitCount++;}
}
      return digitCount; 

}
public boolean containsChar(char ch){ 
	for (int i = 0; i<textAnalyze.length(); i++) {
		if(textAnalyze.charAt(i) == ch){
			containsChar = true; 
		}
	}
	return containsChar; 	
	}
public boolean containsString(String st){
	return textAnalyze.contains(st); 
}
	
}


	

