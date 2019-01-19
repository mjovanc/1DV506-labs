package mc222sn_lab4.stack;

import java.util.Iterator;

public class StackIterator implements Iterator<Object>
{
	private int current;
	private Object[] items;

	public StackIterator(Object[] items)
	{        
		this.current = 0;
		this.items = items;
	}
	
	public boolean hasNext()
	{
		return (current < items.length);
	}

	public Object next()
	{
		return items[current++];    
	}
	
	public void remove()
	{
		throw new UnsupportedOperationException();
	}
}
