import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
                                                                                      class JDBCstep1Demo2
{
	public static void main(String args[])
	{
		try{
			// Step 1 : Register the Driver 
			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Successfully Register");
		}
		catch(SQLException ex){
			System.out.println("failed to register driver");	
		}
		
	}
}