package mc222sn_lab1;

import java.util.Random;

public class Slumpsumma {

	public static void main(String[] args) {
		Random r = new Random();
		
		int firstNumber = r.nextInt(100) + 1;
		int secondNumber = r.nextInt(100) + 1;
		int thirdNumber = r.nextInt(100) + 1;
		int forthNumber = r.nextInt(100) + 1;
		int fifthNumber = r.nextInt(100) + 1;
		
		int sum = firstNumber + secondNumber + thirdNumber + forthNumber + fifthNumber;
		
		System.out.printf("Fem genererade slumptal: %d %d %d %d %d\n\n", firstNumber, secondNumber, thirdNumber, forthNumber, fifthNumber);
		System.out.printf("Slumptalens summa är: %d", sum);

	}

}
