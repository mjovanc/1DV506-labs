package mc222sn_lab4.stack;

import java.util.Iterator;

public class StackMain implements Stack
{
	private int length = 4;
	private int size = 0;
	private Object[] values;
	
	public StackMain()
	{
		values = new Object[length];
	}
	
	@Override
	public int size()
	{
		return size;
	}

	@Override
	public boolean isEmpty()
	{
		if (size == 0)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public void push(Object element)
	{
		if (size == length)
		{
			resize();
		}
		
		values[size++] = (int) element;
	}

	@Override
	public Object pop() {
		Object value = values[size - 1];
		size--;
		
		length = length - 1;
		Object[] tmp = new Object[length];
		
		for (int i = 0; i < size; i++)
		{
			tmp[i] = values[i];
			values = tmp;
		}
		System.out.println();
		return value;
	}

	@Override
	public Object peek() {
		return values[size - 1];
	}
	
	@Override
	public Iterator<Object> iterator() {
		StackIterator it = new StackIterator(values); 
		return it;
	}
	
	private void resize()
	{
		length = length * 2;
		Object [] tmp = new Object[length];
		
		for (int i = 0; i < size; i++)
		{
			tmp[i] = values[i];
			values = tmp;
		}
	}

	
}
