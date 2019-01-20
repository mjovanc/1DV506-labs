package mc222sn_lab4.sorter_orter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class SorteraOrter
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String path = args[0];
		File postalCodeFile = new File(path);
		Scanner in = new Scanner(postalCodeFile);
		
		ArrayList<Ort> orter = new ArrayList<Ort>();
		
		int count = 0;
		
		
		String city = "";
		int postalCode = 0;
		int numberOfCities = 0;
		
		while (in.hasNext())
		{
			String line = in.next();
			int lengthOfString = line.length();
			
			if (count % 2 != 0)
			{
				postalCode = Integer.parseInt(line.substring(0, lengthOfString - 1));
				Ort o = new Ort(city, postalCode);
				orter.add(o);
			}
			else
			{
				city = line.substring(0, lengthOfString - 1);
				numberOfCities++;
			}
			
			count++;
		}
		
//		Ort o1 = new Ort("Stockholm", 35242);
//		Ort o2 = new Ort("Stockholm", 35242);
		
//		System.out.println(o1.compareTo(o2));
		
		System.out.printf("Läser orter från filen: %s\n", path);
		System.out.printf("Antal funna orter: %d\n", numberOfCities);
		
		for (Ort o : orter)
		{
			System.out.printf("%d %s\n", o.getPostalCode(), o.getCity());
		}
	}
}
