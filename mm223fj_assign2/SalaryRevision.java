package mm223fj_assign2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 
public class SalaryRevision {
	public static void main(String[]Args){
		System.out.println("Provide salaries (and terminate input with 'X'):");
		ArrayList<Integer> salary = new ArrayList<Integer>(); 
		Scanner scan = new Scanner(System.in); 
		int value; 
		int counter = 0; 
		int sum = 0;
		String scanner; 
		do{
			scanner = scan.next(); 
			if (scanner.equals("x")||scanner.equals("X")){
				Collections.sort(salary);
				int gap = salary.get(counter-1)-salary.get(0); 
				System.out.println(salary);
				System.out.println("Gap: " + gap);
				int average; 
				for(int i = 0; i < salary.size(); i++)
			    {
			        sum = sum + salary.get(i);
			    }
				average = sum/salary.size(); 
				System.out.println("Average : "+ average);
				if (salary.size()%2 == 0 ){
				int middle = (salary.size() / 2); 
				int median1 = salary.get(middle); 
				int median2 = salary.get(middle-1); 
				int median = (median1 + median2) / 2; 
				System.out.println("Median:  " + median);
				}else{
				int middle = (salary.size() / 2); 
				int median = salary.get(middle); 
				System.out.println("Median:  " + median);
				}
			}else{
				value = Integer.parseInt(scanner); 
				salary.add(value);
				counter++; 
			}
		}
		while(!scanner.equals("x")||!scanner.equals("X")); 
	}
	

}
