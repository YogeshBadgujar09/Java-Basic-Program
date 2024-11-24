import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MongoDBJDBCConnection {
    public static void main(String[] args) {
        // MongoDB connection string
        String connectionString = "mongodb://localhost:27017/";

        try {
            // Load MongoDB JDBC driver
            Class.forName("com.mongodb.jdbc.MongoDriver");

            // Establish connection to MongoDB
            Connection conn = DriverManager.getConnection(connectionString);

            // Create a statement object
            Statement stmt = conn.createStatement();

            // Execute a query to retrieve all databases
            ResultSet rs = stmt.executeQuery("SHOW DATABASES");

            // Print the list of databases
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            // Close the result set, statement, and connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MongoDB JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }
}


 