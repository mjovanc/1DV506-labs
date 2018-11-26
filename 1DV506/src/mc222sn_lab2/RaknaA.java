package mc222sn_lab2;

import java.util.Scanner;

/**
 * Reads a line of text from the keyboard
 * and then printing out how many 'a' and 'A' there
 * are in the text.
 * 
 * @author Marcus Cvjeticanin
 */
public class RaknaA
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Mata in en textrad: ");
		String text = in.nextLine();
		
		in.close();
		
		int lowercaseA = 0;
		int uppercaseA = 0;
		
		for (char a = 0; a < text.length(); a++)
		{
			if (text.charAt(a) == 'a')
			{
				lowercaseA++; 
			}
			else if (text.charAt(a) == 'A')
			{
				uppercaseA++;
			}
		}
		
		System.out.printf("Antal a: %d\n", lowercaseA);
		System.out.printf("Antal A: %d", uppercaseA);
	}
}
