package mc222sn_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogram
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String path = args[0];
		File inputNumbers = new File(path);
		
		System.out.printf("Läser heltal från filen: %s\n", path);
		System.out.printf("Antal i intervallet [1,100]: %d\n", Histogram.countInInterval(inputNumbers));
		System.out.printf("Övriga: %d\n", Histogram.countOutInterval(inputNumbers));
		
		System.out.println("Histogram");
		for (int i = 1; i < 100; i = i + 10)
		{
			int occurs = Histogram.occurs(inputNumbers, i, i + 9);
			StringBuilder asterix = new StringBuilder();
			
			for (int j = 0; j < occurs; j++)
			{
				asterix.append("*");
			}
			
			System.out.printf("  %-2d - %-3d | %s \n", i, i + 9, asterix);
		}
	}
	
	public static int countInInterval(File numbers) throws FileNotFoundException
	{
		int count = 0;
		
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
		
		return count;
	}
	
	public static int countOutInterval(File numbers) throws FileNotFoundException
	{
		int count = 0;
		
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
		
		return count;
	}
	
	public static int occurs(File numbers, int numberFrom, int numberTo) throws FileNotFoundException
	{
		int count = 0;
		
		Scanner in = new Scanner(numbers);

		while(in.hasNextInt())
		{
			int value = in.nextInt();
			
			if (value >= numberFrom && value <= numberTo)
			{
				count++;
			}
		}
			
		in.close();
		
		return count;
	}
}
