package mc222sn_lab3;

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	private enum Suits { Hearts, Diamonds, Spades, Clubs };
	private ArrayList<Card> cards;
	
	public Deck()
	{
		cards = new ArrayList<Card>();
		
		for (int i = 1; i <= 13; i++)
		{
			for (Suits s : Suits.values())
			{
				Card c = new Card(i, s.toString());
				cards.add(c);
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
		Card card = cards.get(cards.size() - 1);
		cards.remove(cards.size() - 1);
		
		return card.getRank() + " " + card.getSuit();
	}
	
	public int cardsLeft()
	{
		return cards.size();
	}
}
