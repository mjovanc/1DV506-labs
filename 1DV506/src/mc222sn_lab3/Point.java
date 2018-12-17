package mc222sn_lab3;

public class Point
{
	private int xPoint;
	private int yPoint;
	
	public Point()
	{
		xPoint = 0;
		yPoint = 0;
	}
	
	public Point(int x, int y)
	{
		xPoint = x;
		yPoint = y;
	}
	
	public String toString()
	{
		String coordinates = "(" + xPoint + "," + yPoint + ")";
		
		return coordinates;
	}
	
	public boolean isEqualTo(Point p)
	{
		boolean equal = xPoint == p.xPoint && yPoint == p.yPoint;
		
		if (equal)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double distanceTo(Point p)
	{
		double distance = Math.sqrt( Math.pow( (xPoint - p.xPoint), 2) + Math.pow( (yPoint - p.yPoint), 2) );
		
		return distance;
	}
	
	public void move(int x, int y)
	{
		xPoint = xPoint + x;
		yPoint = yPoint + y;
	}
	
	public void moveToXY(int x, int y)
	{
		xPoint = x;
		yPoint = y;
	}

}
