package mc222sn_lab3;

public class Test {

	public static void main(String[] args) {
//		int length = 0;
//		int[] n = {3,4,5,6,7};
//		int[] sub = {4,5,6};
//		
//		for (int i = 0; i < n.length; i++)
//		{
//			for (int j = 0; j < sub.length; i++)
//			{
//				// kollar om elementet är lika med
//				if (sub[j] == n[i + j])
//				{
//					length = length + 1;
//				}
//			}
//			
//			if (length == sub.length)
//			{
//				System.out.println("Has a sub sequence!");
//			}
//		}
		
		Point p1 = new Point();
		Point p2 = new Point(3,4);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		double dist = p1.distanceTo(p2);
		System.out.println("Distance: " + dist);
		
		
		p1.move(4, 2);
		p2.move(-5, -7);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
//		if (p1.isEqualTo(p2))
//		{
//			System.out.println("The two points are equal");
//		}
//		else
//		{
//			System.out.println("The two points are NOT equal");
//		}
			
		
	}

}
