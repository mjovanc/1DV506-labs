package mc222sn_lab4.nyhetsbyra;

import java.util.ArrayList;

public class Newspaper
{
	private String name;
	private ArrayList<Object> news = new ArrayList<Object>();
	
	public Newspaper(String n)
	{
		name = n;
	}
	
	public void getFirstNews(Object latestNews)
	{
		news.add(latestNews);
	}
	
	public String getName()
	{
		return name;
	}
}
