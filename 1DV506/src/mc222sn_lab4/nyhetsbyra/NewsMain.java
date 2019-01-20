package mc222sn_lab4.nyhetsbyra;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * The NewsMain class.
 *
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class NewsMain
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
			// Getting the news from external file. Test textfile is included in zip-file.
			String path = args[0];
			File newsSource = new File(path);
			Scanner in = new Scanner(newsSource);
			
			while (in.hasNextLine())
			{
				String[] line = in.nextLine().split(":");		
				for (String l : line)
				{
					System.out.println(l);
				}
				// System.out.println(newspaper);
			}
			
			// Initializing Newspaper objects.
			Newspaper aftonbladet = new Newspaper("Aftonbladet");
			Newspaper expressen = new Newspaper("Expressen");
			Newspaper smalandsposten = new Newspaper("Smålandsposten");
			
			// Initializing News objects
			News news1 = new News(
					"Sveriges mest jagade brottslingar är gripna",
					"2019-01-20",
					aftonbladet
			);
			News news2 = new News(
					"Badou Jacks hälsning efter otäcka skadan",
					"2019-01-20",
					aftonbladet
			);
			News news3 = new News(
					"Världens äldsta man död – blev 113 år",
					"2019-01-20",
					smalandsposten
			);
			
			News news4 = new News(
					"Kvinna slog till butikspersonal i ansiktet",
					"2019-01-20",
					smalandsposten
			);
			
			// Adding news to corresponding newspaper.
			aftonbladet.addNews(news1);
			aftonbladet.addNews(news2);
			smalandsposten.addNews(news3);
			smalandsposten.addNews(news4);
			
			// Initializing NewsAgency object and register the newspapers to it.
			NewsAgency reuters = new NewsAgency("Reuters");
			reuters.registerNewspaper(aftonbladet);
			reuters.registerNewspaper(expressen);
			reuters.registerNewspaper(smalandsposten);
			
			// Sending news to all newspapers except the newspaper source.
			reuters.sendNews();
			
			System.out.println("\nAftonbladet: ");
			for (News n : aftonbladet.getAllNews())
			{
				System.out.println(n.displayNews());
			}
			
			System.out.println("\nExpressen: ");
			for (News n : expressen.getAllNews())
			{
				System.out.println(n.displayNews());
			}
			
			System.out.println("\nSmålandsposten: ");
			for (News n : smalandsposten.getAllNews())
			{
				System.out.println(n.displayNews());
			}
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No such file or directory!");
		}
	}
}
