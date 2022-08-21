package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Person;

public class PersonDAO {

	private Connection connectionSql;
	
	public PersonDAO(Connection connectionSql) {
		super();
		this.connectionSql = connectionSql;
	}

	public void createNewRegister(Person newTableRegister) throws SQLException {

			String sql = "INSERT INTO person (name, emailaddress, socialsecnumber) VALUES ('%s','%s','%s');".formatted(newTableRegister.getFirstName(), newTableRegister.getEmailAddress(), newTableRegister.getSocialSecNumber());	
			PreparedStatement insertStatement = connectionSql.prepareStatement(sql);
			insertStatement.execute();
			 
			connectionSql.close(); 
	}
	
}
