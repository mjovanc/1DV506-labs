package mc222sn_lab3;

public class FractionMain
{
	public static void main(String[] args)
	{
		Fraction f1 = new Fraction(3, 8);
		Fraction f2 = new Fraction(10, 3);
		
		System.out.println(f1.getNumerator());
		System.out.println(f1.getDenominator());
		
		System.out.println(f2.getNumerator());
		System.out.println(f2.getDenominator());
		
//		if (f1.isNegative())
//		{
//			System.out.println("The fraction is negative!");
//		}
//		else
//		{
//			System.out.println("The fraction is NOT negative!");
//		}
		
		// f1.add(f2);
		f1.divide(f2);
		
		int numerator = f1.getNumerator();
		int denominator = f1.getDenominator();
		
		System.out.printf("Sum of adding two fractions: %d/%d", numerator, denominator);
		
		
	}

}
