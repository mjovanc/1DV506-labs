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
			
			NewsAgency reuters = new NewsAgency("Reuters");
			
			while (in.hasNextLine())
			{
				String[] line = in.nextLine().split(":");
				String title = "";
				String date = "";
				String np = "";
				
				for (int i = 0; i < line.length; i++)
				{
					switch(i)
					{
						case 0:
							title = line[i];
							break;
						case 1:
							date = line[i];
							break;
						case 2:
							np = line[i];
							break;
					}
				}
				
				Newspaper newspaper = new Newspaper(np);
				News n = new News(date, title, newspaper);
				
				newspaper.addNews(n);
				reuters.registerNewspaper(newspaper);
			}

			reuters.sendNews();
			
			for (Newspaper np : reuters.getRegisterdNewspapers())
			{
				System.out.println("\n" + np.getName());
				for (News n : np.getAllNews())
				{
					boolean aftonbladet = n.getNews().getNewspaper().getName().equals("Aftonbladet");
					boolean expressen = n.getNews().getNewspaper().getName().equals("Expressen");
					boolean smalandsposten = n.getNews().getNewspaper().getName().equals("Smålandsposten");
					
					if (aftonbladet)
					{
						System.out.println(n.getNews().displayNews());
					}
					else if (expressen)
					{
						System.out.println(n.getNews().displayNews());
					}
					else if (smalandsposten)
					{
						System.out.println(n.getNews().displayNews());
					}
				}
			}
			
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No such file or directory!");
		}
	}
}
