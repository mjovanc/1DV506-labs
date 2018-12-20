package mc222sn_lab3;

public class Card
{
	private int rank;
	private String suit;
	
	public Card(int r, String s)
	{
		rank = r;
		suit = s;
	}
	
	public int getRank()
	{
		return rank;
	}
	
	public String getSuit()
	{
		return suit;
	}
}
