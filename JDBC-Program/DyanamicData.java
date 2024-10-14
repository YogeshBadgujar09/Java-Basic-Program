import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

class DyanamicData
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
			
			//Step 3 : Create Statement object
			Statement stmt = connection.createStatement();
			System.out.println("Statement Object create");
			
			Scanner scanner = new Scanner(System.in);
			int id = scanner.nextInt();
			String name = scanner.next();
			
			//Step 4 Execute the Query
			//stmt.executeUpdate("create table stud(id number , name varchar2(10))");
			stmt.executeUpdate("insert into stud values("+ id + " , ' "+ name+" ')");
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