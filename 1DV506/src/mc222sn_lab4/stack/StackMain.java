package mc222sn_lab4.stack;

import java.util.Iterator;

public class StackMain implements Stack
{
	private int length = 4;
	private int size = 0;
	private int[] values;
	
	public StackMain()
	{
		values = new int[length];
	}
	
	public static void main(String[] args)
	{
		StackMain stack = new StackMain();
		System.out.printf("Stack size: %d\n", stack.size()); 
		System.out.printf("Stack empty: %b\n", stack.isEmpty());
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0)
		{
			return true;
		}
		return false;
	}

	@Override
	public void push(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
