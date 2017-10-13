package mm223fj_assign4.sort_cities;
import java.lang.Comparable; 
public class City implements Comparable<City> {
	
	int size = 0;
	private String name;
	private int zip; 
	
	public City(String name, int zip){
		this.name = name; 
		this.zip = zip;
		size++; 
	}
	
	public String getCity(){return name;}
	
	public int getCode(){return zip;}
	
	public int getSize() {
		return size;
	}
	@Override
	public String toString() {
	    return "City: " + name + " Code: "  + zip + "\n"; 
	}
	
	public int compareTo(City compareCity) {
		int compareZip = ((City)compareCity).getCode();
		return this.zip - compareZip;
	}
	}
	
