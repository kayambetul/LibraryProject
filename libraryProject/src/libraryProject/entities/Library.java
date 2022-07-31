package libraryProject.entities;

import java.util.List;

public class Library {
	private int id;
	private String name;
	private Address address;
	private Book book;
	List<LibraryMember> libraryMembers;
	public Library() {
		super();
	}
	public Library(int id, String name, Address address, Book book, List<LibraryMember> libraryMembers) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.book = book;
		this.libraryMembers = libraryMembers;
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
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public List<LibraryMember> getLibraryMembers() {
		return libraryMembers;
	}
	public void setLibraryMembers(List<LibraryMember> libraryMembers) {
		this.libraryMembers = libraryMembers;
	}
	

	

}
