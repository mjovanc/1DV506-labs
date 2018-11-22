package mc222sn_lab2;

// INTE KLAR!

public class TartLjus {

	public static void main(String[] args) {
		int boxesOfCandles = 1;
		int candlesInBox = 24;
		int remainingCandles = 0;
		int age = 1;
		
		for (int i = 0; i < 100; i++)
		{
			if (age > candlesInBox)
			{
				boxesOfCandles += 1;
				remainingCandles = candlesInBox * boxesOfCandles - age;
			}
			age++;
		}

	}

}
