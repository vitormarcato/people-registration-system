package controller;

import java.sql.Connection;
import java.sql.SQLException;
import dao.ConnectDataBase;
import dao.PersonDAO;
import model.Person;
import view.SearchView;

public class SearchController {

	private SearchView searchView;

	public SearchController(SearchView searchView) {
		super();
		this.searchView = searchView;
	}
	
	public void searchPersonbySocialSecNumber() {
		
		Person person = new Person(searchView.getSocialSecNumber());
		
		try {
			Connection connection = new ConnectDataBase().getConnection();	
			PersonDAO searchPerson = new PersonDAO(connection);
			searchPerson.search(person);
			
			if(searchPerson.search(person) == true){
				System.out.println("\nPerson is already registered");			
			}else {
				System.out.println("\nThere is no record");
			}
			
		} catch (SQLException e) {
			e.getMessage();
		}
	}
}
