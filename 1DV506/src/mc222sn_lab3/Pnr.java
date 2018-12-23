package mc222sn_lab3;

/**
 * Swedish personal identity number.
 * 
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class Pnr
{
	/**
	 * The starting point of the program. Runs some tests
	 * to see if the methods work as they should.
	 * 
	 * @param String[] Takes an array of striCngs as parameter.
	 */
	public static void main(String[] args)
	{
		// getFirstPart() method
		System.out.println("getFirstPart() method");
		String pnr1 = getFirstPart("910224-0292");
		System.out.println("Personnr: " + pnr1);
		
		// getSecondPart() method
		System.out.println("\ngetSecondPart() method");
		String pnr2 = getSecondPart("910224-0292");
		System.out.println("Personnr: " + pnr2);
		
		// isFemaleNumber() method
		System.out.println("\nisFemaleNumber() method");
		boolean female = isFemaleNumber("910224-0292");
		if (female)
		{
			System.out.println("Female!");
		}
		else 
		{
			System.out.println("Male!");
		}
		
		// areEqual() method
		System.out.println("\nareEqual() method");
		boolean equal = areEqual("910224-0695", "910224-0292");
		if (equal)
		{
			System.out.println("Equal!");
		}
		else 
		{
			System.out.println("NOT Equal!");
		}
	}
	
	/**
	 * Returns the first part of the personal identity number.
	 * 
	 * @param pnr Takes a string as parameter.
	 * @return String Returns the first 6 numbers in a string.
	 */
	public static String getFirstPart(String pnr)
	{
		return pnr.substring(0, 6);
	}
	
	/**
	 * Returns the second part of the personal identity number.
	 * 
	 * @param pnr Takes a string as parameter.
	 * @return String Returns the second 4 numbers in a string.
	 */
	public static String getSecondPart(String pnr)
	{
		return pnr.substring(7, 11);
	}
	
	/**
	 * Returns true if the personal identity number
	 * is a female one. 
	 * 
	 * @param pnr Takes a string as parameter.
	 * @return boolean Returns true or false.
	 */
	public static boolean isFemaleNumber(String pnr)
	{
		String sex = pnr.substring(9, 10);
		int number = Integer.parseInt(sex);
		
		if (number % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns true if the personal identity number
	 * are equal to another personal identity number.
	 * 
	 * @param pnr1 Takes a string as parameter.
	 * @param pnr2 Takes a string as parameter.
	 * @return boolean Returns true or false.
	 */
	public static boolean areEqual(String pnr1, String pnr2)
	{
		long firstPersonalNumber = Long.parseLong(getFirstPart(pnr1) + getSecondPart(pnr1));
		long secondPersonalNumber = Long.parseLong(getFirstPart(pnr2) + getSecondPart(pnr2));
		
		if (firstPersonalNumber == secondPersonalNumber)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Checks if the personal identity number
	 * is using a correct swedish format.
	 * 
	 * @param pnr Takes a string as parameter.
	 * @return boolean Returns true or false.
	 */
	public static boolean isCorrect(String pnr)
	{
		String firstPart = getFirstPart(pnr);
		String secondPart = getSecondPart(pnr);
		String nineDigits = firstPart + secondPart.substring(0, 3);
		
		int[] digits = new int[9];
		int[] oneTwo = {2,1,2,1,2,1,2,1,2};
		int sum = 0;
		
		String years = firstPart.substring(0, 2);
		String days = firstPart.substring(2, 4);
		String months = firstPart.substring(4, 6);
		
		boolean correctYears = Integer.parseInt(years) < 100 && Integer.parseInt(years) > 0;
		boolean correctDays = Integer.parseInt(days) <= 31 && Integer.parseInt(days) > 0;
		boolean correctMonths = Integer.parseInt(months) <= 12 && Integer.parseInt(months) > 0;
		
		
		for (int i = 0; i < 9; i++)
		{
			int digit = Integer.parseInt(nineDigits.substring(i, i+1));
			int number = digit * oneTwo[i];
			digits[i] = number;
		}
		
		for (int i = 0; i < digits.length; i++)
		{
			sum = sum + digits[i];
		}
		
		boolean correctFormat = correctYears && correctDays && correctMonths;
		
		if (correctFormat)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}
