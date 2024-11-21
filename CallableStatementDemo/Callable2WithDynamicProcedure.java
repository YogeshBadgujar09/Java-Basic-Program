import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.CallableStatement;
 

class Callable2WithDynamicProcedure{

	public static void main(String args[])
	{
		
		try{
			//Step 1: Register Driver
			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Register Successfully");			

			//Step 2: Get Coonection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "2345");
			System.out.println("Connection Successfull");

			// Step 3: create Statement object
			CallableStatement callableStatement = connection.prepareCall("{ CALL dynamicData(?,?)}");		
			callableStatement.setInt(1,3);
			callableStatement.setString(2,"Yash");
	
			// Step 4 : Execute Query
			callableStatement.execute();
			System.out.println("Query Excuted .... !!! ");

			// Step 5 : Close connection
			connection.close();
			System.out.println("Connection Close.... !!! ");
		}catch(SQLException ex){
			System.out.println("Error to connection : " + ex.getMessage());		
		}
	}

}