package mm223fj_assign3;
public class Point {

	private int x = 0;
	private int y = 0;
	Point p1 = null; 
	Point p2 = null; 
	public Point(int i, int j){ 
		x = i; 
		y = j; 
		
		}
	public Point(){ 
		x = 0; 
		y = 0; 
	}
	public String toString(){ 
		String toString ="("+x +","+ y+")"; 
		return toString; 
	}
	public boolean isEqualTo(Point p2){
		if(x == p2.x && y == p2.y){ 
		{
			return true; 
		} 
		}
		return false;}
	public double distanceTo(Point p2){
	double distance; 
	distance = Math.sqrt((this.x-p2.x)*(this.x-p2.x) + (this.y-p2.y)*(this.x-p2.y)); 
	return distance; 
}
	public void move(int xn, int yn){ 
	this.x = this.x + xn; 
	this.y = this.y + yn; 
}
	public void moveToXY(int xn, int yn){ 
		this.x = xn; 
		this.y = yn; 
	}
}

