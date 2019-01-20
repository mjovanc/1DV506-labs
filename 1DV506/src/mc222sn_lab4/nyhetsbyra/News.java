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
	
	public String getNews()
	{
		return date + " - " + title + "\t\t// " + newspaper.getName();
	}
}
