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
		System.out.printf("Antal stora bokstäver: %d\n", RaknaTecken.capitalLettersCount(inputNumbers));
		System.out.printf("Antal små bokstäver: %d\n", RaknaTecken.lowercaseLettersCount(inputNumbers));
	}
	
	private static int capitalLettersCount(File inputFile) throws FileNotFoundException
	{
		Scanner in = new Scanner(inputFile);
		
		int count = 0;
		
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			
			for (int i = 0; i < line.length(); i++)
			{
				char letter = line.charAt(i);
				boolean upper = Character.isUpperCase(letter);
				
				if (upper)
				{
					count++;
				}
			}
		}
		
		in.close();
		
		return count;
	}
	
	private static int lowercaseLettersCount(File inputFile) throws FileNotFoundException
	{
		Scanner in = new Scanner(inputFile);
		
		int count = 0;
		
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			
			for (int i = 0; i < line.length(); i++)
			{
				char letter = line.charAt(i);
				boolean upper = Character.isLowerCase(letter);
				
				if (upper)
				{
					count++;
				}
			}
		}
		
		in.close();
		
		return count;
	}
}
