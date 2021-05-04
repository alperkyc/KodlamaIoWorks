package Entities;

import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{
	public int Id;
	public String FirstName;
	public String LastName;
	public int DateOfBirthDayYear;
	public String NationalityId;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
	public int getDateOfBirthDayYear() {
		return DateOfBirthDayYear;
	}
	public void setDateOfBirthDayYear(int dateOfBirthDayYear) {
		DateOfBirthDayYear = dateOfBirthDayYear;
	}
	
	
	

}
