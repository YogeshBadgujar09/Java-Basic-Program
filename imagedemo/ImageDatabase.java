import java.sql.*;
import java.io.*;

public class ImageDatabase {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "system";
    private static final String PASSWORD = "2345";

    public static void saveImage(String imagePath) {
        String query = "INSERT INTO images (image) VALUES (?)";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(query);
             FileInputStream fis = new FileInputStream(new File(imagePath))) {
             
            ps.setBinaryStream(1, fis, (int) new File(imagePath).length());
            ps.executeUpdate();
            System.out.println("Image inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void retrieveImage(int imageId, String outputPath) {
        String query = "SELECT image FROM images WHERE id = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(query)) {
             
            ps.setInt(1, imageId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Blob blob = rs.getBlob("image");
                InputStream is = blob.getBinaryStream();
                FileOutputStream fos = new FileOutputStream(outputPath);
                
                int b;
                while ((b = is.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                System.out.println("Image retrieved successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        saveImage("C:/path/to/your/image.jpg"); // Change path accordingly
        retrieveImage(1, "C:/path/to/save/image.jpg"); // Change path accordingly
    }
}
