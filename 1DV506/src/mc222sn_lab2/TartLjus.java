package mc222sn_lab2;

/**
 * Calculates how many boxes of candles one person needs to buy every year until
 * the hundredth anniversary.
 * 
 * @author Marcus Cvjeticanin
 */
public class TartLjus
{
	public static void main(String[] args)
	{
		final int MAXAGE = 100;
		final int CANDLES_IN_BOX = 24;
		int candleBoxes = 0;
		int candlesRemaining = 0;
		int candleBoxesTotal = 0;

		for (int age = 1; age <= MAXAGE; age++)
		{
			boolean enoughCandles = candlesRemaining / age >= 1;

			if (enoughCandles)
			{
				candlesRemaining -= age;
			}
			else
			{
				double amountOfBoxes = Math.ceil(((double) age - candlesRemaining) / CANDLES_IN_BOX);
				candleBoxes += (int) amountOfBoxes;
				candlesRemaining += (candleBoxes * CANDLES_IN_BOX - age);

				System.out.printf("Before birthday %d, buy %d box(es)\n", age, candleBoxes, candlesRemaining);

				candleBoxes -= amountOfBoxes;
				candleBoxesTotal += amountOfBoxes;
			}
		}
		
		System.out.printf("\nTotal number of boxes: %d, Remaining candels: %d\n", candleBoxesTotal, candlesRemaining);
	}
}
