package view;

import java.util.Scanner;

import model.Person;

public class RegisterNewPersonScreen {

	Scanner sc = new Scanner(System.in);

	Person Person = new Person();

	public void newRegisterScreen() {
		
		System.out.println("New Register\nPlease, enter the first name: ");
		String firstName = sc.next();
		Person.setFirstName(firstName);
		
		System.out.println("\nPlease, enter e-mail address: ");
		String emailAddress = sc.next();
		Person.setEmailAdderss(emailAddress);
		
		System.out.println("\nPlease, enter the social security number: ");
		String socialSecNumber = sc.next();
		Person.setSocialSecNumber(socialSecNumber);
			
		String newRegisterMessage = """
				
				New personal information successfully registered
				
				Name: %s
				E-mail: %s
				Social Security Number: %s  
				
				
				"""
				.formatted(Person.getFirstName(), Person.getEmailAdderss(), Person.getEmailAdderss());
		
		System.out.println(newRegisterMessage); 
		}
}