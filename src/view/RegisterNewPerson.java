package view;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import dao.ConnectDataBase;
import dao.PersonDAO;
import model.Person;

public class RegisterNewPerson {

	Scanner sc = new Scanner(System.in);

	public void newRegister() {

		System.out.println("New Register\nPlease, enter the first name: ");
		String firstName = sc.next();

		System.out.println("\nPlease, enter e-mail address: ");
		String emailAddress = sc.next();

		System.out.println("\nPlease, enter the social security number: ");
		String socialSecNumber = sc.next();

		Person person = new Person(firstName, emailAddress, socialSecNumber);
		person.setFirstName(firstName);
		person.setEmailAddress(emailAddress);
		person.setSocialSecNumber(socialSecNumber);

		String newRegisterMessage = """

				New personal information successfully registered

				Name: %s
				E-mail: %s
				Social Security Number: %s


				""".formatted(person.getFirstName(), person.getEmailAddress(), person.getEmailAddress());

		try {
			Connection connection = new ConnectDataBase().getConnection();
			PersonDAO createNewPersonRegister = new PersonDAO(connection);
			createNewPersonRegister.createNewRegister(person);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println(newRegisterMessage);
	}
}