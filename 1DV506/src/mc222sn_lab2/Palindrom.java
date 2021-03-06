package mc222sn_lab2;

import java.util.Scanner;

/**
 * Reads a line of text from the keyboard and then tests if the text is a
 * palindrome.
 * 
 * @author Marcus Cvjeticanin
 */
public class Palindrom
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Mata in en text: ");
		String text = in.nextLine();

		in.close();

		String newText = "";
		String reversedText = "";

		for (int i = 0; i < text.length(); i++)
		{
			if (Character.isLetter(text.charAt(i)))
			{
				char temp = text.charAt(i);
				char tempToLower = Character.toLowerCase(temp);
				newText += tempToLower;
			}
		}

		for (int i = newText.length() - 1; i >= 0; i--)
		{
			reversedText += newText.charAt(i);
		}

		if (reversedText.equals(newText))
		{
			System.out.println("\nSträngen är ett palindrom.");
		}
		else
		{
			System.out.println("\nSträngen är inte ett palindrom.");
		}
	}
}
