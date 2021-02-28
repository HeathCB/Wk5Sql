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

	private final String addcar =  "Insert into cars(id, make, model, modelYear) Values(?, ?, ?, ?)";
	private final String deletecar = "Delete from cars where id =?";
	private final String updatecar = "update cars set make=?, model=?, modelyear=? where id=? ";
	private Connection connection;
	
	public CarsDao() {
		connection = DBconnection.getInstance().getConnection();
	}
	
	public List<Cars> getAllCars() throws SQLException{
		List<Cars> out = new ArrayList<>();
		
		Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery( "Select * from cars" );
		
		while ( rs.next() ) {
			out.add( new Cars(rs.getInt( "id" ), rs.getString( "make" ), rs.getString( "model" ), rs.getInt( "modelYear") ));
		}
		return out;
		
	}
	
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
		
	public void deleteCar(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(deletecar);
		ps.setInt(1, id);
		ps.executeUpdate();
		ps.close();
	}
	
	
	
	public void updateCars(int id, String make, String model, int modelYear) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(updatecar);
		ps.setInt(4, id);
		ps.setString(1, make);
		ps.setString(2, model);
		ps.setInt(3, modelYear);
		ps.executeUpdate();
		ps.close();
	}
	public void close() {
		DBconnection.getInstance();
		DBconnection.closeConnection();
	}

}
