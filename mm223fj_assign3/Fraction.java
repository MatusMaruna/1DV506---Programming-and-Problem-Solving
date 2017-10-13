package mm223fj_assign3;

public class Fraction {
private int numerator = 0; 
private int denominator = 1; 


public Fraction(int n, int d){ 
	numerator = n; 
	denominator = isDenomNegative(d); 
	
}
public Fraction(){ 
	int numerator; 
	int denominator; 
}
public boolean isNegative(){
	if(this.numerator<0){ 
		return true; 
	}else{ 
		return false; 
	}
	
}
public int getNumerator(){ 
	return this.numerator; }
public int getDenominator(){  
	return this.denominator; } 
public boolean isEqualTo(Fraction x){ 
	if(x.numerator == this.numerator && x.denominator == this.denominator ){ 
		return true; 
	}else{ 
		return false; 
	}
	}
public Fraction add(Fraction x){ 
	Fraction sum = new Fraction();
	this.simplify(); 
	x.simplify(); 
 if(this.denominator == x.denominator){ 
	int  y = this.numerator + x.numerator; 
	 sum = new Fraction(y,this.denominator); 
	 return sum; 
 }else{ 
	 int newDenom = this.denominator * x.denominator; 
	 int newNum = (this.numerator * x.denominator) + (x.numerator * this.denominator);
	 sum = new Fraction(newNum, newDenom); 
	 sum.simplify(); 
	 return sum; 
 }
}
public String toString(){ 
	return this.numerator + "/" + this.denominator; 
}
public Fraction subtract(Fraction x){ 
	Fraction sum = new Fraction(); 
	this.simplify(); 
	x.simplify(); 
	 if(this.denominator == x.denominator){ 
		int  y = this.numerator - x.numerator; 
		 sum = new Fraction(y,this.denominator); 
		 return sum; 
}else{ 
	int newDenom = this.denominator * x.denominator; 
	 int newNum = (this.numerator * x.denominator) - (x.numerator * this.denominator);
	 sum = new Fraction(newNum, newDenom); 
	 sum.simplify(); 
	 return sum; 
}
}
public Fraction multiply(Fraction x){ 
	Fraction sum = new Fraction(); 
	 if(this.denominator == x.denominator){ 
		int  y = this.numerator + x.numerator; 
		 sum = new Fraction(y,this.denominator); 
		 return sum; 
}else{ 
	int newDenom = this.denominator * x.denominator; 
	 int newNum = this.numerator * x.numerator; 
	 sum = new Fraction(newNum, newDenom); 
	 return sum; 
}
}
public Fraction divide(Fraction x){ 
	Fraction sum = new Fraction(); 
	 if(this.denominator == x.denominator){ 
		int  y = this.numerator - x.numerator; 
		 sum = new Fraction(y,this.denominator); 
		 return sum; 
}else{ 
	int newDenom = this.denominator * x.numerator; 
	 int newNum = this.numerator * x.denominator; 
	 sum = new Fraction(newNum, newDenom); 
	 return sum; 
}
} 
public int isDenomNegative(int d) { 
	if(d < 0){ 
	System.err.println("You cannot have a denominator smaller than 0" );
	return d = 1; 
	}else{ 
		return d;}

}
private int gcd(int a, int b){ 
	a = Math.abs(a); 
	b = Math.abs(b);
	int calc = a % b;
	while (calc > 0){ 
		a = b; 
		b = calc; 
		calc = a%b; 
	}
	return b; 
	}
private void simplify(){ 
	int gd = gcd(this.numerator, this.denominator); 
	this.numerator /= gd; 
	this.denominator /= gd; 
		

} 
}