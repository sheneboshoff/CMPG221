public class StackAsMyLinkedList<E>
{
	MyLinkedList<E> theStack;
	
	public StackAsMyLinkedList()
	{
		theStack = new MyLinkedList<E>();
	}
	
	public void push(E newElement)
	{
		theStack.prepend(newElement);
	}
	
	public E pop()
	{
		E temp = null;
		boolean isDone = false;
		
		temp = theStack.getFirst();
		if (temp != null)
			isDone = theStack.delete(temp);
		
		if (isDone)
			return temp;
		else
			return null;
	}
	
	public String toString()
	{
		return theStack.toString();
	}
}