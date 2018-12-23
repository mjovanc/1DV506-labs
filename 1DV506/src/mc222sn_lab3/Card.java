package mc222sn_lab3;

/**
 * The card class.
 * 
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class Card
{
	private int rank;
	private String suit;
	
	/**
	* Constructor for Card.
	* 
	* @param int Getting the rank value.
	* @param String Getting the suit.
	*/
	public Card(int r, String s)
	{
		rank = r;
		suit = s;
	}
	
	/**
	 * Getting the card rank.
	 * 
	 * @return int Returns the rank value of the card.
	 */
	public int getRank()
	{
		return rank;
	}
	
	/**
	 * Getting the card suit.
	 * 
	 * @return String Returns the suit of the card.
	 */
	public String getSuit()
	{
		return suit;
	}
}
