package Application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import DAO.CarsDao;
import Entity.Cars;

public class Menu {
	/*
	 * the three private fields are as follows:
	 * The first field is for my scanner
	 * The second field is an array of strings for my menu options
	 * The third just instantiates the cars dao
	 */
	private Scanner scanner = new Scanner( System.in );
	private String[] menuOpts = { "Display Cars", "Create new car", "Update Car info", "Delete a car" };
	private CarsDao carsDao = new CarsDao();
	/*
	 * This method prints the menu with the options
	 */
	private void printMenu() {
		System.out.println( " ----------------- " );
		for ( int i = 0; i < menuOpts.length; i++ ) {
			System.out.println( ( i + 1) + ")" + menuOpts[ i ] );
		}
	}
	/*
	 * This is teh first option that displays the cars 
	 */
	private void displayCars() throws SQLException {
		List<Cars> myCars = carsDao.getAllCars();
		for ( Cars c : myCars) {
			System.out.println( c.getId() + " - " + c.getMake() + " - " + c.getModel() + " - " + c.getModelYear() );
		}
	}
	/*
	 * This method is used to add a car to the database
	 */
	private void addCar() throws SQLException{
		System.out.print("Enter new car id");
		String nl  = scanner.nextLine();
		Integer id = null;
		try {
			id = Integer.parseInt( nl );
		} catch ( NumberFormatException e) {
			System.out.println( "This should be a number!" );
			return;
		}
		if ( id != null ) {
			System.out.print( "Enter the new car make: " );
			String make = scanner.nextLine();
			if ( !make.isEmpty() ) {
				System.out.print( "Enter the car model: " );
				String model = scanner.nextLine();
			if ( !model.isEmpty() ) {
				System.out.println( "Enter the car Year: " );
				int modelyear = scanner.nextInt();
				carsDao.AddCar( id, make, model, modelyear );
				}
			}
		}
	}
	/*
	 * This method is used to update a car in the database
	 */
	
	private void updateCars() throws SQLException {
		System.out.print("Enter car id");
		String nl  = scanner.nextLine();
		Integer id = null;
		try {
			id = Integer.parseInt( nl );
		} catch ( NumberFormatException e) {
			System.out.println( "This should be a number!" );
			return;
		}
		if ( id != null ) {
			System.out.print( "Enter the new car make: " );
			String make = scanner.nextLine();
			if ( !make.isEmpty() ) {
				System.out.print( "Enter the car model: " );
				String model = scanner.nextLine();
			if ( !model.isEmpty() ) {
				System.out.println( "Enter the car Year: " );
				int modelyear = scanner.nextInt();
				carsDao.updateCars( id, make, model, modelyear );
				}
			}
		}
	}
	/*
	 * This method is for deleting a car from the database
	 */
	private void deleteACar() throws SQLException {
		System.out.print( "Enter car id to delete" );
		String nl = scanner.nextLine();
		Integer id = null;
		try {
			id = Integer.parseInt( nl );
		} catch ( NumberFormatException e ) {
			System.out.println(" This should be a number!");
		}
		if ( id != null ) {
			carsDao.deleteCar(id);
		}
	}

/*
 * This method is for displaying the menu and its options
 * I used switch instead of if elses because I prefer the look of this over multiple if else statements.	
 */
	
	public void start() {
		String selection = " ";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			try {
				switch ( selection ) {
				case "1":
					displayCars();
					break;
				case "2":
					addCar();
					break;
				case "3":
					updateCars();
					break;
				case "4":
					deleteACar();
					break;
				default:
					selection = "-1";
					break;
				}
				
			} catch ( SQLException e ) {
				e.printStackTrace();
				end();
			}
			
			if ( !selection.equals( "-1" )) {
				System.out.println( " Press enter to continue " );
				scanner.nextLine();
			}
		}while ( !selection.equals( "-1" ));
		carsDao.close();
	}
	
	
	public void end() {
		System.out.println( "Leaving the database" );
		scanner.close();
		carsDao.close();
	}
}
