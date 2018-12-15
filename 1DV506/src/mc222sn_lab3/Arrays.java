package mc222sn_lab3;

public class Arrays
{
	public static void main(String[] args)
	{
		int[] n = {3,4,5,6,7,1,2,5,3,8};
		int[] newArr = Arrays.sort(n);
		
		for (int i : newArr)
		{
			System.out.println(i);
		}
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
		int[] newArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++)
		{
			newArr[i] = arr[i] + n;
		}
		
		return newArr;
	}
	
	public static int[] reverse(int[] arr)
	{
		int[] newArr = new int[arr.length];
		int index = 0;
		
		for (int i = arr.length - 1; i >= 0; i--)
		{
			newArr[index] = arr[i];
			index++;
		}
		
		return newArr;
	}
	
	public static boolean hasN(int[] arr, int n)
	{
		for (int i : arr)
		{
			if (i == n) {
				return true;
			}
		}
		return false;
	}
	
	public static void replaceAll(int[] arr, int old, int nw)
	{
		for (int i : arr)
		{
			if (i == old)
			{
				i = nw;
			}
		}
	}
	
	public static int[] sort(int[] arr)
	{
		int[] newArr = new int[arr.length];
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			newArr[i] = arr[i];
		}
		
		for (int i = 0; i < newArr.length; i++)
		{
			for (int j = 0; j < newArr.length; j++)
			{
				if (newArr[i] > newArr[j])
				{
					temp = newArr[i];
					
					newArr[i] = newArr[j];
					newArr[j] = temp;
				}
			}
		}
		
		return newArr;
	}
}








