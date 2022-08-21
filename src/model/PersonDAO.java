package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import view.RegisterNewPerson;

public class PersonDAO {
	
	public void createNewRegister() {
		
		RegisterNewPerson newTableRegister = new RegisterNewPerson();
		newTableRegister.newRegister();
		
		
		try {
			Connection connectionSql = new ConnectDataBase().getConnection();
			
			String sql = "INSERT INTO person (name, emailaddress, socialsecnumber) VALUES ('%s','zaca@email.com','999999999');".formatted(Person.get); 
			
			PreparedStatement insertStatement = connectionSql.prepareStatement(sql);
			insertStatement.execute();
			
			connectionSql.close();
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
}
