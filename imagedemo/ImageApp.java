import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import javax.imageio.ImageIO;

public class ImageApp extends JFrame {
    private JLabel imageLabel;
    private JButton uploadButton, fetchButton;
    private JTextField idField;
    
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "system";
    private static final String PASSWORD = "2345";
    
    public ImageApp() {
        setTitle("Image Store & Retrieve");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(300, 300));
        add(imageLabel);
        
        uploadButton = new JButton("Upload Image");
        uploadButton.addActionListener(e -> uploadImage());
        add(uploadButton);

        idField = new JTextField(5);
        add(new JLabel("Image ID:"));
        add(idField);

        fetchButton = new JButton("Fetch Image");
        fetchButton.addActionListener(e -> fetchImage());
        add(fetchButton);
    }

    private void uploadImage() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement ps = con.prepareStatement("INSERT INTO images (image) VALUES (?)");
                 FileInputStream fis = new FileInputStream(file)) {
                 
                ps.setBinaryStream(1, fis, (int) file.length());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Image uploaded successfully!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void fetchImage() {
        try {
            int imageId = Integer.parseInt(idField.getText());
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement("SELECT image FROM images WHERE id = ?");
            ps.setInt(1, imageId);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                Blob blob = rs.getBlob("image");
                InputStream is = blob.getBinaryStream();
                Image img = ImageIO.read(is);
                imageLabel.setIcon(new ImageIcon(img));
            } else {
                JOptionPane.showMessageDialog(this, "Image not found!");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImageApp().setVisible(true));
    }
}
