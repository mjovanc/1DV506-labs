package mc222sn_lab2;

import java.util.Scanner;
import java.util.ArrayList;

public class OmvandOrdning {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Mata in positiva heltal. Avsluta med ett negativt.");
		
		int counter = 1;
		
		while (true)
		{
			System.out.printf("Tal %d: ", counter);
			int number = in.nextInt();
			
			if (number < 0)
			{
				break;
			}
			
			numbers.add(number);
			counter++;
		}
		
		ArrayList <Integer> reverseNumbers = new ArrayList<Integer>();
		
		for (int i = numbers.size()-1; i >= 0; i--)
		{
			reverseNumbers.add(numbers.get(i));
		}
		
		int positiveNumbers = reverseNumbers.size();
		
		System.out.printf("\nAntal positiva: %d\n", positiveNumbers);
		
		System.out.print("Baklänges: ");
		for (int i = 0; i < reverseNumbers.size(); i++)
		{
			System.out.print(
					i == reverseNumbers.size() - 1 ?
					reverseNumbers.get(i) : reverseNumbers.get(i) + ", "
			);
		}
		
		
		

	}

}
