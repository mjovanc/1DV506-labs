package mc222sn_lab3;

public class Pnr
{
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
	
	public static String getFirstPart(String pnr)
	{
		return pnr.substring(0, 6);
	}
	
	public static String getSecondPart(String pnr)
	{
		return pnr.substring(8, 11);
	}
	
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
