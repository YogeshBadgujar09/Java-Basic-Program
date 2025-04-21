import java.sql.*;

class MySQLConnectivity{

    public static void main(String[] args) {

        System.out.println("Hello World");


        try {
            //Register Driver Successfully
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            System.out.println("Driver Register Successfully ... !!!");

            //Create Connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");

            //create Statement Object
            Statement statement = connection.createStatement();

            // Execute Querry
            statement.execute("INSERT INTO information VALUES('yogeshsb18','123')");

            // Close Connection
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
