package mc222sn_lab4.stack;

import java.util.Iterator;

public class StackIterator implements Iterator<Object>
{
	private int nextElement = 0;
	private final Object[] elements;
	private final int max;

	public StackIterator(Object[] items, int size)
	{        
		elements = items;
		max = size;
	}
	
	public boolean hasNext()
	{
		return nextElement < max;
	}

	public Object next()
	{
		return elements[nextElement++];
	}
}
