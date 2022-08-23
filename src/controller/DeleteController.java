package controller;

import java.sql.Connection;
import java.sql.SQLException;
import dao.ConnectDataBase;
import dao.PersonDAO;
import model.Person;
import view.DeleteView;

public class DeleteController {

	private DeleteView viewDelete;

	public DeleteController(DeleteView viewDelete) {
		this.viewDelete = viewDelete;
	}

	public void deleteInformation() {

		Person delete = new Person(viewDelete.getSocialSecNumber());

		try {
			Connection connection = new ConnectDataBase().getConnection();
			PersonDAO deleteRegister = new PersonDAO(connection);
			deleteRegister.deleteRegister(delete);
			System.out.println(viewDelete.getDeleteMessage());

		} catch (SQLException e) {
			e.getMessage();
		}

	}

}
