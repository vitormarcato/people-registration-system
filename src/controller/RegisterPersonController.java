package controller;

import java.sql.Connection;
import java.sql.SQLException;
import dao.ConnectDataBase;
import dao.PersonDAO;
import model.Person;
import view.RegisterPersonView;

public class RegisterPersonController {
	
	private RegisterPersonView viewNewRegister;
	
	public RegisterPersonController(RegisterPersonView viewNewRegister) {
		this.viewNewRegister = viewNewRegister;
	}

	public void createNewPersonRegister() {
	
		Person person = new Person(viewNewRegister.getFirstName(), viewNewRegister.getEmailAddress(), viewNewRegister.getSocialSecNumber());
		
		try {
			Connection connection = new ConnectDataBase().getConnection();
			PersonDAO createNewPersonRegister = new PersonDAO(connection);
			createNewPersonRegister.createNewRegister(person);
			System.out.println(viewNewRegister.getNewRegisterMessage());
		
		} catch (SQLException e) {
			e.getMessage();
		}
	}
	
}

