package mm223fj_assign4.sort_cities;
import java.util.Arrays;
import java.util.Iterator;

public class SortingObject implements Iterator<City> {
	City[] townsTemp; 
	int max; 
	int nextCity=0;  

	public SortingObject(City[] towns, int numberOfCities) {
		townsTemp = towns; 
		max = numberOfCities;
		
	}
	public void Sort(){ 
		Arrays.sort(townsTemp);
		
	}

	public boolean hasNext() {
		if(nextCity >= max){
			return false; 
		}else{
		return true; 
	}
	}

	public City next() {
		return townsTemp[nextCity++];
	}

}
