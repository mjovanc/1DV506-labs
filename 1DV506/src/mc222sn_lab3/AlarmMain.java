package mc222sn_lab3;

public class AlarmMain
{
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
