package libraryProject.entities;

import java.util.List;

public class Member extends User{
	private Address address;
	private String email;
	private String identityNumber;
	private String phoneNumber;
	List<LibraryMember> libraryMembers;
	public Member() {
		super();
	}
	public Member(int id, String firstName, String lastName,Address address, String email, String identityNumber, String phoneNumber,
			List<LibraryMember> libraryMembers) {
		super(id,firstName,lastName);
		this.address = address;
		this.email = email;
		this.identityNumber = identityNumber;
		this.phoneNumber = phoneNumber;
		this.libraryMembers = libraryMembers;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<LibraryMember> getLibraryMembers() {
		return libraryMembers;
	}
	public void setLibraryMembers(List<LibraryMember> libraryMembers) {
		this.libraryMembers = libraryMembers;
	}
	
	


}
