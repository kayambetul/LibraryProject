package libraryProject.entities;

public class BookCategory {
	private int id;
	private Book book;
	private Category category;
	public BookCategory() {
		super();
	}
	public BookCategory(int id, Book book, Category category) {
		super();
		this.id = id;
		this.book = book;
		this.category = category;
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
