package com.glearning.itapp.services;

import com.glearning.itapp.model.Employee;


public interface CredentialServices {
	public String generateEmailAddress(String firstName, String lastName, String departmentName, String company);
	public String generateCredentials(int maxLength);
	public void displayCredentials(Employee employee);
	

}
