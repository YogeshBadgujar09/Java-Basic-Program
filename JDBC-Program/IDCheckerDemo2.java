import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class IDCheckerDemo2{
	  public static void main(String[] args) {
	
	    // Database credentials
	    String dbUrl = "jdbc:oracle:thin:@localhost:1521";
    	    String dbUser = "system";
	    String dbPass = "2345";

	    // Input ID
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter ID: ");
                  	    String inputID = scanner.nextLine();

	    // Check ID in database
    	    try {
	   	 Driver driver  = new oracle.jdbc.driver.OracleDriver();
    		 DriverManager.registerDriver(driver);

		  Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);

		  PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM studinfo WHERE id = ?");
		  pstmt.setString(1, inputID);
		
		 ResultSet rs = pstmt.executeQuery();

		 if (rs.next())
		 {
			        System.out.println("ID already exists.");
      		} 
		else
		{
		        System.out.println("ID not available.");
     		 }

     		 conn.close();
   	 }
	 catch (SQLException e)
	 {
      		System.out.println("Database error: " + e.getMessage());
  	  }
              }
}

 