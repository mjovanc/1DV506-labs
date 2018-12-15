package mc222sn_lab3;

public class Arrays
{

	public static void main(String[] args)
	{
		int[] n = {3,4,5,6,7};
	    String str = Arrays.toString(n);
	    System.out.println("n = " + str);
	}
	
	public static int sum(int[] arr)
	{
		int sum = 0;
		
		for (int i : arr)
		{
			sum = sum + i;
		}
		
		return sum;
	}
	
	public static String toString(int[] arr)
	{
		String str = "";
		int index = 0;
		
		for (int i : arr)
		{
			if (index == arr.length - 1)
			{
				str = str + i;
			}
			else
			{
				str = str + i + ", ";
			}
			index++;
		}
		
		return str;
	}
	
	public static int[] addN(int[] arr, int n)
	{
		
	}
}
