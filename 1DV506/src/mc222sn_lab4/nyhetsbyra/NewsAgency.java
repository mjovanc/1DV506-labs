package mc222sn_lab4.nyhetsbyra;

import java.util.ArrayList;

public class NewsAgency
{
	private String name;
	private ArrayList<Object> latestNews = new ArrayList<Object>();
	private ArrayList<Object> registeredNewspapers = new ArrayList<Object>();
	
	public NewsAgency(String n)
	{
		name = n;
	}
	
	public void registerNewspaper(Newspaper np)
	{
		registeredNewspapers.add(np);
		np.getFirstNews(latestNews);
	}
	
	public String getName()
	{
		return name;
	}
}
