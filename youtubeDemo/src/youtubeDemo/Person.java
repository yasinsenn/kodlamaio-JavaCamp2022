package youtubeDemo;

public class Person extends Customer {

	private String nationalIdentity;
	private String firstName;
	private String lastName;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String nationalIdentity, String firstName, String lastName) {
		super();
		this.nationalIdentity = nationalIdentity;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

}
