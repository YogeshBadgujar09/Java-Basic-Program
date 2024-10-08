
import java.sql.Driver ;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCstep1Practice1
{
	public static void main(String args[])
	{
		// Step 1 : Register Driver 
		
		try 
		{
	
			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Register Successfully ........... !!!");
		}
		catch(SQLException ex)
		{
			System.out.println("Failed to register driver");
		}
	
	

	
	}
}