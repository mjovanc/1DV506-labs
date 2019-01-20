package mc222sn_lab4.nyhetsbyra;

public class NewsMain
{
	public static void main(String[] args)
	{
		NewsAgency reuters = new NewsAgency("Reuters");
		
		Newspaper aftonbladet = new Newspaper("Aftonbladet");
		Newspaper expressen = new Newspaper("Expressen");
		Newspaper smalandsposten = new Newspaper("Smålandsposten");
		
		System.out.println(reuters.getName());
		
		System.out.println(aftonbladet.getName());
	}
}
