package mc222sn_lab3;

/**
 * Swedish personal identity number
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
	 * @param String[] Takes an array of strings as parameter.
	 */
	public static void main(String[] args)
	{
		// String pnr = getFirstPart("910224-0695");
		// System.out.println("Personnr: " + pnr);
		
		boolean equal = areEqual("910224-0695", "910224-0695");
		
		if (equal)
		{
			System.out.println("Equal!!");
		}
		else 
		{
			System.out.println("NOT Equal!!");
		}
	}
	
	/**
	 * This method returns the first part of the personal identity number.
	 * 
	 * @param pnr Takes a string as parameter.
	 * @return String Returns the first 6 numbers in a string.
	 */
	public static String getFirstPart(String pnr)
	{
		return pnr.substring(0, 6);
	}
	
	/**
	 * This method returns the second part of the personal identity number.
	 * 
	 * @param pnr Takes a string as parameter.
	 * @return String Returns the second 4 numbers in a string.
	 */
	public static String getSecondPart(String pnr)
	{
		return pnr.substring(8, 11);
	}
	
	/**
	 * This method returns true if the personal identity number
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
	 * This method returns true if the personal identity number
	 * are equal to another personal identity number.
	 * 
	 * @param pnr1 Takes a string as parameter.
	 * @param pnr2 Takes a string as parameter.
	 * @return boolean Returns true or false.
	 */
	public static boolean areEqual(String pnr1, String pnr2)
	{
		int firstPersonalNumber = Integer.parseInt(getFirstPart(pnr1) + getSecondPart(pnr1));
		int secondPersonalNumber = Integer.parseInt(getFirstPart(pnr2) + getSecondPart(pnr2));
		
		if (firstPersonalNumber == secondPersonalNumber)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
