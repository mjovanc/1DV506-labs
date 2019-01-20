package mc222sn_lab4.sorter_orter;

/**
 * The Ort class.
 *
 * @version 1.0
 * @implements Comparable
 * @author Marcus Cvjeticanin
 */
public class Ort implements Comparable<Ort>
{
	private String city;
	private int postalCode;
	
	/**
	* Constructor for Ort.
	* 
	* @param c Takes a String with the city name as parameter.
	* @param pc Takes an integer with the postal code as parameter.
	*/
	public Ort(String c, int pc)
	{
		city = c;
		postalCode = pc;
	}

	/**
	 * Compares two objects by postal code if there's a match.
	 * 
	 * @return int Returns 0 if it's the same postal code.
	 */
	@Override
	public int compareTo(Ort o)
	{
		if (postalCode == o.postalCode)
		{
			return postalCode - o.postalCode;
		}
		
		return Integer.compare(postalCode, o.postalCode);
	}
	
	/**
	 * Get the city name.
	 * 
	 * @return String Returns the city name.
	 */
	public String getCity()
	{
		return city;
	}
	
	/**
	 * Get the postal code.
	 * 
	 * @return int Returns the postal code.
	 */
	public int getPostalCode()
	{
		return postalCode;
	}
}
