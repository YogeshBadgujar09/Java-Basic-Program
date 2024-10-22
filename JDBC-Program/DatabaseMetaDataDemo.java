 import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

class DatabaseMetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Driver driver = new OracleDriver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Registered Successfully!!!");
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "infogalaxy");
			System.out.println("Connection Created Successfully!!!");
			
			// Database MetaData --> Data about Data
			DatabaseMetaData databaseMetaData = connection.getMetaData();
			System.out.println("DB Product Name="+databaseMetaData.getDatabaseProductName());
			System.out.println("DB Version="+databaseMetaData.getDatabaseProductVersion());
			System.out.println("DB Major Version="+databaseMetaData.getDatabaseMajorVersion());
			System.out.println("DB Minor Version="+databaseMetaData.getDatabaseMinorVersion());
			System.out.println("JDBC Driver = "+databaseMetaData.getJDBCMajorVersion()+"-"+databaseMetaData.getJDBCMinorVersion());
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("select * from imrd");
			
			 connection.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
