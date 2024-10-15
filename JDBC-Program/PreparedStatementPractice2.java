import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

class PreparedStatementPractice2
{

	public static void main(String args[])
	{
		System.out.println("Dyanamic Data From Client Side");
		
		try{
			//Step 1 : Create Refference/Object of Driver Interface 

			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);		
			System.out.println("Driver register Successfully \n");
			
			//Step 2 : get Connection 
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");
			System.out.println("Connection Successfully ... !!!");
			System.out.println("Connection object/refference contain specific address of UGA : " + connection);
			
			//Step 3 : Create PreparedStatement object
			//Statement stmt = connection.createStatement();
			PreparedStatement ps = connection.prepareStatement("insert into stud values(?,?)");
			System.out.println("Statement Object create");
			
			Scanner scanner = new Scanner(System.in);
			int id = scanner.nextInt();
			String name = scanner.next();

			ps.setInt(1,id);
			ps.setString(2,name);
			
			//Step 4 Execute the Query
			ps.executeUpdate();
			System.out.println("Query Executed...");

			//Step 5 Close connection
			connection.close();
			System.out.println("Connection is Closed...");
			
		}
		catch(SQLException ex)
		{
			System.out.println("failed to connect with database");
		}
 
	}
}