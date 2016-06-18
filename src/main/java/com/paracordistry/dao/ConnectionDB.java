package com.paracordistry.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDB {

	@SuppressWarnings("finally")
	public static Connection getConnection() {
		Connection connection = null;
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String server = "jdbc:mysql://localhost/paracordistry";
			String user ="root";
			String password ="root";
			
			connection = DriverManager.getConnection(server, user, password);
		} catch(ClassNotFoundException ex) {
			System.out.println("Error1 en la Conexión con la BD " + ex.getMessage());
			connection = null;
		} catch(SQLException ex) {
			System.out.println("Error2 en la Conexión con la BD " + ex.getMessage());
			connection = null;
		} catch(Exception ex) {
			System.out.println("Error3 en la Conexión con la BD " + ex.getMessage());
			connection = null;
		}
		finally {
			return connection;
		}
	}
	
}
