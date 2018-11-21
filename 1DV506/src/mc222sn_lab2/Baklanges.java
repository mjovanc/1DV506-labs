package mc222sn_lab2;

import java.util.Scanner;

public class Baklanges {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Mata in en textrad: ");
		String text = in.nextLine();
		
		in.close();
		
		String textReversed = "";
		
		for (int a = text.length(); a > 0; a--)
		{
			textReversed += text.substring(a - 1, a);
		}
		
		System.out.printf("Baklänges: %s", textReversed);

	}

}
