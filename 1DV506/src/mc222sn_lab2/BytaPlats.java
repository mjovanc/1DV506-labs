package mc222sn_lab2;

/**
 * Prints all elements of the array, then changing
 * the elements order and then prints all the elements again.
 * 
 * @author Marcus Cvjeticanin
 */
public class BytaPlats
{
	public static void main(String[] args)
	{
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 
	         			't', 't', 'e', 'D' };
	         			
		for (int i = 0; i < text.length; i++)
	    {
			System.out.print(text[i]);
	    }
	      
	    System.out.println();
	      
	    for (int i = 0; i < text.length; i++)
	    {
	    	if (i < text.length / 2)
	    	{
	    		char first = text[i];
	    		char second = text[text.length - (i + 1)];
		    		  
	    		text[i] = second;
	    		text[text.length - (i + 1)] = first;		  
	    	 }
	    }
	      
	   System.out.println(text);
	}
}
