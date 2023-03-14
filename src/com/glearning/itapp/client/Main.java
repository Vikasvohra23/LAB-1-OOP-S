package com.glearning.itapp.client;

import java.util.Scanner;

import com.glearning.itapp.model.Employee;
import com.glearning.itapp.services.CredentialServiceImpl;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Vikas", "Vohra");
		employee.setCompany("Amazon");
		CredentialServiceImpl credentialServices = new CredentialServiceImpl();
		System.out.println("Please enter your Department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Support");
		System.out.println("3. Admin");
		System.out.println("4. HR");
		
		// Creating a instance scanner class
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch (option) {
		case 1: {
			String generatedEmail = credentialServices.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "Technical", employee.getCompany().toLowerCase());
			String generatedPassword = credentialServices.generateCredentials(12);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			employee.setDepartment("Technical");
			credentialServices.displayCredentials(employee);
			break;
		}
		case 2: {
			String generatedEmail = credentialServices.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"Support", employee.getCompany().toLowerCase());
			String generatedPassword = credentialServices.generateCredentials(12);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			employee.setDepartment("Support");
			credentialServices.displayCredentials(employee);
			break;
		}
		case 3: {
			String generatedEmail = credentialServices.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "Admin", employee.getCompany().toLowerCase());
			String generatedPassword = credentialServices.generateCredentials(12);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			employee.setDepartment("Admin");
			credentialServices.displayCredentials(employee);
			break;
		}
		case 4: {
			String generatedEmail = credentialServices.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "HR", employee.getCompany().toLowerCase());
			String generatedPassword = credentialServices.generateCredentials(12);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			employee.setDepartment("HR");
			credentialServices.displayCredentials(employee);
			break;
		}
		default: {
			System.out.println("Enter a valid option");
		
	}

}}}
	
