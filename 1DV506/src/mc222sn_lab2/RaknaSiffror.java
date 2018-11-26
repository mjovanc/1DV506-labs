package mc222sn_lab2;

import java.util.Scanner;

/**
 * Reads any positive integer from the keyboard and 
 * prints out the amount of zeros, odd numbers and even numbers.
 * 
 * @author Marcus Cvjeticanin
 */
public class RaknaSiffror
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Mata in ett heltal: ");
		int number = in.nextInt();
		
		in.close();
		
		int zeros = 0;
		int odd = 0;
		int even = 0;
		
		String convertedNumber = Integer.toString(number); 
		
		for (int i = 0; i < convertedNumber.length(); i++)
		{
			int indexNumber = Integer.parseInt(convertedNumber.substring(i, i+1));
			
			if (indexNumber % 2 == 0)
			{
				if (indexNumber == 0)
				{
					zeros += 1;
				}
				else
				{
					even += 1;
				}
			}
			else
			{
				odd += 1;
			}
		}
		
		System.out.printf("Nollor: %d\nUdda: %d\nJämna: %d", zeros, odd, even);	
	}

}
