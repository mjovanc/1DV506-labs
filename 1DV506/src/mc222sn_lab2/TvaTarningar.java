package mc222sn_lab2;

import java.util.Random;

/**
 * Simulating two rolling dices. Displaying a frequency table of sum and count
 * for the rolling dices.
 * 
 * @author Marcus Cvjeticanin
 */
public class TvaTarningar
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int[] freqList = new int[11];

		int die1, die2, sumOfDices;
		
		for (int i = 0; i < 10000; i++)
		{			
			die1 = r.nextInt(6) + 1;
			die2 = r.nextInt(6) + 1;
			
			sumOfDices = die1 + die2;
			
			freqList[sumOfDices - 2]++;
		}
		
		System.out.println("Frequency table (sum, count) for rolling two dices 10000 times");
		for (int i = 0; i < freqList.length; i++)
		{
			System.out.printf("%-10s %d\n", i + 2, freqList[i]);
		}
	}
}
