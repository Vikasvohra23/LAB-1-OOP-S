package com.glearning.itapp.services;

import java.util.Random;

import com.glearning.itapp.model.Employee;

public class CredentialServiceImpl implements CredentialServices  {

	@Override
	public String generateEmailAddress(String firstName, String lastName, String departmentName, String company) {
		String generatedEmail= firstName + lastName +  "@" + departmentName + "." + company + ".com";
		
			return generatedEmail;
	}
	
	private static final String UPPER_CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWER_CHAR = "abcdefghijklmnopqrstuvwxyz";
	private static final String SPECIAL_CHARS = "!@#$%^&*";
	private static final String NUMBERS = "0123456789";
	private static final String PASSWORD_FORMAT = UPPER_CHAR + LOWER_CHAR + SPECIAL_CHARS + NUMBERS;
	private static final Random random = new Random();
	

	@Override
	public String generateCredentials(int maxLength) {
		StringBuilder passwordBuilder = new StringBuilder(maxLength);
		// for at-least one Lower case 
		passwordBuilder.append(LOWER_CHAR.charAt(random.nextInt(LOWER_CHAR.length())));
		
		// for at-least one Upper case 
		passwordBuilder.append(UPPER_CHAR.charAt(random.nextInt(UPPER_CHAR.length())));
		
		// for at-least one Special character 
		passwordBuilder.append(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));
		
		// for at-least one Number 
		passwordBuilder.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
		
		// for rest of the password to fill random characters 
		for (int i = 4; i < maxLength; i++) {
			passwordBuilder.append(PASSWORD_FORMAT.charAt(random.nextInt(PASSWORD_FORMAT.length())));
			
		}
		
		// for shuffling the characters in the password
		char[] passwordChars = passwordBuilder.toString().toCharArray();
		for (int i = 0; i < passwordChars.length; i++) {
			// to get a random char from array
			int j = random.nextInt(passwordChars.length);
			
			// to store that char in random temporary char variable
			char temp = passwordChars[j];
			
			// assigning the random char to i variable of the array
			passwordChars[i] = passwordChars[j];
			
			// assigning the temporary char to j variable;
			passwordChars[j] = temp;
			
			return new String(passwordChars);
					
		}
		return null;
	}

	@Override
	public void displayCredentials(Employee employee) {
		System.out.println("Dear "+ employee.getFirstName() + " Welcome to " + employee.getDepartment() + " Department your credentials are as follows ");
		System.out.println("Email\t\t" + employee.getEmailAddress());
		System.out.println("Password\t" + employee.getPassword());
		
	}

}
