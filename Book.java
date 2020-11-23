public class Book implements Comparable
{
	private String title, author, genre;
	private int published;
	
	public Book() {}
	
	public Book(String title, String author, String genre, int published)
	{
		setTitle(title);
		setAuthor(author);
		setGenre(genre);
		setPublished(published);
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public int getPublished()
	{
		return published;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	
	public void setPublished(int published)
	{
		this.published = published;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String toString()
	{
		return (getTitle() + " " + getAuthor() + " " + getGenre() + " " + getPublished());
	}
	
	public int compareTo(Object g)
	{
		if (this.getClass().equals(g.getClass()))
		{
			Book b = (Book)g;
			if (this.getGenre().equals(b.getGenre()))
				return 0;
			else
				return 1;
		}
		else
			return this.getClass().getTitle().compareTo(g.getClass().getTitle());
	}
}