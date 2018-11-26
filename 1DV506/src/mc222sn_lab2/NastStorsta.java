package mc222sn_lab2;

import java.util.Scanner;

/**
 * Reads ten integers and finds out the next biggest
 * number of them and printing it out.
 * 
 * @author Marcus Cvjeticanin
 */
public class NastStorsta
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Mata in 10 heltal: ");
		
		int largest = 0;
		int secondLargest = 0;
		int number = 0;
		int totalNumberOfInputs = 10;
		
		while (in.hasNextInt())
		{
			for (int i = 0; i < totalNumberOfInputs; i++)
			{
				if (i == 0)
				{
					largest = in.nextInt();
				}
				else
				{
					number = in.nextInt();
					if (number > largest)
					{
						secondLargest = largest;
						largest = number;
					}
					else if (number > secondLargest)
					{
						secondLargest = number;
					}
				}
				
			}
			in.close();
			
			System.out.printf("Det näst största talet är: %d", secondLargest);
			break;
		}
	}
}
