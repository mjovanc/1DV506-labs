package mc222sn_lab2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		int rNumber = r.nextInt(100) + 1;
		int guesses = 0;
		
		while (true) {
			guesses += 1;
			System.out.printf("Gissning %d: ", guesses);
			int guess = in.nextInt();
			
			if (guess == rNumber) {
				System.out.printf("\tRätt svar efter bara %d gissningar - Strålande!", guesses);
				break;
			} else if (guesses == 10) {
				System.out.println("\tDu har uppnått maximalt antal gissningar. Spelet avslutas.");
				break;
			} else {
				if (guess < rNumber) {
					System.out.println("\tLedtråd: högre");
				} else if (guess > rNumber) {
					System.out.println("\tLedtråd: lägre");
				}
			}
		}
		
		in.close();
	}

}
