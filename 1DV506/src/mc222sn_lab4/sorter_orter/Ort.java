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
		boolean city = this.city.equals(o.getCity());
		boolean pc = this.postalCode == o.getPostalCode();
		boolean equals = city && pc;
		
		return equals ? 1 : -1;
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
