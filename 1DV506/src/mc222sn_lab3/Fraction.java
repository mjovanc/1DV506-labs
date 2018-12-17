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
	
	
}
