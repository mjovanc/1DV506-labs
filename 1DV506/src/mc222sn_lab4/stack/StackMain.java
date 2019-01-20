package mc222sn_lab4.stack;

import java.util.Iterator;

/**
 * The StackMain class.
 *
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public class StackMain implements Stack
{
	private int length = 4;
	private int size = 0;
	private Object[] values;
	
	/**
	* Constructor for StackMain.
	* Setting default length value of stack.
	*/
	public StackMain()
	{
		values = new Object[length];
	}
	
	/**
	 * Get the current size of the stack object.
	 * 
	 * @return int Returns the current size of the stack.
	 */
	@Override
	public int size()
	{
		return size;
	}

	/**
	 * Get true or false if the stack object is empty.
	 * 
	 * @return boolean Returns true or false if empty.
	 */
	@Override
	public boolean isEmpty()
	{
		if (size == 0)
		{
			return true;
		}
		
		return false;
	}

	/**
	 * Pushing an Object element to the stack.
	 * 
	 * @param element Object element to push to the stack. 
	 */
	@Override
	public void push(Object element)
	{
		if (size == length || size == length - 1)
		{
			resize();
		}

		values[size++] = element;
	}

	/**
	 * Removes the top Object element of the stack.
	 * 
	 * @return Object Returns the Object element that was removed or null if empty.
	 */
	@Override
	public Object pop()
	{
		if (size != 0)
		{
			Object value = values[size - 1];
			size--;
				
			length = length - 1;
			Object[] tmp = new Object[length];
				
			for (int i = 0; i < size; i++)
			{
				tmp[i] = values[i];
			}
			values = tmp;

			return value;
		}
		else
		{
			throw new IllegalStateException("Can't pop an empty stack!");
		}
	}

	/**
	 * Get the last Object element in the stack.
	 * 
	 * @throws IllegalStateException
	 * @return Object Returns the Object element
	 */
	@Override
	public Object peek()
	{
		if (size != 0)
		{
			return values[size - 1];
		}
		else
		{
			throw new IllegalStateException("The stack is empty!");
		}
	}
	
	/**
	 * Creates an instance of StackIterator with the fields
	 * of the StackMain object.
	 * 
	 * @return StackIterator
	 */
	@Override
	public Iterator<Object> iterator()
	{
		if (size != 0)
		{
			return new StackIterator(values, size);
		}
		else
		{
			throw new IllegalStateException("Can't iterate through empty stack!");
		}
	}
	
	/**
	 * Resizes the Object array by multiplying the length
	 * with two.
	 */
	private void resize()
	{
		length = length * 2;
		Object[] tmp = new Object[length];
		
		for (int i = 0; i < size; i++)
		{
			tmp[i] = values[i];
		}
		
		values = tmp;
	}

	
}
