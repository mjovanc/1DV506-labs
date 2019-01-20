package mc222sn_lab4.nyhetsbyra;

import java.util.ArrayList;

/**
 * The Newspaper class.
 *
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class Newspaper
{
	private String name;
	private ArrayList<News> news = new ArrayList<News>();
	
	/**
	* Constructor for Newspaper.
	* Setting newspaper name.
	* 
	* @param n A string with the name for the newspaper.
	*/
	public Newspaper(String n)
	{
		name = n;
	}
	
	/**
	 * Get all news from Newspaper object.
	 * 
	 * @return ArrayList<News>
	 */
	public ArrayList<News> getAllNews()
	{
		return news;
	}
	
	/**
	 * Add a News object to the Newspaper ArrayList news.
	 * 
	 * @param n News object.
	 */
	public void addNews(News n) throws IllegalArgumentException
	{
		news.add(n);
	}
	
	/**
	 * Add a News object to the NewsPaper ArrayList news.
	 * 
	 * @return String Returns the name of the Newspaper object.
	 */
	public String getName()
	{
		return name;
	}
}
