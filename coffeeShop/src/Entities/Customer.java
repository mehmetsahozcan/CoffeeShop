package Entities;

import Abstract.IEntity;

public class Customer implements IEntity  {
	private int id;
	private String FirstName;
	private String LastName;
	private int  BirthDate;
	private String nationalIdentity;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, int birthDate, String nationalIdentity) {
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		BirthDate = birthDate;
		this.nationalIdentity = nationalIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(int birthDate) {
		BirthDate = birthDate;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
}
