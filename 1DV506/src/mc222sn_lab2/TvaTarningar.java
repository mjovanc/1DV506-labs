package mc222sn_lab2;

import java.util.Random;

public class TvaTarningar {

	public static void main(String[] args) {
		Random r = new Random();
		
		int dice1, dice2, sumOfDices;
		
		int[] diceRolls = new int[10000];
		int[][] frequencyList = new int[2][11];
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 2; j < 12; j++)
			{
				frequencyList[0][j-2] = j;
				frequencyList[1][j-2] = 0;
			}
		}
		
		for (int i = 0; i < diceRolls.length; i++)
		{
			dice1 = r.nextInt(6) + 1;
			dice2 = r.nextInt(6) + 1;
			
			sumOfDices = dice1 + dice2;
			
			diceRolls[i] = sumOfDices;
			
			switch (sumOfDices)
			{
				case 2: frequencyList[1][0] += 1; break;
				case 3: frequencyList[1][1] += 1; break;
				case 4: frequencyList[1][2] += 1; break;
				case 5: frequencyList[1][3] += 1; break;
				case 6: frequencyList[1][4] += 1; break;
				case 7: frequencyList[1][5] += 1; break;
				case 8: frequencyList[1][6] += 1; break;
				case 9: frequencyList[1][7] += 1; break;
				case 10: frequencyList[1][8] += 1; break;
				case 11: frequencyList[1][9] += 1; break;
				case 12: frequencyList[1][10] += 1; break;
			}
		}
		
		
		
		System.out.println(frequencyList[1][0]);
		System.out.println(frequencyList[1][1]);
		System.out.println(frequencyList[1][2]);
		System.out.println(frequencyList[1][3]);
		System.out.println(frequencyList[1][4]);
		
	}

}
