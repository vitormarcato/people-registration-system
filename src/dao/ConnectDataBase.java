package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDataBase {
	
	public Connection getConnection() throws SQLException {
		Connection connectionSql = DriverManager.getConnection("jdbc:postgresql://localhost:5432/peopleregister", "postgres", "postgres");
		return connectionSql;
	}
	
}
