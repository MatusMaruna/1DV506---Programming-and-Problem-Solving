package mm223fj_assign3;

public class FractionMain {
public static void main(String[]args){ 
	Fraction frac = new Fraction(1,9); 
	System.out.println(frac.toString());
	Fraction frac1 = new Fraction(2,14); 
	System.out.println(frac1.toString());
	System.out.println("Is fraction 1 negative: " + frac.isNegative());
	System.out.println("Is fraction 2 negative: " + frac1.isNegative()); 
	System.out.println("Is fraction 1 equal to fraction 2: " + frac.isEqualTo(frac1));
	System.out.println("Denominator of Fraction 1: " + frac.getDenominator() +"\n" + "Numerator of Fraction 1: " + frac.getNumerator());
	System.out.println("Fraction 1 + Fraction 2 = " + frac.add(frac1));
	System.out.println("Fraction 1 - Fraction 2 = " + frac.subtract(frac1));
	System.out.println("Fraction 1 x Fraction 2 = " + frac.multiply(frac1));
	System.out.println("Fraction 1 / Fraction 2 = " + frac.divide(frac1));
}
}
