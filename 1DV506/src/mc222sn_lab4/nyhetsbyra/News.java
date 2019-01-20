package mc222sn_lab4.nyhetsbyra;

/**
 * The News class.
 *
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class News
{
	private String title;
	private String date;
	private Newspaper newspaper;
	
	/**
	* Constructor for News.
	* Setting news title, date and a newspaper object.
	* 
	* @param t A string with the title of the news.
	* @param d A string with a date format YYYY-MM-DD
	* @param np Newspaper object.
	*/
	public News(String t, String d, Newspaper np)
	{
		title = t;
		date = d;
		newspaper = np;
	}
	
	/**
	 * Get the News object.
	 * 
	 * @return News object.
	 */
	public News getNews()
	{
		return this;
	}
	
	/**
	 * Get the Newspaper object of News object.
	 * 
	 * @return Newspaper object.
	 */
	public Newspaper getNewspaper()
	{
		return newspaper;
	}
	
	/**
	 * Get the news in a nice string display format.
	 * 
	 * @return String A string to display the news.
	 */
	public String displayNews()
	{
		return date + " - " + title + "\t\t// " + newspaper.getName();
	}
}
