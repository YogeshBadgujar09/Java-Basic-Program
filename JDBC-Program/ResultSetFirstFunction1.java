import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetFirstFunction1 {
    public static void main(String[] args) {
        // Database credentials
        String dbUrl = "jdbc:oracle:thin:@localhost:1521";
        String dbUser = "system";
        String dbPass = "2345";

        // Query
        String query = "SELECT * FROM studinfo";

        try {

	Driver d = new oracle.jdbc.driver.OracleDriver();
	DriverManager.registerDriver(d);
            // Connect to database
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);

            // Create Statement
            Statement stmt = conn.createStatement(
			ResultSet.CONCUR_UPDATABLE,
			ResultSet.TYPE_SCROLL_INSENSITIVE
	);
			
            // Execute query
            ResultSet rs = stmt.executeQuery(query);

            // Move to first row
            if (rs.first()) {
                System.out.println("First Row:");
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
            } else {
                System.out.println("No data found.");
            }

            // Close resources
         
            conn.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}