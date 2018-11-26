package mc222sn_lab2;

import java.util.Scanner;

/**
 * Reads any positive integer and prints out two
 * triangles.
 * 
 * @author Marcus Cvjeticanin
 */
public class Triangle
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Mata in ett udda heltal: ");
		int number = in.nextInt();
		
		in.close();
		
		if (number > 0)
		{
			System.out.println("\nRätvinklig triangel: ");
			
			for (int i = number; i > 0; i--)
			{
				for (int j = i; j > 0; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("\nLikbent triangel: ");
			
			for (int i = 1; i <= number; i += 2)
			{
				for (int k = 0; k < (4 - i / 2); k++)
				{
					System.out.print(" ");
				}
				for (int j = 0; j < i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Du matade inte in ett positivt udda heltal!");
		}
		
	}

}
