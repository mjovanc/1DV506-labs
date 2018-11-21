package mc222sn_lab2;

// INTE KLAR!!!

public class Delbarhet {

	public static void main(String[] args) {
		
		for (int a = 100; a <= 200; a++) {
			boolean divisibleByFour = a % 4 == 0;
			boolean divisibleByFive = a % 5 == 0;
			boolean bothFourAndFive = a % 4 == 0 && a % 5 == 0;

			if (divisibleByFour || divisibleByFive && !bothFourAndFive)
			{
				System.out.printf("%d ", a);
			}
				
			// 
		}
	}

}
