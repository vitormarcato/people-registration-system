package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.ConnectDataBase;
import view.RegisterNewPerson;

public class ConnectionTest {
	
	public static void main (String args[]) {
	
	try {
		Connection connectionSql = new ConnectDataBase().getConnection();
		
		String sql = "INSERT INTO person (name, emailaddress, socialsecnumber) VALUES ('zacarias','zaca@email.com','999999999');"; 
		
		PreparedStatement insertStatement = connectionSql.prepareStatement(sql);
		insertStatement.execute();
		
		connectionSql.close();
	
	
	} catch (SQLException e) {
		e.printStackTrace();
	}

		
		RegisterNewPerson teste = new RegisterNewPerson();
		teste.newRegister();
}
}
