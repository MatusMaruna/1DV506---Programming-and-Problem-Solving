package mm223fj_assign2;
public class BirthdayCandles {
	public static void main(String[]args){
    int age;
    int candles = 0; 
	int candlesRequired = 0; 
	int boxcounter=0; 
	int box = 0; 
for(age=0; age<=100; age++){ // age from 0 to 100 adds required candles each iteration 
	candlesRequired++; 
	if(candles<candlesRequired){
	 while(candles<candlesRequired){
		 boxcounter++;   // gets more boxes until there is enough candles
		 candles = candles+24; 
		 box++; 
	 }
		System.out.println("Before birthday "+age+", buy "+box+" box(es)");
		candles = candles-age; 
		box = 0; 
	}else{
		candles = candles-age; 
	}
	while(age == 100){ // when script reaches 100 it prints out the total boxes and remaining candles 
		System.out.println("Total Number of Boxes: " + boxcounter + ", Remaining candles: " + candles);
		age++; 
}

}
}
}
