package mc222sn_lab3;

public class Radio
{
	private int volume;
	private int channel;
	private boolean on;
	
	public Radio()
	{
		volume = 1;
		channel = 1;
		on = false;
	}
	
	public String getSettings()
	{
		String settings = "Settings: On " + on + ", Channel " + channel + ", Volume: " + volume;
		
		return settings;
	}
	
	public void turnOn()
	{
		on = true;
	}

	public void setVolume(int vol)
	{
		if (on)
		{
			if (vol >= 0 && vol <= 5)
			{
				volume = vol;
			}
			else
			{
				System.err.println("New volume not within range!");
			}
		}
		else
		{
			System.err.println("No adjustment possible");
		}
	}
	
	public void setChannel(int ch)
	{
		if (on)
		{
			if (ch >= 1 && ch <= 10)
			{
				channel = ch;
			}
			else
			{
				System.err.println("New channel not within range!");
			}
		}
		else
		{
			System.err.println("No adjustment possible");
		}
	}
	
}
