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
		System.out.println(RaknaTecken.capitalLettersCount(inputNumbers));
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
}
