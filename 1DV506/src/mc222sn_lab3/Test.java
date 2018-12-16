package mc222sn_lab3;

public class Test {

	public static void main(String[] args) {
		int length = 0;
		int[] n = {3,4,5,6,7};
		int[] sub = {4,5,6};
		
		for (int i = 0; i < n.length; i++)
		{
			for (int j = 0; j < sub.length; i++)
			{
				// kollar om elementet är lika med
				if (sub[j] == n[i + j])
				{
					length = length + 1;
				}
			}
			
			if (length == sub.length)
			{
				System.out.println("Has a sub sequence!");
			}
		}

	}

}
