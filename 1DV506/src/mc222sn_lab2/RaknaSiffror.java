package mc222sn_lab2;

import java.util.Scanner;

public class RaknaSiffror
{

	public static void main(String[] args)
	{
		// Scanner in = new Scanner(System.in);
		
		int number = 6789500;
		int zeros = 0;
		int odd = 0;
		int even = 0;
		
		String convertedNumber = Integer.toString(number); 
		
		for (int i = 0; i < convertedNumber.length(); i++)
		{
			int indexNumber = (int) convertedNumber.charAt(i);
			if (indexNumber % 2 == 0)
			{
				even += 1;
			}
			else if (indexNumber == 0)
			{
				zeros += 1;
			}
			else
			{
				odd += 1;
			}
		}
		
		System.out.printf("Nollor: %d\nUdda: %d\nJämna: %d", zeros, odd, even);
		
		
		
	}

}
