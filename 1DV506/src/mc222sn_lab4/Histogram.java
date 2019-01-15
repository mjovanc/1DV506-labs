package mc222sn_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogram
{
	public static void main(String[] args)
	{
		String path = "/home/qexcc/Documents/heltal.dat";
		File inputNumbers = new File(path);
		
		System.out.printf("Läser heltal från filen: %s\n", path);
		System.out.printf("Antal i intervallet [1,100]: %d\n", Histogram.countInInterval(inputNumbers));
		System.out.printf("Övriga: %d\n", Histogram.countOutInterval(inputNumbers));
		
		System.out.println("Histogram");
		for (int i = 1; i < 100; i = i + 10)
		{
			System.out.printf("  %-2d - %-3d | \n", i, i + 9);
		}
		
		System.out.println();
		Histogram.occurs(inputNumbers);
	}
	
	public static int countInInterval(File numbers)
	{
		int count = 0;
		
		try
		{
			Scanner in = new Scanner(numbers);

			while(in.hasNextInt())
			{
				int value = in.nextInt();
				
				if (value > 0 && value <= 100)
				{
					count++;
				}
			}
			
			in.close();
		}
		catch (FileNotFoundException e)
		{
			System.err.println("Could not find the file.");
		}
		
		return count;
	}
	
	public static int countOutInterval(File numbers)
	{
		int count = 0;
		
		try
		{
			Scanner in = new Scanner(numbers);

			while(in.hasNextInt())
			{
				int value = in.nextInt();
				
				if (value < 1 || value > 100)
				{
					count++;
				}
			}
			
			in.close();
		}
		catch (FileNotFoundException e)
		{
			System.err.println("Could not find the file.");
		}
		
		return count;
	}
	
	public static void occurs(File numbers)
	{
		int count = 0;
		
		try
		{
			Scanner in = new Scanner(numbers);

			while(in.hasNextInt())
			{
				int value = in.nextInt();
				
				if (value > 0 && value <= 10)
				{
					count++;
				}
			}
			
			for (int i = 0; i < count; i++)
			{
				System.out.print("*");
			}
			
			in.close();
		}
		catch (FileNotFoundException e)
		{
			System.err.println("Could not find the file.");
		}
	}
}
