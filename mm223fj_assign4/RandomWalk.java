package mm223fj_assign4;
import java.util.Random;
public class RandomWalk { 
 int stepMax; 
 int step = 0;
 public int x = 0; 
 public int y = 0; 
 int yMax = 0; 
 int xMax = 0;
 int yMin = 0; 
 int xMin = 0; 
public RandomWalk(int stepMaxSet, int sizeSet){
	stepMax = stepMaxSet; 
	yMin = -sizeSet; 
	xMin = -sizeSet; 
	yMax = sizeSet; 
	xMax = sizeSet; 
	x = 0; 
	y = 0; 
}
public void Walk(){ 
Random rand = new Random(); 
int direction = 0; 
while(x<xMax && y<yMax && y>yMin && x>xMin && step<stepMax){ 
direction = 1+rand.nextInt(4); 
if(direction == 1){x++;}
if(direction == 2){y++;}
if(direction == 3){x--;}
if(direction == 4){y--;}
step++; 
}
}
public String toString(){ 
	String str = "Number of Steps: " + step + "\n"+ "Position : ("+ x + "," + y +")" ; 
	return str; 
}
public void takeStep(){ 
Random rand = new Random(); 
int direction = 0; 
direction = 1+rand.nextInt(4); 
if(direction == 1){x++;}
if(direction == 2){y++;}
if(direction == 3){x--;}
if(direction == 4){y--;}
}
public boolean moreSteps(){ 
if(step>stepMax){ 
	return true; 
}else{ 
	return false; 
}
}
public boolean inBounds(){ 
	if(x<xMax && y<yMax && y>yMin && x>xMin){ 
		return true; 
	}else{ 
		return false; 
	}
}
}

