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
	
	public void turnOff()
	{
		volume = 1;
		channel = 1;
		on = false;
	}

	public void setVolume(int newVolume)
	{
		if (on)
		{
			if (newVolume >= 0 && newVolume <= 5)
			{
				volume = newVolume;
			}
			else
			{
				System.err.println("New volume not within range!");
			}
		}
		else
		{
			System.err.println("Radio off ==> No adjustment possible");
		}
	}
	
	public void setChannel(int newChannel)
	{
		if (on)
		{
			if (newChannel >= 1 && newChannel <= 10)
			{
				channel = newChannel;
			}
			else
			{
				System.err.println("New channel not within range!");
			}
		}
		else
		{
			System.err.println("Radio off ==> No adjustment possible");
		}
	}
	
	public void volumeUp()
	{
		if (on)
		{
			if (volume < 5)
			{
				volume = volume + 1;
			}
			else
			{
				System.err.println("New volume not within range!");
			}
		}
		else
		{
			System.err.println("Radio off ==> No adjustment possible");
		}
	}
	
	public void volumeDown()
	{
		if (on)
		{
			if (volume > 0)
			{
				volume = volume - 1;
			}
			else
			{
				System.err.println("New volume not within range!");
			}
		}
		else
		{
			System.err.println("Radio off ==> No adjustment possible");
		}
	}
	
	public void channelUp()
	{
		if (on)
		{
			if (channel < 10)
			{
				channel = channel + 1;
			}
			else
			{
				System.err.println("New channel not within range!");
			}
		}
		else
		{
			System.err.println("Radio off ==> No adjustment possible");
		}
	}
	
	public void channelDown()
	{
		if (on)
		{
			if (channel > 1)
			{
				channel = channel - 1;
			}
			else
			{
				System.err.println("New channel not within range!");
			}
		}
		else
		{
			System.err.println("Radio off ==> No adjustment possible");
		}
	}
	
}
