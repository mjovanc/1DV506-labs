package mc222sn_lab3;

public class Fraction
{
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d)
	{
		if (n == 0)
		{
			System.err.println("Denominator can't be 0!");
		}
		else
		{
			numerator = n;
			denominator = d;
		}
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public boolean isNegative()
	{
		int fraction = numerator / denominator;
		
		if (fraction < 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void add(Fraction f)
	{
		if (f.numerator < 0 || f.denominator < 0)
		{
			System.err.println("Error: Negative numerator!");
		}
		else
		{
			int firstNumerator = numerator * f.denominator;
			int firstDenominator = denominator * f.denominator;
					
			int secondNumerator = f.numerator * denominator;
			int secondDenominator = f.denominator * denominator;
			
			int sumOfNumerators = firstNumerator + secondNumerator;
			int sumOfDenominators = firstDenominator + secondDenominator;
			
			numerator = sumOfNumerators;
			denominator = sumOfDenominators;
		}
	}
}
