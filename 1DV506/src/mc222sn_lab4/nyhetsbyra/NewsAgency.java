package mc222sn_lab4.nyhetsbyra;

import java.util.ArrayList;

public class NewsAgency
{
	private String name;
	private ArrayList<News> latestNews = new ArrayList<News>();
	private ArrayList<Object> registeredNewspapers = new ArrayList<Object>();
	
	public NewsAgency(String n)
	{
		name = n;
	}
	
	public void registerNewspaper(Newspaper np)
	{
		registeredNewspapers.add(np);
	}
	
	public void addNews(News n)
	{
		latestNews.add(n);
	}
	
	public ArrayList<News> getNews()
	{
		return latestNews;
	}
	
	public String getName()
	{
		return name;
	}
}
