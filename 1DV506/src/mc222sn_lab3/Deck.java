package mc222sn_lab3;

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	private enum Suits { Hearts, Diamonds, Spades, Clubs };
	private ArrayList<String> cards;
	
	public Deck()
	{
		cards = new ArrayList<String>();
		
		for (int i = 1; i <= 13; i++)
		{
			for (Suits s : Suits.values())
			{
				cards.add(i + " " + s);
			}
		}
	}
	
	public void shuffle()
	{
		if (cards.size() == 52)
		{
			Collections.shuffle(cards);
		}
	}
	
	public String getCard()
	{
		String card = cards.get(cards.size() - 1);
		cards.remove(cards.size() - 1);
		
		return card;
	}
	
	public int cardsLeft()
	{
		return cards.size();
	}
}
