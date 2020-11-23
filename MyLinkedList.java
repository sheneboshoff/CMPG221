public class MyLinkedList<E>
{
	private Node<E> head, tail;
	
	public MyLinkedList()
	{
		head = null;
		tail = null;
	}
	
	public E getFirst()
	{
		if (head == null)
			return null;
		else
			return head.element;
	}
	
	public void prepend(E e)
	{
		Node<E> newNode = new Node<>(e);
		newNode.next = head;
		head = newNode;
		
		if (tail == null)
			tail = head;
	}
	
	public void append(E item)
	{
		Node<E> newNode = new Node<>(item);
		if (head == null)
			head = tail = newNode;
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public boolean delete(E item)
	{
		Node<E> ptr = head;
		Node<E> prvPtr = null;
		
		while (ptr != null && ((Comparable)ptr.element).compareTo(item) != 0)
		{
			prvPtr = ptr;
			ptr = ptr.next;
		}
		
		if (ptr == null)
			return false;
		if (ptr == head)
			head = head.next;
		else
			prvPtr.next = ptr.next;
		if (ptr == tail)
			tail = prvPtr;
		return true;
	}
	
	public String toString()
	{
		String result = "[";
		
		Node <E> ptr = head;
		for (ptr = head; ptr != null; ptr = ptr.next)
		{
			result = result + ptr.element.toString();
			if (ptr.next != null)
				result = result + ",";
		}
		result += "]";
		return result;
	}
	
	public void clear()
	{
		head = tail = null;
	}
	
	private static class Node<E>
	{
		E element;
		Node<E> next;
		
		public Node(E element)
		{
			this.element = element;
			next = null;
		}
	}
	
	public MyLinkedList Filter(String filterBy)
	{		
		Node<E> ptr = this.head;
		
		StackAsMyLinkedList<E> filteredStack = new StackAsMyLinkedList<E>();
		MyLinkedList<E> sortedList = new MyLinkedList<E>();
		
		while (ptr != null)
		{
			if (((Comparable)ptr.element).compareTo(filterBy) == 0)
				filteredStack.push(ptr.element);
			ptr = ptr.next;
		}
		
		bubbleSort(filteredStack);
		
		E top = null;
		top = filteredStack.pop();
		while (top != null)
		{
			top = filteredStack.pop();
			sortedList.append(top);
		}
		
		return sortedList;
	}
	
	public void bubbleSort(StackAsMyLinkedList<E> list)
	{
		Node<E> ptr = this.head;
		ptr = ptr.next;
		Node<E> ptr2 = this.head;
			
		boolean needNextPass = true;
		
		for (; ptr != null && needNextPass; ptr = ptr.next)
		{
			needNextPass = false;
			for (; ptr2 != BeforeLast(this); ptr2 = ptr2.next)
			{
				if (((Comparable)ptr2.element).compareTo(ptr2.next.element) > 0)
				{
					Node<E> temp = ptr2;
					ptr2 = ptr2.next;
					ptr2.next = temp;
					
					needNextPass = true;
				}
			}
		}
	}
	
	public Node<E> BeforeLast(MyLinkedList<E> list)
	{
		Node<E> ptrBeforeLast = list.head;
		
		if (ptrBeforeLast == null)
			return null;
		
		while (ptrBeforeLast.next.next != null)
			ptrBeforeLast = ptrBeforeLast.next;
		
		return ptrBeforeLast;
	}
}
































