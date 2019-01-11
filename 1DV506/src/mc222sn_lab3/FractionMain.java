package mc222sn_lab3;

/**
 * The fraction main class.
 *
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class FractionMain
{
	/**
	 * The starting point of the program. Runs some tests
	 * to see if the methods work as they should.
	 *
	 * @param args Takes an array of strings as parameter.
	 */
	public static void main(String[] args)
	{
		Fraction f1 = new Fraction(-10, 7);
		Fraction f2 = new Fraction(10, 8);
		
		System.out.println(f1.getNumerator());
		System.out.println(f1.getDenominator());
		
		System.out.println(f2.getNumerator());
		System.out.println(f2.getDenominator());
		
		if (f1.isNegative())
		{
			System.out.println("The fraction is negative!");
		}
		else
		{
			System.out.println("The fraction is NOT negative!");
		}
		
		// f1.add(f2);
		// f1.divide(f2);
		
		if (f1.isEqualTo(f2))
		{
			System.out.println("Same fraction!");
		}
		else
		{
			System.out.println("Not the same fraction!");
		}
		
		int numerator = f1.getNumerator();
		int denominator = f1.getDenominator();
		
		System.out.printf("Sum of adding two fractions: %d/%d\n", numerator, denominator);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());	
	}
}