package mc222sn_lab3;

import java.lang.Math;

// Not completed. 
public class RandomWalk
{
	private int xCoordinate;
	private int yCoordinate;
	private int maximumSteps;
	private int currentSteps;
	private int planeSize;
	
	public RandomWalk(int max, int edge)
	{
		maximumSteps = max;
		planeSize = edge;
		xCoordinate = 0;
		yCoordinate = 0;
	}
	
	public void takeStep ()
	{
		int max = 9999; 
        int min = 1000; 
        int range = max - min + 1; 
        int number = (int) (Math.random() * range) + min;
        int[] numbers = new int[4];
        
        // Adding every 4 numbers into numbers[] array.
        for (int i = 0; i < numbers.length; i++)
        {
        	String convertedNumber = String.valueOf(number);
        	int n = Integer.parseInt(convertedNumber.substring(i, i+1));
        	numbers[i] = n;
        }

        System.out.println(numbers[0]);
        
		currentSteps = currentSteps + 1;
	}
	
	public boolean moreSteps()
	{
		if (currentSteps < maximumSteps)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String str = ("Amount of steps: " + currentSteps +
					"\nCurrent position: " + "(" + yCoordinate +
					", " + xCoordinate + ")");
		
		return str;
	}
}
