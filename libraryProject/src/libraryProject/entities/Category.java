package libraryProject.entities;

import java.util.List;

public class Category {
	private int id;
	private String name;
	List<BookCategory> bookCategories;
	public Category() {
		super();
	}
	public Category(int id, String name, List<BookCategory> bookCategories) {
		super();
		this.id = id;
		this.name = name;
		this.bookCategories = bookCategories;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<BookCategory> getBookCategories() {
		return bookCategories;
	}
	public void setBookCategories(List<BookCategory> bookCategories) {
		this.bookCategories = bookCategories;
	}
	
	
	

}
