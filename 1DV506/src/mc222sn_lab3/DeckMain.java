package mc222sn_lab3;

import java.util.ArrayList;

public class DeckMain
{
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
