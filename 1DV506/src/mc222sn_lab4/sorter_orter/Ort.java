package mc222sn_lab4.sorter_orter;

public class Ort implements Comparable<Ort>
{
	private String city;
	private int postalCode;
	
	public Ort(String c, int pc)
	{
		city = c;
		postalCode = pc;
	}

	@Override
	public int compareTo(Ort o) {
		if (postalCode == o.postalCode)
		{
			return postalCode - o.postalCode;
		}
		
		return Integer.compare(postalCode, o.postalCode);
	}
	
	public String getCity()
	{
		return city;
	}
	
	public int getPostalCode()
	{
		return postalCode;
	}
	
	
}
