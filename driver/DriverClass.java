package com.gl.driver;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;



public class DriverClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan1 = new Scanner(System.in);
	
	System.out.println("----------------Main Menu-------------------------");
	System.out.println("1. Techinal Department");
	System.out.println("2. Legal Department");
	System.out.println("3. Human Resources Department");
	System.out.println("4. Legal Department");
	
	Employee employee1 = new Employee("Harsha", "Gupta");
	
	
	CredentialService cService = new CredentialService();
	
	int choice;
	
	
	
	
	System.out.println("please select your option 1-4");
	choice = scan1.nextInt();
	String generatedEmail;
	char[] generatedPassword;
	if (choice == 1)
    {	

	generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"tech");
	generatedPassword = cService.generatePassword();
	cService.displayCredentials(employee1, generatedEmail, generatedPassword);
    }		
	else if (choice == 2)
		
    {
	generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"Admin");
	generatedPassword = cService.generatePassword();
	cService.displayCredentials(employee1, generatedEmail, generatedPassword);	
}
			
	else if (choice == 3)
		
{
	generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"HR");
	generatedPassword = cService.generatePassword();
	cService.displayCredentials(employee1, generatedEmail, generatedPassword);	
}
			
	else if (choice == 4)
	
{
	generatedEmail = cService.generateEmail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"Legal");
	generatedPassword = cService.generatePassword();
	cService.displayCredentials(employee1, generatedEmail, generatedPassword);	
}

else 
	System.out.println("Range is 1-4");
			
}
	{	
		}	
	}
	
	
	


		
	

	
	

	
	
	
	


	
	
	
	
	

	

	
	

	
	
	
	

	
	
	
	
				
			
	


