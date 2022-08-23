package controller;

import java.sql.Connection;
import java.sql.SQLException;

import dao.ConnectDataBase;
import dao.PersonDAO;
import model.Person;

import view.UpdateInformationView;

public class UpdateController {

	private UpdateInformationView viewUpdate;

	public UpdateController(UpdateInformationView viewUpdate) {
		this.viewUpdate = viewUpdate;
	}

	public void updateInformation() {

		Person update = new Person(viewUpdate.getFirstName(), viewUpdate.getEmailAddress(),
				viewUpdate.getSocialSecNumber());

		try {
			Connection connection = new ConnectDataBase().getConnection();
			PersonDAO updateRegister = new PersonDAO(connection);
			updateRegister.updateRegister(update);
			System.out.println(viewUpdate.getUpdateMessage());

		} catch (SQLException e) {
			e.getMessage();
		}
	}
}
