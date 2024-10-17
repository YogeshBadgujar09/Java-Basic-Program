import java.sql.Driver;	
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
class JDBCAllStepPractice7
{
	public static void main(String args[])
	{

		try{
			// Step 1 : Register the Driver

			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);	
			System.out.println("Driver Register Successfully ... !!!");

			// Step 2 : Connection with Database
			Connection connection =	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");
			System.out.println("\nConnection Successful with Database ... !!!");	
			System.out.println("Specific ID for particular Client : " + connection);

			// Step 3 : Create Statement object 
			Statement statement = connection.createStatement();
			System.out.println("\nStatement Object Create Successfully which handle UGA");

			// Step 4 : Execute Query
			//statement.executeUpdate("create table imrd(id NUMBER, name VARCHAR2(20))");
			System.out.println("Create table in Database ... !!!");
			statement.executeUpdate("INSERT INTO imrd VALUES(1,'Yogesh')");
			
			// Step 5 : Connection Close
			connection.close();
			System.out.println("\nConnection Close ... !!!");
		}	
		catch(SQLException ex)
		{
			System.out.println("Failed to connect with Database ... !!!");
		}
		
	}
}