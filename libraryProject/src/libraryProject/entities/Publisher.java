package libraryProject.entities;

import java.util.List;

public class Publisher {
	private int id;
	private String name;
	private Address address;
	List<Book> books;
	public Publisher() {
		super();
	}
	public Publisher(int id, String name, Address address, List<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.books = books;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	

}
