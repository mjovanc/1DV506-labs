package mc222sn_lab4.stack;

import java.util.Iterator;

/**
 * The StackIterator class.
 *
 * @version 1.0
 * @implements Iterator
 * @author Marcus Cvjeticanin
 */
public class StackIterator implements Iterator<Object>
{
	private int nextElement = 0;
	private final Object[] elements;
	private final int max;

	/**
	* Constructor for StackIterator.
	* 
	* @param items Takes an Object array as parameter.
	* @param size Takes int size as parameter.
	*/
	public StackIterator(Object[] items, int size)
	{        
		elements = items;
		max = size;
	}
	
	/**
	 * Get boolean value if there's more elements in the Object array.
	 * 
	 * @return boolean Returns true or false if there's more elements.
	 */
	public boolean hasNext()
	{
		return nextElement < max;
	}

	/**
	 * Get the next Object element.
	 * 
	 * @return Object Returns the next Object element.
	 */
	public Object next()
	{
		return elements[nextElement++];
	}
}
