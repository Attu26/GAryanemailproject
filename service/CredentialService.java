package com.gl.service;

import java.util.Random;

import com.gl.model.Employee;

public class CredentialService {
		


	
public char[] generatePassword()

{
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&_=-/.?<>)";
	
	//ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"!@#$%^&_=-/.?<>)"
	
	//my password = Adhwy893
	
	
	String myData = capitalLetters + smallLetters + numbers + specialCharacters;
	
	char[] password = new char[8];
	Random random = new Random();
	for (int i=0; i<8;i++)
		
	{
		password[i] = myData.charAt(random.nextInt(myData.length()));
		
	}
	
	return password;						
}

// Harsha Gupta tech ---- harshgupta.tech@abc.com



public String generateEmail (String firstName, String lastName, String department)

{
	String generatedEmail;
	generatedEmail = firstName+lastName+"."+department+"@abc.com";
	return generatedEmail;
	
}	
public void displayCredentials(Employee employee,String eMailGen, char[] genPsswd)


{

System.out.println("HI "+employee.getFirstName());
System.out.println("Your email is"+eMailGen);
System.out.println("Your password is"+genPsswd);

	
}

}
