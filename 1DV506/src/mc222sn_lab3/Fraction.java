package mc222sn_lab3;

/**
 * The fraction class.
 * 
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class Fraction
{
	private int numerator;
	private int denominator;
	
	/**
	* Constructor for Fraction.
	* 
	* @param int Getting the numerator.
	* @param int Getting the denominator.
	*/
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
	
	/**
	 * Getting the fraction numerator.
	 * 
	 * @return int Returns the numerator value of the fraction.
	 */
	public int getNumerator()
	{
		return numerator;
	}
	
	/**
	 * Getting the fraction denominator.
	 * 
	 * @return int Returns the denominator value of the fraction.
	 */
	public int getDenominator()
	{
		return denominator;
	}
	
	/**
	 * Checking if the fraction is negative.
	 * 
	 * @return boolean Returns true or false.
	 */
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
	
	/**
	 * Adds two fractions together.
	 * 
	 * @param Fraction Takes a fraction object as parameter.
	 */
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
	
	/**
	 * Subtracts two fractions.
	 * 
	 * @param Fraction Takes a fraction object as parameter.
	 */
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
	
	/**
	 * Multiplies two fractions.
	 * 
	 * @param Fraction Takes a fraction object as parameter.
	 */
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
	
	/**
	 * Dividing two fractions.
	 * 
	 * @param Fraction Takes a fraction object as parameter.
	 */
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
	
	/**
	 * Checking two fractions if they are equal to each other.
	 * 
	 * @param Fraction Takes a fraction object as parameter.
	 * @return boolean Returns true or false.
	 */
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
	
	/**
	 * Getting the fraction object to a string.
	 * 
	 * @return String Returns the fraction to a nice format.
	 */
	public String toString()
	{
		String fraction = numerator + "/" + denominator;
				
		return fraction;
	}
}
