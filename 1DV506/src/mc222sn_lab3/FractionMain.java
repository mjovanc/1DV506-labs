package mc222sn_lab3;

public class FractionMain
{
	public static void main(String[] args)
	{
		Fraction f = new Fraction(5, 2);
		
		System.out.println(f.getNumerator());
		System.out.println(f.getDenominator());
		
		if (f.isNegative())
		{
			System.out.println("The fraction is negative!");
		}
		else
		{
			System.out.println("The fraction is NOT negative!");
		}
		
		
	}

}
