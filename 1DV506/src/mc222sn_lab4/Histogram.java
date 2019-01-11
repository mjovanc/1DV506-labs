package mc222sn_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogram
{
	public static void main(String[] args)
	{
		Histogram.print("/home/qexcc/Documents/heltal.dat");
	}
	
	public static void print(String path)
	{
		File inputNumbers = new File(path);
		
		try
		{
			Scanner in = new Scanner(inputNumbers);
			
			while(in.hasNextInt())
			{
				int value = in.nextInt();
				System.out.println(value);
			}
		}
		catch (FileNotFoundException e)
		{
			System.err.println("");
		}
	}
}
