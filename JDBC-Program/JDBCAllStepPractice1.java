0import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

class JDBCAllStepPractice1
{
	public static void main(String args[])
	{
		try
		{
			//Step 1 Register the Driver
			Driver d = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			System.out.println("Driver Registered Succesfully!!");

			//Step 2 Get Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","infogalaxy");
			System.out.println("Connection Successfull... Connection ID="+con);

			//Step 3 Create Statement Object
			Statement stmt = con.createStatement();
			System.out.println("Statement Object Created...");

			//Step 4 Execute the Query
			//stmt.executeUpdate("create table stud(id number(3),name varchar2(10))");
			stmt.executeUpdate("insert into stud values(1,'Nayan')");
			System.out.println("Query Executed...");

			//Step 5 Close connection
			con.close();
			System.out.println("Connection is Closed...");
		}
		catch(SQLException ex)
		{
			System.out.println("Error in Database Connection...");
		}
	}
}