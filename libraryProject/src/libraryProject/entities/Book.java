package libraryProject.entities;

import java.time.LocalDate;
import java.util.List;

public class Book {
	private int id;
	private Publisher publisher;
	private String isbn;
	private String name;
	private LocalDate releaseDate;
	private int numberOfPages;
	private State state;
	List<BookCategory> bookCategories;
	List<BookAuthor> bookAuthors;
	List<Library> libraries;
	public Book() {
		super();
	}
	public Book(int id, Publisher publisher, String isbn, String name, LocalDate releaseDate, int numberOfPages,
			State state, List<BookCategory> bookCategories, List<BookAuthor> bookAuthors, List<Library> libraries) {
		super();
		this.id = id;
		this.publisher = publisher;
		this.isbn = isbn;
		this.name = name;
		this.releaseDate = releaseDate;
		this.numberOfPages = numberOfPages;
		this.state = state;
		this.bookCategories = bookCategories;
		this.bookAuthors = bookAuthors;
		this.libraries = libraries;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public List<BookCategory> getBookCategories() {
		return bookCategories;
	}
	public void setBookCategories(List<BookCategory> bookCategories) {
		this.bookCategories = bookCategories;
	}
	public List<BookAuthor> getBookAuthors() {
		return bookAuthors;
	}
	public void setBookAuthors(List<BookAuthor> bookAuthors) {
		this.bookAuthors = bookAuthors;
	}
	public List<Library> getLibraries() {
		return libraries;
	}
	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}
	

	

}
