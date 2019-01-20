package mc222sn_lab4.nyhetsbyra;

public class NewsMain
{
	public static void main(String[] args)
	{
		NewsAgency reuters = new NewsAgency("Reuters");
		
		Newspaper aftonbladet = new Newspaper("Aftonbladet", reuters);
		Newspaper expressen = new Newspaper("Expressen", reuters);
		Newspaper smalandsposten = new Newspaper("Smålandsposten", reuters);
		
		News news1 = new News(
				"Sveriges mest jagade brottslingar är gripna",
				"2019-01-20",
				aftonbladet
		);
		News news2 = new News(
				"Badou Jacks hälsning efter otäcka skadan",
				"2019-01-20",
				expressen
		);
		News news3 = new News(
				"Världens äldsta man död – blev 113 år",
				"2019-01-20",
				smalandsposten
		);
		
		reuters.addNews(news1);
		reuters.addNews(news2);
		reuters.addNews(news3);
		
		
		
		System.out.println("Tidning: " + aftonbladet.getName());
		
		for (News n : reuters.getNews())
		{
			System.out.println(n.getNews());
		}
		
		
		
	}
}
