import java.util.*;

public class TestProgram
{
	public static void main(String[] args)
	{
		MyLinkedList<Book> list1 = new MyLinkedList<Book>();
		
		list1.append(new Book("The Hunger Games", "Suzanne Collins", "Fiction", 2008));
		list1.append(new Book("Harry Potter", "J.K. Rowling", "Fantasy", 1997));
		list1.append(new Book("The Fault in Our Stars", "John Green", "Young Adult", 2012));
		list1.append(new Book("Percy Jackson", "Rick Riordan", "Fantasy", 2005));
		list1.append(new Book("The Diary of a Young Girl", "Anne Frank", "Bibliography", 1947));
		list1.append(new Book("The Testaments", "Margaret Atwood", "Fiction", 2019));
		list1.append(new Book("The Silent Patient", "Alex Michealides", "Mystery", 2019));
		list1.append(new Book("Daisy Jones And The Six", "Taylor Jenkins Reid", "Fiction", 2019));
		list1.append(new Book("Institute", "Stephen King", "Horror", 2019));
		list1.append(new Book("Recursion", "Blake Crouch", "Fiction", 2019));
		
		System.out.println(list1);

		MyLinkedList sortedList = list1.Filter("Fiction");
		
		System.out.println(sortedList);
	}
}