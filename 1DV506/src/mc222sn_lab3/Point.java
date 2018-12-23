package mc222sn_lab3;

/**
 * The point class.
 * 
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class Point
{
	private int xPoint;
	private int yPoint;
	
	/**
	* Constructor for class Point.
	*/
	public Point()
	{
		xPoint = 0;
		yPoint = 0;
	}
	
	/**
	* Second constructor for class Point.
	*/
	public Point(int x, int y)
	{
		xPoint = x;
		yPoint = y;
	}
	
	/**
	 * Get the coordinates to a string.
	 * 
	 * @return String Returns a string with the coordinates.
	 */
	public String toString()
	{
		String coordinates = "(" + xPoint + "," + yPoint + ")";
		
		return coordinates;
	}
	
	/**
	 * Checking if one point is equal to the current point.
	 * 
	 * @param Point Takes a Point as parameter.
	 * @return boolean Returns true or false.
	 */
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
	
	/**
	 * Getting the distance between two points.
	 * 
	 * @param Point Takes a Point as parameter.
	 * @return double Returns the distance.
	 */
	public double distanceTo(Point p)
	{
		double distance = Math.sqrt( Math.pow( (xPoint - p.xPoint), 2) + Math.pow( (yPoint - p.yPoint), 2) );
		
		return distance;
	}
	
	/**
	 * Moving a point in sideways by x and y units.
	 * 
	 * @param int Takes an int as parameter x.
	 * @param int Takes an int as parameter y.
	 */
	public void move(int x, int y)
	{
		xPoint = xPoint + x;
		yPoint = yPoint + y;
	}
	
	/**
	 * Moving a point to new coordinates.
	 * 
	 * @param int Takes an int as parameter x.
	 * @param int Takes an int as parameter y.
	 */
	public void moveToXY(int x, int y)
	{
		xPoint = x;
		yPoint = y;
	}
}
