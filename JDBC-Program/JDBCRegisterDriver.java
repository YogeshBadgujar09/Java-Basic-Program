import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
class JDBCRegisterDriver{

	public static void main(String args[])
	{

		try{
			// Step 1: Register Driver  	
			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
		
			System.out.println("Driver Register Successfully");
		}
		catch(SQLException ex)
		{
			System.out.println("Failed to register driver");
		}
		
	}
}