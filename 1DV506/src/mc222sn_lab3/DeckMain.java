package mc222sn_lab3;

import java.util.ArrayList;

/**
 * The main deck class for testing the deck and card objects.
 * 
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class DeckMain
{
	/**
	 * The starting point of the program. Runs some tests
	 * to see if the methods work as they should.
	 * 
	 * @param String[] Takes an array of strings as parameter.
	 */
	public static void main(String[] args)
	{
		ArrayList<String> distributedCards = new ArrayList<String>();
		Deck d = new Deck();
		
		d.shuffle();
		System.out.printf("Cards left: %d\n", d.cardsLeft());
		
		distributedCards.add(d.getCard());
		System.out.printf("Cards left: %d\n", d.cardsLeft());
		
		d.shuffle();
		
		distributedCards.add(d.getCard());
		distributedCards.add(d.getCard());
		System.out.printf("Cards left: %d\n", d.cardsLeft());
		
		System.out.println("\nCards taken:");
		
		for (String c : distributedCards)
		{
			System.out.printf("%s\n", c);
		}
	}
}
