package mc222sn_lab3;

/**
 * A AlarmClock test class.
 * 
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class AlarmMain
{
	/**
	 * The starting point of the program. Runs some tests
	 * to see if the class AlarmClock works as it should.
	 * 
	 * @param String[] Takes an array of strings as parameter.
	 */
	public static void main(String[] args)
	{
		int tick = 0;
		
		AlarmClock ac = new AlarmClock(23, 48);
		ac.displayTime();
		ac.setAlarm(6, 15);
		
		while (tick < 500)
		{
			ac.timeTick();
			tick = tick + 1;
		}
		
		ac.displayTime();
	}
}