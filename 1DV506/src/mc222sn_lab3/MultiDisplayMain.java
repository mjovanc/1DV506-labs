package mc222sn_lab3;

/**
 * A multidisplay test class.
 * 
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class MultiDisplayMain
{
	/**
	 * The starting point of the program. Runs some tests
	 * to see if the class MultiDisplay works as it should.
	 * 
	 * @param String[] Takes an array of strings as parameter.
	 */
	public static void main(String[] args)
	{
		MultiDisplay md = new MultiDisplay();
		
		md.setDisplayMessage("Hello World!");
		md.setDisplayCount(2);
		
		md.display();
		md.display("Goodbye cruel world!", 6);
		
		System.out.println("Current msg: " + md.getDisplayMessage());
	}
}
