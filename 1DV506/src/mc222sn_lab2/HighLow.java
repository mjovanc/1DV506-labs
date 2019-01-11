package mc222sn_lab2;

import java.util.Random;
import java.util.Scanner;

/**
 * The guessing game High and Low. Generates a random number between 1 and 100
 * and letting the player guess correct the value.
 * 
 * @author Marcus Cvjeticanin
 */
public class HighLow
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner in = new Scanner(System.in);

		int rNumber = r.nextInt(100) + 1;
		int guesses = 0;
		boolean guessing = true;

		while (guessing)
		{
			guesses += 1;
			System.out.printf("Gissning %d: ", guesses);
			int guess = in.nextInt();

			if (guess == rNumber)
			{
				System.out.printf("\tRätt svar efter bara %d gissningar - Strålande!", guesses);
				guessing = false;
			}
			else if (guesses == 10)
			{
				System.out.println("\tDu har uppnått maximalt antal gissningar. Spelet avslutas.");
				guessing = false;
			}
			else
			{
				if (guess < rNumber)
				{
					System.out.println("\tLedtråd: högre");
				}
				else if (guess > rNumber)
				{
					System.out.println("\tLedtråd: lägre");
				}
			}
		}

		in.close();
	}
}
