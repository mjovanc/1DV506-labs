package mc222sn_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RaknaTecken
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String path = args[0];
		File inputNumbers = new File(path);
		System.out.printf("Antal stora bokstäver: %d\n", RaknaTecken.cLettersCount(inputNumbers));
		System.out.printf("Antal små bokstäver: %d\n", RaknaTecken.lcLettersCount(inputNumbers));
		System.out.printf("Antal \"whitespaces\": %d\n", RaknaTecken.wsCount(inputNumbers));
		System.out.printf("Övriga tecken: %d", RaknaTecken.otherChars(inputNumbers));
	}
	
	private static int cLettersCount(File inputFile) throws FileNotFoundException
	{
		Scanner in = new Scanner(inputFile);
		
		int count = 0;
		
		while(in.hasNextLine())
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
	
	private static int lcLettersCount(File inputFile) throws FileNotFoundException
	{
		Scanner in = new Scanner(inputFile);
		
		int count = 0;
		
		while(in.hasNextLine())
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
	
	private static int wsCount(File inputFile) throws FileNotFoundException
	{
		Scanner in = new Scanner(inputFile);
		
		int count = 0;
		
		while(in.hasNextLine())
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
	
	private static int otherChars(File inputFile) throws FileNotFoundException
	{
		Scanner in = new Scanner(inputFile);
		
		int count = 0;
		
		while(in.hasNextLine())
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
