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
	
//	public boolean zeroInNumerator(Fraction f) // vet inte om vi ska använda den här fortfarande?
//	{
//		if (f.numerator < 0)
//		{
//			return true;
//		}
//		else if (numerator < 0)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
	
	public void add(Fraction f)
	{
		if (f.numerator < 0 || f.denominator < 0)
		{
			System.err.println("Error: Negative numerator!");
		}
		else
		{
			int firstNumerator = numerator * f.denominator;
					
			int secondNumerator = f.numerator * denominator;
			int secondDenominator = f.denominator * denominator;
			
			int sumOfNumerators = firstNumerator + secondNumerator;
			
			numerator = sumOfNumerators;
			denominator = secondDenominator;
		}
	}
	
	public void subtract(Fraction f)
	{
		if (f.numerator < 0 || f.denominator < 0)
		{
			System.err.println("Error: Negative numerator!");
		}
		else
		{
			int firstNumerator = numerator * f.denominator;
					
			int secondNumerator = f.numerator * denominator;
			int secondDenominator = f.denominator * denominator;
			
			int sumOfNumerators = firstNumerator - secondNumerator;
			
			numerator = sumOfNumerators;
			denominator = secondDenominator;
		}
	}
	
	public void multiply(Fraction f)
	{
		if (f.numerator < 0 || f.denominator < 0)
		{
			System.err.println("Error: Negative numerator!");
		}
		else
		{
			int sumOfNumerators = numerator * f.numerator;
			int sumOfDenominators = denominator * f.denominator;
			
			numerator = sumOfNumerators;
			denominator = sumOfDenominators;
		}
	}
	
	public void divide(Fraction f)
	{
		if (f.numerator < 0 || f.denominator < 0)
		{
			System.err.println("Error: Negative numerator!");
		}
		else
		{
			int sumOfNumerators = numerator * f.denominator;
			int sumOfDenominators = denominator * f.numerator;
			
			numerator = sumOfNumerators;
			denominator = sumOfDenominators;
		}
	}
	
	public boolean isEqualTo(Fraction f)
	{
		boolean sameNumerator = (numerator == f.numerator);
		boolean sameDenominator = (denominator == f.denominator);
		
		if (sameNumerator && sameDenominator)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String fraction = numerator + "/" + denominator;
				
		return fraction;
	}
}
