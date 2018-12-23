package mc222sn_lab3;

/**
 * Some static methods to test with arrays.
 * 
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class Arrays
{
	/**
	 * The starting point of the program. Runs some tests
	 * to see if the methods work as they should.
	 * 
	 * @param String[] Takes an array of strings as parameter.
	 */
	public static void main(String[] args)
	{
		int[] n = {10,8,3,4,29,5,6,7};
		
		int[] arrTest1 = {1,2,3,4};
		int[] arrTest2 = {1,2,3};
		int[] arrTest3 = {1,2,5};
		int[] arrTest4 = {4,3};
		int[] arrTest5 = {1,2,3,4,5,6};
		
		int[] sub = {2,3};
		int[] sub2 = {4,5,6};
		
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
		
		//replaceAll() method
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
		
		// hasSubsequence() method
		boolean hasSub = hasSubsequence(arrTest5, sub2);
		System.out.println("\nhasSubsequence() method");
		System.out.printf("%s in %s\n", toString(sub2), toString(arrTest5));
		System.out.println("T/F: " + hasSub);
		
		// isLarger() method
		System.out.println("\nisLarger() method");
		boolean largerArr = isLarger(arrTest3, arrTest3);
		System.out.printf("%s vs %s\n", toString(arrTest3), toString(arrTest3));
		System.out.println(largerArr);
	}
	
	/**
	 * This method returns the sum of an array that get passed in.
	 * 
	 * @param arr Takes an array of integers as parameter.
	 * @return int Returns the sum of an array.
	 */
	public static int sum(int[] arr)
	{
		int sum = 0;
		
		for (int i : arr)
		{
			sum = sum + i;
		}
		
		return sum;
	}
	
	/**
	 * This method returns the array that get passed to a string.
	 * 
	 * @param arr Takes an array of integers as parameter.
	 * @return String Returns the array to a string.
	 */
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
	
	/**
	 * Adding n number to every element of the passed array and
	 * creating a new array and returns it.
	 * 
	 * @param arr Takes an array of integers as parameter.
	 * @param n Takes a integer as parameter.
	 * @return int[] Returns a new array.
	 */
	public static int[] addN(int[] arr, int n)
	{
		int[] newArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++)
		{
			newArr[i] = arr[i] + n;
		}
		
		return newArr;
	}
	
	/**
	 * Changing the order of the passed array to reversed order and
	 * creating a new array and returns it.
	 * 
	 * @param arr Takes an array of integers as parameter.
	 * @return int[] Returns a new array.
	 */
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
	
	/**
	 * Checking every element of the passed array if it has
	 * n number in it and returns true or false.
	 * 
	 * @param arr Takes an array of integers as parameter.
	 * @param n Takes a integer as parameter.
	 * @return boolean Returns true or false.
	 */
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
	
	/**
	 * Replacing specific element values of the passed array.
	 * 
	 * @param arr Takes an array of integers as parameter.
	 * @param old The old element value to replace.
	 * @param nw The new element value to replace with.
	 */
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
	
	/**
	 * Sorting the passed array and returns a new sorted array.
	 * 
	 * @param arr Takes an array of integers as parameter.
	 * @return int[] Returns a new array of integers.
	 */
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
	
	/**
	 * Checking if the passed array sub exists as a sub sequence
	 * of the passed array arr.
	 * 
	 * @param arr Takes an array of integers as parameter.
	 * @param sub Takes an array of integers as parameter.
	 * @return boolean Returns true or false.
	 */
	public static boolean hasSubsequence(int[] arr, int[] sub)
	{
		int length = 0;
		int index = 0;
		boolean run = true;
		
		for (int i = 0; i < sub.length; i++)
		{
			if (run)
			{
				for (int j = index; j < arr.length; j++)
				{
					if (sub[i] == arr[j])
					{
						index = i;
						length = length + 1;
						run = false;
					}
				}
				
				run = true;
			}
			
			if (length == sub.length)
			{
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Checking if the first passed array is larger than
	 * the second passed array.
	 * 
	 * @param a1 Takes an array of integers as parameter.
	 * @param a2 Takes an array of integers as parameter.
	 * @return boolean Returns true or false.
	 */
	public static boolean isLarger(int[] a1, int[] a2)
	{
		int length = 0;
		
		if (a1.length < a2.length)
		{
			length = a1.length;
		} 
		else
		{
			length = a2.length;
		}
		
		for (int i = 0; i < length; i++)
		{
			if (a1[i] < a2[i])
			{
				return false;
			}
			else if (a1[i] > a2[i])
			{
				return true;
			}
		}
		
		if (a1.length > a2.length)
		{
			return true;
		}
		
		return false;
	}
}








