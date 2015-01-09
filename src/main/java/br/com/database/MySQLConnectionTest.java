package br.com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionTest {
	public void connect() {
		String dbURL = "jdbc:mysql://admanager.bd.srv.intranet/test";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = "SELECT * FROM ad_manager_adm.action_type";
		String username = "qa";
	    String password = "";	
		try {
			Class.forName(dbClass);
	        Connection connection = DriverManager.getConnection(dbURL,username, password);
	        Statement statement = connection.createStatement();
	        ResultSet resultSet = statement.executeQuery(query);
	        while (resultSet.next()) {
	        	String tableName = resultSet.getString(1);
	        	System.out.println("Table name : " + tableName);
	        }
	        connection.close();
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}
