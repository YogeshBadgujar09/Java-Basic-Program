import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

class JDBCconnectionStepPractice
{
	public static void main(String args[])
	{
		
		
		try
		{

			// Step 1 : Reg‪ister Driver

			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Registration Successfully .... !!");

			// Step 2 : Connection 

			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");						System.out.println("Connect Successfully Successfully .... !!");
		}
		catch(SQLException ex)	
		{
			System.out.println("Failed to Driver Register ");
		}
		
		
	}

}