import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.*;

public class ImageDAO {

    Connection conn;
    public ImageDAO() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "2345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public BufferedImage getImage(int id) {
        try {

            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM image WHERE id = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Blob blob = rs.getBlob("image");
                byte[] bytes = blob.getBytes(1, (int) blob.length());
                return ImageIO.read(new ByteArrayInputStream(bytes));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


}
