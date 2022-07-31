package libraryProject.entities;

import java.util.List;

public class Author extends User{
	List<BookAuthor> bookAuthors;

	public Author() {
		super();
	}

	public Author(int id, String firstName, String lastName,List<BookAuthor> bookAuthors) {
		super(id,firstName,lastName);
		this.bookAuthors = bookAuthors;
	}

	public List<BookAuthor> getBookAuthors() {
		return bookAuthors;
	}

	public void setBookAuthors(List<BookAuthor> bookAuthors) {
		this.bookAuthors = bookAuthors;
	}
	
	

}
