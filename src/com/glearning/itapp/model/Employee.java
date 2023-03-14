package com.glearning.itapp.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String department;
	private String company;
	private String password;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		
	}
	
	public Employee(String frstName, String lastName, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String lastName) {
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return "Employee [firstName= "+ firstName +", lastName= " + lastName +", emailAddress= "+ emailAddress +", department= "+ department +", "
				         + "company= "+ company +", password= "+ password +"]";
		
	}
	
	
	

}
