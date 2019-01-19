package mc222sn_lab4.stack;

import java.util.Iterator;

public class StackTest
{
	public static void main(String[] args)
	{
		StackMain stack = new StackMain();
		
		System.out.printf("Stack size: %d\n", stack.size());
		System.out.printf("Stack empty: %b\n", stack.isEmpty());
		
		int one = 123;
		int two = 223;
		stack.push(one);
		stack.push(one);
		stack.push(two);
		stack.push(one);
		
		System.out.printf("Stack empty: %b\n", stack.isEmpty());
		System.out.printf("Stack size: %d\n", stack.size());
		System.out.printf("Peek: %d\n", stack.peek());
		
		System.out.printf("Pop: %d\n", stack.pop());
		System.out.printf("Stack size: %d\n", stack.size());
		
		Iterator<Object> it = stack.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// System.out.println(stack.iterator());
		
		// System.out.printf("Stack iterator: %d\n", stackIt);
	}
}
