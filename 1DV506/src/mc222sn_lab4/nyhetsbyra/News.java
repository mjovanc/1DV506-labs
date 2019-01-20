package mc222sn_lab4.nyhetsbyra;

public class News
{
	private String title;
	private String date;
	private Newspaper newspaper;
	
	public News(String t, String d, Newspaper np)
	{
		title = t;
		date = d;
		newspaper = np;
	}
	
	public News getNews()
	{
		return this;
	}
	
	public Newspaper getNewspaper()
	{
		return newspaper;
	}
	
	public String displayNews()
	{
		return date + " - " + title + "\t\t// " + newspaper.getName();
	}
}
