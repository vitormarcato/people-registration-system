package model;

public class Person {

	private int id;
	private String firstName;
	private String emailAddress;
	private String socialSecNumber;

	public Person(int id, String firstName, String emailAddress, String socialSecNumber) {
		this.id = id;
		this.firstName = firstName;
		this.emailAddress = emailAddress;
		this.socialSecNumber = socialSecNumber;
	}

	
	public Person(String firstName, String emailAddress, String socialSecNumber) {
		super();
		this.firstName = firstName;
		this.emailAddress = emailAddress;
		this.socialSecNumber = socialSecNumber;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSocialSecNumber() {
		return socialSecNumber;
	}

	public void setSocialSecNumber(String socialSecNumber) {
		this.socialSecNumber = socialSecNumber;
	}

}
