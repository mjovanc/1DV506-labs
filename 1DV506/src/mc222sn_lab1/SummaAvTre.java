package mc222sn_lab1;

import java.util.Scanner;

public class SummaAvTre {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ange ett tresiffrigt heltal: ");
		int number = in.nextInt();
		in.close();
		
		int firstNumber = number / 100;
		int secondNumber = (number / 10) % 10;
		int thirdNumber = number % 10;
		
		int sum = firstNumber + secondNumber + thirdNumber;
		
		System.out.printf("Summan av siffrorna i heltalet är: %d", sum);
	}

}
