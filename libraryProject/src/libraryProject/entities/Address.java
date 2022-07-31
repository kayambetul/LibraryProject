package libraryProject.entities;

import java.util.List;

public class Address {

	private int id;
	private String street;
	private String road;
	private String neighbourhood;
	private String apartmentNo;
	private String province;
	private String postCode;
	List<Library> libraries;
	List<Member> members;
	List<Publisher> publishers;
	
	public Address() {
		super();
	}

	public Address(int id, String street, String road, String neighbourhood, String apartmentNo, String province,
			String postCode, List<Library> libraries, List<Member> members, List<Publisher> publishers) {
		super();
		this.id = id;
		this.street = street;
		this.road = road;
		this.neighbourhood = neighbourhood;
		this.apartmentNo = apartmentNo;
		this.province = province;
		this.postCode = postCode;
		this.libraries = libraries;
		this.members = members;
		this.publishers = publishers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getNeighbourhood() {
		return neighbourhood;
	}

	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

	public String getApartmentNo() {
		return apartmentNo;
	}

	public void setApartmentNo(String apartmentNo) {
		this.apartmentNo = apartmentNo;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public List<Library> getLibraries() {
		return libraries;
	}

	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public List<Publisher> getPublishers() {
		return publishers;
	}

	public void setPublishers(List<Publisher> publishers) {
		this.publishers = publishers;
	}
	
	
	

}
