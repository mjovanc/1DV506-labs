package mc222sn_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The RaknaTecken class.
 *
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class RaknaTecken
{
	/**
	 * The starting point of the program. Runs some tests
	 * to see if the methods work as they should.
	 *
	 * @param args Takes an array of strings as parameter.
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		try
		{
			String path = args[0];
			File inputNumbers = new File(path);
			System.out.printf("Antal stora bokstäver: %d\n", RaknaTecken.cLettersCount(inputNumbers));
			System.out.printf("Antal små bokstäver: %d\n", RaknaTecken.lcLettersCount(inputNumbers));
			System.out.printf("Antal \"whitespaces\": %d\n", RaknaTecken.wsCount(inputNumbers));
			System.out.printf("Övriga tecken: %d", RaknaTecken.otherChars(inputNumbers));
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No such file or directory!");
		}
	}
	
	/**
	 * Gets the capital letters count.
	 * 
	 * @param inputFile Takes a File object as parameter.
	 * @throws FileNotFoundException
	 * @return int Returns the count.
	 */
	private static int cLettersCount(File inputFile) throws FileNotFoundException
	{
		int count = 0;
		
		Scanner in = new Scanner(inputFile);
			
		while (in.hasNextLine())
		{
			String line = in.nextLine();
				
			for (int i = 0; i < line.length(); i++)
			{
				char letter = line.charAt(i);
				boolean upperCase = Character.isUpperCase(letter);
					
				if (upperCase)
				{
					count++;
				}
			}
		}
			
		in.close();
		
		return count;
	}
	
	/**
	 * Gets the lowercase letters count.
	 * 
	 * @param inputFile Takes a File object as parameter.
	 * @throws FileNotFoundException
	 * @return int Returns the count.
	 */
	private static int lcLettersCount(File inputFile) throws FileNotFoundException
	{
		int count = 0;
		
		Scanner in = new Scanner(inputFile);
			
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			
			for (int i = 0; i < line.length(); i++)
			{
				char letter = line.charAt(i);
				boolean lowerCase = Character.isLowerCase(letter);
				
				if (lowerCase)
				{
					count++;
				}
			}
		}
			
		in.close();
		
		return count;
	}
	
	/**
	 * Gets the whitespace letters count.
	 * 
	 * @param inputFile Takes a File object as parameter.
	 * @throws FileNotFoundException
	 * @return int Returns the count.
	 */
	private static int wsCount(File inputFile) throws FileNotFoundException
	{
		int count = 0;
		
		Scanner in = new Scanner(inputFile);
			
		while (in.hasNextLine())
		{
			String line = in.nextLine();
				
			for (int i = 0; i < line.length(); i++)
			{
				char letter = line.charAt(i);
				boolean whiteSpace = Character.isWhitespace(letter);
					
				if (whiteSpace)
				{
					count++;
				}
			}
		}
			
		in.close();
		
		return count;
	}
	
	/**
	 * Gets the other letters count.
	 * 
	 * @param inputFile Takes a File object as parameter.
	 * @throws FileNotFoundException
	 * @return int Returns the count.
	 */
	private static int otherChars(File inputFile) throws FileNotFoundException
	{
		int count = 0;
		
		Scanner in = new Scanner(inputFile);
			
		while (in.hasNextLine())
		{
			String line = in.nextLine();
		
			for (int i = 0; i < line.length(); i++)
			{
				char letter = line.charAt(i);
				boolean upperCase = Character.isUpperCase(letter);
				boolean lowerCase = Character.isLowerCase(letter);
				boolean whiteSpace = Character.isWhitespace(letter);
				
				if (!upperCase && !lowerCase && !whiteSpace)
				{
					count++;
				}
			}
		}
			
		in.close();
		
		return count;
	}
}
