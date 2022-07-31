package libraryProject.entities;

public class LibraryMember {

	private int id;
	private Library library;
	private Member member;
	public LibraryMember() {
		super();
	}
	public LibraryMember(int id, Library library, Member member) {
		super();
		this.id = id;
		this.library = library;
		this.member = member;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	
}
