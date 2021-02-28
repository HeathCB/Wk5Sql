package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBconnection {
	/*
	 * This is the information needed for the connection
	 */
	private final static String URL = "jdbc:mysql://localhost:3306/cars";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "Maddie2422";
	/*
	 * Defined my connection as private to follow a singleton design pattern
	 * 
	 * The methods that follow are what actually connects to the database.
	 */
	private static DBconnection instance = new DBconnection();
	private static Connection connection;

	private DBconnection() {}
	
	public static DBconnection getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		if ( connection == null ) {
			try {
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				System.out.println( "Connection was a success!" );
			}catch ( SQLException e ) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	
	public static void closeConnection() {
		try {
			connection.close();
		}catch ( Exception e ) {
			e.printStackTrace();
		}finally {
			connection = null;
		}
	}
}
