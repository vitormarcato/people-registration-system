package view;

import java.util.Scanner;
import controller.UpdateController;

public class UpdateInformationView {
	private String firstName;
	private String emailAddress;
	private String socialSecNumber;
	private String updateMessage;
	protected UpdateController controller;
	

	public UpdateInformationView() {
		controller = new UpdateController(this);
	}

	Scanner sc = new Scanner(System.in);
	
	public void printUpdateInformation() {
		System.out.println("\nPlease, enter the correct first name: ");
		firstName = sc.next();

		System.out.println("\nPlease, enter the correct e-mail address: ");
		emailAddress = sc.next();

		System.out.println("\nPlease, enter the correct social security number: ");
		socialSecNumber = sc.next();

		updateMessage = """
				
				The personal information were update to
				
				Name: %s
				E-mail: %s
				Social Security Number: %s

				
				""".formatted(firstName, emailAddress, socialSecNumber);
		
		controller.updateInformation();
	}

	public String getFirstName() {
		return firstName;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public String getSocialSecNumber() {
		return socialSecNumber;
	}


	public String getUpdateMessage() {
		return updateMessage;
	}

	
	
}
