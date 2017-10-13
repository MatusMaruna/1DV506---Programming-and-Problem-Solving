package mm223fj_assign4.sort_cities; 
import java.io.File;
import java.io.IOException; 
import java.util.*; 
public class SortCities {
public static void main(String[]args)throws IOException{ 
	
String path = "C:\\Users\\Lenovo\\java_courses\\1DV506\\src\\mm223fj_assign4\\sort_cities\\Cities.txt"; 
System.out.println("Reading cities from file: " + path);
String name = ""; 
String whole;
String codeString;
List <City> cityZip = new ArrayList<City>();
int zip = 0;  

File file = new File(path); 
Scanner scan = new Scanner(file);

while(scan.hasNextLine()){
whole = scan.nextLine(); 
String[] string = whole.split(";"); 
name = String.valueOf(string[0]);
codeString = String.valueOf(string[1]); 
zip = Integer.parseInt(codeString); 
cityZip.add(new City(name,zip));
Collections.sort(cityZip);
}
for(City i: cityZip){
	System.out.println(i);
}
scan.close(); 
}


}
