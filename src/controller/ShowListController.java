package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.ConnectDataBase;
import dao.PersonDAO;
import model.Person;
import view.ShowListView;

public class ShowListController {

	private ShowListView listView;

	public ShowListController (ShowListView listView) {
		this.listView = listView;
	}

	public void showList() {

		try {
			Connection connection = new ConnectDataBase().getConnection();
			PersonDAO selectAll = new PersonDAO(connection);
			selectAll.selectAll();
			
			ArrayList<Person> listRegistration = selectAll.selectAll();
			for (Person person : listRegistration) {
				System.out.print(" "+person.getId()+" ");
				System.out.print(" "+person.getFirstName()+" ");
				System.out.print(" "+person.getEmailAddress()+" ");
				System.out.print(" "+person.getSocialSecNumber()+"; ");
			}
					
		} catch (SQLException e) {
			e.getMessage();
		}

	}

	public ShowListView getListView() {
		return listView;
	}

}
