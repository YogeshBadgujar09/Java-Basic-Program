import java.sql.Driver;
import java.sql.DriverManager ;
import java.sql.SQLException;
import java.sql.Connection;
class JDBCStep2
{
	public static void main(String args[])
	{

		try{
			//Step 1 : Register Driver ;

			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);			

			System.out.println("Register driver succesfully");
			
			//Step 2 : Get Connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");
			System.out.println("Get connection successfully");
		}
		catch(SQLException ex)
		{
			System.out.println("Failed to Register Driver");
		}
	}
}