package libraryProject.entities;

public class BookAuthor {
	private int id;
	private Book book;
	private Author author;
	public BookAuthor() {
		super();
	}
	public BookAuthor(int id, Book book, Author author) {
		super();
		this.id = id;
		this.book = book;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	

}
