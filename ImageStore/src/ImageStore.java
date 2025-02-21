import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;

public class ImageStore {

    public static void main(String[] args) {

        String image = "C:\\Users\\Yogesh\\Desktop\\depositeAndwithdraw.png";

        try {

            Driver driver = new oracle.jdbc.driver.OracleDriver() ;

            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO imagesave VALUES(?)");

            FileInputStream fileInputStream = new FileInputStream(image);
            byte[] imageData = new byte[fileInputStream.available()];
            fileInputStream.read(imageData);

            preparedStatement.setBytes(1,imageData);
            int check = preparedStatement.executeUpdate();

            if(check > 0){
                System.out.println("Image Store");
            }else {
                System.out.println("Image Not Store");
            }

            ResultSet resultSet = statement.executeQuery("SELECT * FROM imagesave");
            if (resultSet.next()){
                resultSet.getBlob(1);
            }


            connection.close();

        } catch (SQLException | FileNotFoundException e) {
            System.out.println("Error :" + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error :" + e.getMessage());
            throw new RuntimeException(e);
        }

    }

}
