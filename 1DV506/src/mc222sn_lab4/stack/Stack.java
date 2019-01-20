package mc222sn_lab4.stack;

import java.util.Iterator;

/**
 * The Stack interface.
 *
 * @version 1.0
 * @author Marcus Cvjeticanin
 */
public interface Stack
{
	int size();
	boolean isEmpty();
	void push(Object element);
	Object pop();
	Object peek();
	Iterator<Object> iterator();
}
