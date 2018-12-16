package mc222sn_lab3;

public class MultiDisplay
{
	private String displayMessage;
	private int displayCount;
	
	public MultiDisplay()
	{
		displayMessage = "";
		displayCount = 0;
	}
	
	public void setDisplayMessage(String msg)
	{
		displayMessage = msg;
	}
	
	public void setDisplayCount(int count)
	{
		displayCount = count;
	}
	
	public String getDisplayMessage()
	{
		return displayMessage;
	}
	
	public void display()
	{
		for (int i = 0; i < displayCount; i++)
		{
			System.out.println(displayMessage);
		}
	}
	
	public void display(String msg, int count)
	{
		displayMessage = msg;
		
		for (int i = 0; i < count; i++)
		{
			System.out.println(msg);
		}
	}
}
