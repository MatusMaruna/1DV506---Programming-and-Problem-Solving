package mm223fj_assign1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner; 
public class Distance {
	public static void main(String[]args) {
		String xy1; 
		String xy2; 
		int x1; 
		int y1; 
		int x2; 
		int y2; 
		double distance; 
		
		System.out.println("Please enter the first Coordinate in the form X,Y:  ");
		Scanner Scan = new Scanner(System.in); 
		xy1 = Scan.nextLine(); 
		System.out.println("Please enter the second Coordinate in the form X,Y:  ");
		xy2 = Scan.nextLine(); 
		Scan.close();
		String[] integer = xy1.split(",");
		x1 = Integer.valueOf(integer[0]); 
		y1 = Integer.valueOf(integer[1]); 
		String[] integer2 = xy2.split(","); 
		x2 = Integer.valueOf(integer2[0]); 
		y2 = Integer.valueOf(integer2[1]); 
		distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)); 
		System.out.println(x1+" "+y1+" "+x2+" "+y2);
		NumberFormat df = new DecimalFormat("#0.000");     
		System.out.println("The distance is : "+df.format(distance));
		
	}

}
