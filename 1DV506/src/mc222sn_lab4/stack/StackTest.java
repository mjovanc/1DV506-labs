package mc222sn_lab4.stack;

import java.util.Iterator;

/**
 * The StackTest class.
 *
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class StackTest
{
	/**
	 * The starting point of the program. Runs some tests
	 * to see if the methods work as they should.
	 *
	 * @param args Takes an array of strings as parameter.
	 */
	public static void main(String[] args)
	{
		try
		{
			StackMain stack = new StackMain();
			
			// System.out.printf("Peek: %d\n", stack.peek());
			// System.out.printf("Pop: %d\n", stack.pop());
			
//			System.out.printf("Stack size: %d\n", stack.size());
			// System.out.printf("Stack empty: %b\n", stack.isEmpty());
			
//			int one = 123;
//			int two = 223;
//			int three = 323;
//			int four = 423;
//			int five = 523;
//			
//			stack.push(one);
//			stack.push(two);
			
			System.out.printf("Stack empty: %b\n", stack.isEmpty());
//			System.out.printf("Stack size: %d\n", stack.size());
//			System.out.printf("Peek: %d\n", stack.peek());
			
//			System.out.printf("Pop: %d\n", stack.pop());
			System.out.printf("Stack size: %d\n", stack.size());
//			System.out.printf("Peek: %d\n\n", stack.peek());
			
//			stack.push(text);
//			stack.push(four);
//			stack.push(five);

			
			Iterator<Object> it = stack.iterator();
			
			System.out.println("Iteration over stack elements:");
			while (it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		catch (IllegalStateException e)
		{
			System.err.println(e.getMessage());
		}
	}
}
