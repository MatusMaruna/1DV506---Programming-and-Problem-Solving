package mm223fj_assign4;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner; 
public class DrunkenWalk {
public static void main(String[]args){ 
int size; 
int steps; 
int walks;
int fell = 0; 

Scanner scan = new Scanner(System.in); 
System.out.println("Enter the size: ");
size = scan.nextInt(); 
int xMax = size; 
int yMax = size;
int yMin = -size;
int xMin = -size; 
System.out.println("Enter the number of Steps: ");
steps = scan.nextInt(); 
System.out.println("Enter the number of Walks: "); 
walks = scan.nextInt();
for(int i = 0; i<walks; i++){ 
RandomWalk drunk = new RandomWalk(steps,size+1); // +1 will be the amount of water tiles that surround the "platform"
for(int x = 0; x<steps; x++){ 
	drunk.takeStep(); 
if(drunk.x>xMax || drunk.x<xMin || drunk.y<yMin || drunk.y>yMax ){
	fell++;  
	x = steps; 
}
}
}
double fellRatio = (fell * 100f) / walks; 
NumberFormat formatter = new DecimalFormat("#0.00");
System.out.println("Out of " + walks + " drunk people, " + fell + "(" + formatter.format(fellRatio) +"%" + ") " + "fell into water." );
scan.close();
}
}
