package mc222sn_lab2;

/**
 * Prints out all numbers between 100 and 200 that are evenly divisible by 4 or
 * 5, but not divisible with both 4 and 5.
 * 
 * @author Marcus Cvjeticanin
 */
public class Delbarhet
{
	public static void main(String[] args)
	{
		int counter = 0;

		for (int i = 100; i < 200; i++)
		{
			boolean divisibleByFour = i % 4 == 0;
			boolean divisibleByFive = i % 5 == 0;
			boolean bothFourAndFive = i % 4 == 0 && i % 5 == 0;
			boolean correct = (
					(divisibleByFour || divisibleByFive) &&
					!bothFourAndFive
			);

			if (correct)
			{
				if (counter == 10)
				{
					System.out.println();
					counter = 0;
				}
				System.out.print(i + " ");
				counter++;
			}
		}
	}
}
