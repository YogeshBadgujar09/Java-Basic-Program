import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class IDCheckerMySqlDemo1{
 
	 public static void main(String[] args) {
	
	     Database credentials
	    String dbUrl = jdbcmysqllocalhost3306mydb;
	    String dbUser = root;
	    String dbPass = password;

	     Input ID
	    Scanner scanner = new Scanner(System.in);
	    System.out.print(Enter ID );
	    String inputID = scanner.nextLine();

	     Check ID in database
	    try {
		      Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
		      PreparedStatement pstmt = conn.prepareStatement(SELECT  FROM users WHERE id = );
		      pstmt.setString(1, inputID);
		      ResultSet rs = pstmt.executeQuery();

		      if (rs.next()) {
			        System.out.println(ID already exists.);
		      } else {
			        System.out.println(ID available.);
                  		      }

		      conn.close();
    	} catch (SQLException e) {
      		System.out.println(Database error  + e.getMessage());
    	}
         }
}


 