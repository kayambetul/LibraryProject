package libraryProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import libraryProject.entities.Address;
import libraryProject.entities.Author;
import libraryProject.entities.Book;
import libraryProject.entities.BookAuthor;
import libraryProject.entities.BookCategory;
import libraryProject.entities.Category;
import libraryProject.entities.Library;
import libraryProject.entities.LibraryMember;
import libraryProject.entities.Member;
import libraryProject.entities.Publisher;
import libraryProject.entities.State;

public class Main {

	public static void main(String[] args) {
		List<Library> libraries=new ArrayList<Library>();
		List<Member> members=new  ArrayList<Member>();
		List<Publisher> publishers=new ArrayList<Publisher>();
		List<LibraryMember> libraryMembers=new ArrayList<LibraryMember>();
		List<BookAuthor> bookAuthors=new ArrayList<BookAuthor>();
		List<BookCategory> bookCategories=new ArrayList<BookCategory>();
		List<Book> books=new ArrayList<Book>();
		
		
		Address address=new Address(1, "Emek sok", "Sare cad","Ali mah", "16", "Iğdır",
				"76000", libraries,  members, publishers);
		Publisher publisher=new Publisher(1, "Betul ", address, books);
		publishers.add(publisher);
		State state=new State(1, "Musait",  books);
		Book book=new Book(1, publisher, "12345", "Kader", LocalDate.parse("2022-08-01"), 25,
				 state, bookCategories, bookAuthors,  libraries);
		books.add(book);
		Library library=new Library(1, "Burcu", address,book,  libraryMembers);
		libraries.add(library);
		Member member=new Member(1, "Kadir", "Demirel", address, "kadir@gmail.com", "1234567890", "05426263535",
				libraryMembers);
		members.add(member);
		Category category=new Category(1, "Polisiye", bookCategories);
		BookCategory bookCategory=new BookCategory(1,  book,  category);
		bookCategories.add(bookCategory);
		Author author=new Author(1, "Ahmet", "Ümit", bookAuthors);
		BookAuthor bookAuthor=new BookAuthor(1, book, author);
		bookAuthors.add(bookAuthor);
		LibraryMember libraryMember=new LibraryMember(1, library,  member);
		libraryMembers.add(libraryMember);
		
		System.out.println(author.getBookAuthors().get(0).getBook().getLibraries().get(0).getLibraryMembers().get(0).getMember().getAddress().getApartmentNo());
		System.out.println(author.getBookAuthors().get(0).getBook().getState().getName());
		System.out.println(author.getBookAuthors().get(0).getBook().getLibraries().get(0).getAddress().getPublishers().get(0).getBooks().get(0).getName());
		System.out.println(author.getBookAuthors().get(0).getBook().getLibraries().get(0).getAddress().getPublishers().get(0).getBooks().get(0).getBookAuthors().get(0).getAuthor().getFirstName());
	
		

	}

}
