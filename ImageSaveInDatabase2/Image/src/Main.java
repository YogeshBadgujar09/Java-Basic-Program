import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args) {



        try {
            Driver driver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver(driver);
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","2345");

            //Image Send in database Proccess

            //Step  1 : Give Image Path to FileInputStream Class
            String path = "C:\\Users\\Yogesh\\Desktop\\Screenshot 2025-02-21 214029.jpg";
            FileInputStream fileInputStream = new FileInputStream(path);

            //Step 2 : Give Bytes size Available in  fileInputStream obj to Convert IMG in BYTE form
            byte[] imageByteForm = new byte[fileInputStream.available()];

            // step 3 : Read Image
            fileInputStream.read(imageByteForm);

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO IMAGE VALUES(?,?)");
            preparedStatement.setInt(1,4);
            preparedStatement.setBytes(2,imageByteForm);

            int a = preparedStatement.executeUpdate();

            if (a > 0)
            {
                System.out.println("Image Insert Successfull ... !!!");
            }else {
                System.out.println("Sorry ... !!!!");
            }



            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}