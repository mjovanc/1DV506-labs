package mc222sn_lab3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The deck class.
 * 
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class Deck
{
	private enum Suits { Hearts, Diamonds, Spades, Clubs };
	private ArrayList<Card> cards;
	
	/**
	* Constructor for Deck.
	* Creating 52 cards.
	*/
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
	
	/**
	 * Shuffles the cards.
	 */
	public void shuffle()
	{
		if (cards.size() == 52)
		{
			Collections.shuffle(cards);
		}
	}
	
	/**
	 * Getting a card from cards ArrayList.
	 * 
	 * @return String Returns a string of the rank and suit.
	 */
	public String getCard()
	{
		Card card = cards.get(cards.size() - 1);
		cards.remove(cards.size() - 1);
		
		return card.getRank() + " " + card.getSuit();
	}
	
	/**
	 * Getting a number of how many cards there is
	 * in the ArrayList cards.
	 * 
	 * @return int Returns the size of the ArrayList cards.
	 */
	public int cardsLeft()
	{
		return cards.size();
	}
}
