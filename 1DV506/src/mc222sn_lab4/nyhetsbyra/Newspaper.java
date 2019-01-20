package mc222sn_lab4.nyhetsbyra;

import java.util.ArrayList;

public class Newspaper
{
	private String name;
	private ArrayList<Object> news = new ArrayList<Object>();
	private Object newsAgency;
	
	public Newspaper(String n, Object na)
	{
		name = n;
		newsAgency = na;
	}
	
	public void getFirstNews(Object latestNews)
	{
		news.add(latestNews);
	}
	
	public ArrayList<Object> getNews()
	{
		return news;
	}
	
	public String getName()
	{
		return name;
	}
}
