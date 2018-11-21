package mc222sn_lab2;

import java.util.Scanner;

public class NastStorsta {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Mata in 10 heltal: ");
		
		int count = 0;
		int largest = 0;
		
		while (in.hasNextInt())
		{
			int input = in.nextInt();
			
			if (input > largest)
			{
				largest = input;
			}
			
			count++;
			
			if (count == 3)
			{
				System.out.printf("Largest: %d", largest);
			}
		}
		

	}

}
