package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	private String reciprocal;
	private String simplifiedFraction;
	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
		this.reciprocal = +denominator+"/"+numerator++;
	}
	
	public String fractionAddition(Fraction f1) {
		if (this.denominator == f1.denominator) {
			int numerator = this.numerator + f1.numerator;
			return +numerator+"/"+this.denominator++;
		} else {
			int numerator1 = this.numerator * f1.denominator;
			int numerator2 = this.denominator * f1.numerator;
			int denominator = this.denominator * f1.denominator;
			int numerator = numerator1 + numerator2;
			return +numerator+"/"+denominator++;
		}
	}
	public String fractionMultiplication(Fraction f1) {
		int numerator = this.numerator * f1.numerator;
		int demoninator = this.denominator * f1.denominator;
		return +numerator+"/"+denominator++;
	}
	
	
}
