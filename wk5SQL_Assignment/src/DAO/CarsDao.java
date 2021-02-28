package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entity.Cars;

public class CarsDao {
/*
 * These are my SQL queries for the CRUD operations.
 */
	private final String addcar =  "Insert into cars(id, make, model, modelYear) Values(?, ?, ?, ?)";
	private final String deletecar = "Delete from cars where id =?";
	private final String updatecar = "update cars set make=?, model=?, modelyear=? where id=? ";
	private Connection connection;
	/*
	 * This is how I set up my connection with the DAO.
	 */
	public CarsDao() {
		connection = DBconnection.getInstance().getConnection();
	}
	/*
	 * This method retrieves the data from the database and stores it as an array then displays the data.
	 */
	public List<Cars> getAllCars() throws SQLException{
		List<Cars> out = new ArrayList<>();
		
		Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery( "Select * from cars" );
		
		while ( rs.next() ) {
			out.add( new Cars(rs.getInt( "id" ), rs.getString( "make" ), rs.getString( "model" ), rs.getInt( "modelYear") ));
		}
		return out;
		
	}
	/*
	 * This method is for adding a car to the database.
	 */
	public void AddCar( int id, String make, String model, int modelYear) throws SQLException {
		try (PreparedStatement ps = connection.prepareStatement(addcar)) {
			ps.setInt(1, id);
			ps.setString(2, make);
			ps.setString(3, model);
			ps.setInt(4, modelYear);
			ps.executeUpdate();
		}
		catch( SQLException e ) {
			e.printStackTrace();
		}
	}
	/*
	 * This is my delete method for removing cars from the database.
	 */
	public void deleteCar(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(deletecar);
		ps.setInt(1, id);
		ps.executeUpdate();
		ps.close();
	}
	
	
	/*
	 * This is my update method for updating information on cars in the database.
	 */
	public void updateCars(int id, String make, String model, int modelYear) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(updatecar);
		ps.setInt(4, id);
		ps.setString(1, make);
		ps.setString(2, model);
		ps.setInt(3, modelYear);
		ps.executeUpdate();
		ps.close();
	}
	/*
	 * This is for closing the connection to the database I didnt know if it was needed but thought I should include.
	 */
	public void close() {
		DBconnection.getInstance();
		DBconnection.closeConnection();
	}

}
