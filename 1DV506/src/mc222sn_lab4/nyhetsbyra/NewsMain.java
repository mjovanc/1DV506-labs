package mc222sn_lab4.nyhetsbyra;

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
	public static void main(String[] args)
	{	
		Newspaper aftonbladet = new Newspaper("Aftonbladet");
		Newspaper expressen = new Newspaper("Expressen");
		Newspaper smalandsposten = new Newspaper("Smålandsposten");
		
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
		
		aftonbladet.addNews(news1);
		aftonbladet.addNews(news2);
		smalandsposten.addNews(news3);
		
		NewsAgency reuters = new NewsAgency("Reuters");
		reuters.registerNewspaper(aftonbladet);
		reuters.registerNewspaper(expressen);
		reuters.registerNewspaper(smalandsposten);
		
		reuters.sendNews();
		
		for (News n : smalandsposten.getAllNews())
		{
			System.out.println(n.displayNews());
		}
	}
}
