package mm223fj_assign2;
public class Reverse {
public static void main(String[]args){
	char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 
 			's', 'i', 'h', 'T' };
	System.out.println(text);
	int r = 0; 
	char[] reverse = new char[text.length]; 
	for(int i = text.length - 1; i >=0; i-- ){
		reverse[r] = text[i]; 
		r++; 
	}
	System.out.println(reverse);
	
}
}
