package mc222sn_lab2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Reads any positive integers from the keyboard and then prints it out
 * backwards.
 * 
 * @author Marcus Cvjeticanin
 */
public class OmvandOrdning
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		System.out.println("Mata in positiva heltal. Avsluta med ett negativt.");

		int counter = 1;
		boolean input = true;

		while (input)
		{
			System.out.printf("Tal %d: ", counter);
			int number = in.nextInt();

			if (number < 0)
			{
				input = false;
			}
			else
			{
				numbers.add(number);
				counter++;
			}
		}

		in.close();
		
		Collections.reverse(numbers);

		System.out.printf("\nAntal positiva: %d\n", numbers.size());
		System.out.print("Baklänges: ");
		
		int count = 1;
		for (int i : numbers)
		{
			
			if (count++ == numbers.size())
			{
				System.out.print(i);
			}
			else
			{
				System.out.print(i + ", ");
			}
		}
	}
}
