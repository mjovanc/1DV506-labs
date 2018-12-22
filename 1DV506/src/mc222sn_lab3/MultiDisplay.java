package mc222sn_lab3;

/**
 * A multidisplay class.
 * 
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class MultiDisplay
{
	private String displayMessage;
	private int displayCount;
	
	/**
	* Constructor for MultiDisplay
	*/
	public MultiDisplay()
	{
		displayMessage = "";
		displayCount = 0;
	}
	
	/**
	 * Sets a new display message with the passed string.
	 * 
	 * @param msg Takes a string as parameter.
	 */
	public void setDisplayMessage(String msg)
	{
		displayMessage = msg;
	}
	
	/**
	 * Sets the display count.
	 * 
	 * @param count Takes an int as parameter.
	 */
	public void setDisplayCount(int count)
	{
		displayCount = count;
	}
	
	/**
	 * Gets the display message.
	 */
	public String getDisplayMessage()
	{
		return displayMessage;
	}
	
	/**
	 * Displays the message by the display count.
	 */
	public void display()
	{
		for (int i = 0; i < displayCount; i++)
		{
			System.out.println(displayMessage);
		}
	}
	
	/**
	 * Displays the specified message from the passed string
	 * and using the display count from the passed int.
	 * 
	 * @param msg Takes a string as parameter.
	 * @param count Takes an int as parameter.
	 */
	public void display(String msg, int count)
	{
		displayMessage = msg;
		
		for (int i = 0; i < count; i++)
		{
			System.out.println(msg);
		}
	}
}
