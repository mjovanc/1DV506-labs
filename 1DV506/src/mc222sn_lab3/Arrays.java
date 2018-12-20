package mc222sn_lab3;

public class Arrays
{
	public static void main(String[] args)
	{
		int[] n = {10,8,3,4,29,5,6,7};
		int[] sub = {4,5,6};
		// boolean subSeq = Arrays.hasSubsequence(n, sub);
		
		// System.out.println(subSeq);
		
		// sum() method
		System.out.println("sum() method");
		System.out.println(sum(n)); // 25
		
		// toString() method
		System.out.println("\ntoString() method");
		System.out.println(toString(n)); // 3, 4, 5, 6, 7
		
		// addN() method
		System.out.println("\naddN() method");
		int[] arr = addN(n, 3);
		for (int i : arr) // 6 7 8 9 10
		{
			System.out.println(i);
		}
		
		// reverse() method
		System.out.println("\nreverse() method");
		for (int i : reverse(n)) // 6 7 8 9 10
		{
			System.out.println(i);
		}
		
		// hasN() method
		System.out.println("\nhasN() method");
		boolean hasLetterN = hasN(n, 7);
		if (hasLetterN)
		{
			System.out.println("Has letter N in array!");
		}
		else
		{
			System.out.println("Letter N missing in array!");
		}
		
		//replaceAll() method // funkar inte
		System.out.println("\nreplaceAll() method");
		replaceAll(n, 7, 2);
		for (int i : n)
		{
			System.out.println(i);
		}
		
		// sort() method
		System.out.println("\nsort() method");
		int[] arr3 = sort(n);
		for (int i : arr3)
		{
			System.out.println(i);
		}
		
		// hasSubSequence() method
		
		// isLarger() method
		
		
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
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == old)
			{
				arr[i] = nw;
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
				if (newArr[i] < newArr[j])
				{
					temp = newArr[i];
					
					newArr[i] = newArr[j];
					newArr[j] = temp;
				}
			}
		}
		
		return newArr;
	}
	
//	public static boolean hasSubsequence(int[] arr, int[] sub)
//	{
//		int length = 0;
//		
//		for (int i = 0; i < arr.length; i++)
//		{
//			// Testar om första heltalet är samma som index på arr
//			if (sub[i] == arr[i])
//			{
//				for (int j = 0; j < sub.length; j++)
//				{
//					if (sub[j] == arr[i + j])
//					{
//						length = length + 1;
//					}
//				}
//				
//				if (length == sub.length)
//				{
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	
	public boolean isLarger(int[] a1, int[] a2)
	{
		int length = 0;
		
		if (a1.length > a2.length)
		{
			length = a1.length;
		}
		else
		{
			length = a2.length;
		}
		
		for (int i = 0; i < length; i++)
		{
			if (a1[i] > a2[i])
			{
				return true;
			}
			else if (a1.length > a2.length)
			{
				return true;
			}
			else if (a1.length < a2.length)
			{
				return false;
			}
		}
	}
}








