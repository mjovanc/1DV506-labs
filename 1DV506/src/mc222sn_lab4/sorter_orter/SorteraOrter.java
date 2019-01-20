package mc222sn_lab4.sorter_orter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * The SorteraOrter class.
 *
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class SorteraOrter
{
	/**
	 * The starting point of the program. Runs some tests
	 * to see if the methods work as they should.
	 *
	 * @param args Takes an array of strings as parameter.
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		try
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
			
			System.out.printf("Läser orter från filen: %s\n", path);
			System.out.printf("Antal funna orter: %d\n", numberOfCities);
			
			Collections.sort(orter);
			
			for (Ort o : orter)
			{
				System.out.printf("%d %s\n", o.getPostalCode(), o.getCity());
			}
			
			in.close();
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No such file or directory!");
		}
	}
}
