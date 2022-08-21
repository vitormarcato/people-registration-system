package view;

import java.util.Scanner;

import model.Person;

public class RegisterNewPerson {

	Scanner sc = new Scanner(System.in);

	Person Person = new Person();

	public void newRegister() {
		
		System.out.println("New Register\nPlease, enter the first name: ");
		String firstName = sc.next();
		Person.setFirstName(firstName);
		
		System.out.println("\nPlease, enter e-mail address: ");
		String emailAddress = sc.next();
		Person.setEmailAddress(emailAddress);
		
		System.out.println("\nPlease, enter the social security number: ");
		String socialSecNumber = sc.next();
		Person.setSocialSecNumber(socialSecNumber);
			
		String newRegisterMessage = """
				
				New personal information successfully registered
				
				Name: %s
				E-mail: %s
				Social Security Number: %s  
				
				
				"""
				.formatted(Person.getFirstName(), Person.getEmailAddress(), Person.getEmailAddress());
		
		System.out.println(newRegisterMessage); 
		}
}