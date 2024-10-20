import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

class RetriveDataResultSetDemo3
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
			ResultSet rs = stmt.executeQuery("SELECT * FROM imrd");

			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
			}	

			// Step 5 : Close Connection;
			con.close();

		}		
		catch(SQLException ex)
		{
			System.out.println("Failed to connection ... !!!");
		}



	}

}