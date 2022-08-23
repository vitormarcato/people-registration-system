package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Person;

public class PersonDAO {

	private Connection connectionSql;

	public PersonDAO(Connection connectionSql) {
		super();
		this.connectionSql = connectionSql;
	}

	public void createNewRegister(Person newTableRegister) throws SQLException {

		String sql = "INSERT INTO person (name, emailaddress, socialsecnumber) VALUES ('%s','%s','%s');".formatted(
				newTableRegister.getFirstName(), newTableRegister.getEmailAddress(),
				newTableRegister.getSocialSecNumber());
		PreparedStatement insertStatement = connectionSql.prepareStatement(sql);
		insertStatement.execute();
	} 
	   

	public boolean search(Person search) throws SQLException {
		String searchSql = "SELECT * FROM person WHERE socialsecnumber = '%s';".formatted(search.getSocialSecNumber());
		PreparedStatement selectStatement = connectionSql.prepareStatement(searchSql);
		selectStatement.execute();

		ResultSet result = selectStatement.getResultSet();
		return result.next();
	}

	public void updateRegister(Person update) throws SQLException {
		String sqlUpdate = "UPDATE person SET name = '%s', emailaddress = '%s' WHERE socialsecnumber = '%s';"
				.formatted(update.getFirstName(), update.getEmailAddress(), update.getSocialSecNumber());
		PreparedStatement updateStatement = connectionSql.prepareStatement(sqlUpdate);
		updateStatement.execute();
	}

	public void deleteRegister(Person delete) throws SQLException {
		String sqlDelete = "DELETE FROM person WHERE socialsecnumber = '%s';"
				.formatted(delete.getSocialSecNumber());
		PreparedStatement deleteStatement = connectionSql.prepareStatement(sqlDelete);
		deleteStatement.execute();
		
	}

	public ArrayList<Person> selectAll() throws SQLException{
	String sqlList = "SELECT * FROM person;";
	PreparedStatement listStatement = connectionSql.prepareStatement(sqlList);
	ArrayList<Person> person = new ArrayList<Person>();
	listStatement.execute();
	ResultSet resultSet = listStatement.getResultSet();
	
	while (resultSet.next()) {
		int id = resultSet.getInt("id");
		String firstName = resultSet.getString("name");
		String emailAddress = resultSet.getString("emailaddress");
		String socialSecNumber = resultSet.getString("socialsecnumber");
		
		Person personalInformation = new Person(id, firstName, emailAddress, socialSecNumber);
		person.add(personalInformation);
	}
	
	return person;
	
	}

}
