package mc222sn_lab4.nyhetsbyra;

import java.util.ArrayList;

/**
 * The NewsAgency class.
 *
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class NewsAgency
{
	private String name;
	private ArrayList<News> allNews = new ArrayList<News>();
	private ArrayList<Newspaper> registeredNewspapers = new ArrayList<Newspaper>();
	
	/**
	* Constructor for NewsAgency.
	* Setting news agency name.
	* 
	* @param n A string of the name for the news agency.
	*/
	public NewsAgency(String n)
	{
		name = n;
	}
	
	/**
	 * Register the newspaper object.
	 * 
	 * @param np Newspaper object.
	 */
	public void registerNewspaper(Newspaper np)
	{
		// Register the newspaper here and add all news to allNews ArrayList
		registeredNewspapers.add(np);

		for (News n : np.getAllNews())
		{
			allNews.add(n.getNews());
		}
	}
	
	/**
	 * Get all news from NewsAgency object.
	 * 
	 * @return ArrayList<News>
	 */
	public ArrayList<News> getAllNews()
	{
		return allNews;
	}
	
	/**
	 * Get the name for the NewsAgency object.
	 * 
	 * @return String Get the NewsAgency name.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sending news to all registered newspapers with
	 * exception of the source of the news.
	 * 
	 * 
	 */
	public void sendNews()
	{
		for (Newspaper np : registeredNewspapers)
		{
			for (News n : allNews)
			{
				boolean newsExists = n.getNewspaper().getName().equals(np.getName());
					
				if (!newsExists)
				{
					np.addNews(n);
				}
			}
		}
	}
}
