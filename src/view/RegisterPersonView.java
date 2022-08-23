package view;

import java.util.Scanner;
import controller.RegisterPersonController;

public class RegisterPersonView {

	private String firstName;
	private String emailAddress;
	private String socialSecNumber;
	private String newRegisterMessage;
	protected RegisterPersonController controller;

	public RegisterPersonView() {
		controller = new RegisterPersonController(this);
	}

	Scanner sc = new Scanner(System.in);

	public void printRegisterView() {

		System.out.println("New Register\nPlease, enter the first name: ");
		firstName = sc.next();

		System.out.println("\nPlease, enter e-mail address: ");
		emailAddress = sc.next();

		System.out.println("\nPlease, enter the social security number: ");
		socialSecNumber = sc.next();

		newRegisterMessage = """

				New personal information successfully registered

				Name: %s
				E-mail: %s
				Social Security Number: %s


				""".formatted(firstName, emailAddress, socialSecNumber);

		controller.createNewPersonRegister();
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

	public String getNewRegisterMessage() {
		return newRegisterMessage;
	}

}
