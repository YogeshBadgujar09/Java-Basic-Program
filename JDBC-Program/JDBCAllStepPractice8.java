import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

class JDBCAllStepPractice8
{
	public static void main(String args[])
	{

		try
		{
			// Step 1 : register the driver
			Driver d = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			System.out.println("Driver register successfully ... !!!");
			
			// Step 2 :  Create Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");
			System.out.println("Coonection Successfull ... !!!");
			
			// Step 3 : Create Statement object
			Statement stmt = con.createStatement();
			System.out.println("Statement Object Create");
			
			// Step 4 : Execute Query 
			//stmt.executeUpdate("insert into imrd values(2,'rohit')");

			// Step 5 : Close Connection;
			con.close();

		}		
		catch(SQLException ex)
		{
			System.out.println("Failed to connection ... !!!");
		}



	}

}