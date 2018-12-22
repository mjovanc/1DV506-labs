package mc222sn_lab3;

/**
 * The radio class.
 * 
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class Radio
{
	private int volume;
	private int channel;
	private boolean on;
	
	/**
	* Constructor for class Radio.
	*/
	public Radio()
	{
		volume = 1;
		channel = 1;
		on = false;
	}
	

	/**
	 * Returns the settings for the radio.
	 * 
	 * @return String Returns a string with the settings for the radio.
	 */
	public String getSettings()
	{
		String settings = "Settings: On " + on + ", Channel " + channel + ", Volume: " + volume;
		
		return settings;
	}
	
	/**
	 * Setting the radio on.
	 */
	public void turnOn()
	{
		on = true;
	}
	
	/**
	 * Turning off the radio.
	 */
	public void turnOff()
	{
		volume = 1;
		channel = 1;
		on = false;
	}

	/**
	 * Setting the volume.
	 * 
	 * @param int Takes an integer as parameter for the volume.
	 */
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
	
	/**
	 * Setting the channel.
	 * 
	 * @param int Takes an integer as parameter for the channel.
	 */
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
	
	/**
	 * Setting the volume one step up.
	 */
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
	
	/**
	 * Setting the volume one step down.
	 */
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
	
	/**
	 * Setting the channel one step up.
	 */
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
	
	/**
	 * Setting the channel one step down.
	 */
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
