

import javax.swing.*;
import java.awt.image.BufferedImage;

public class ImageDisplay extends JFrame {
    public ImageDisplay(BufferedImage image) {
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        add(label);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        ImageDAO dao = new ImageDAO();

        BufferedImage image = dao.getImage(1); // Replace with your image ID
        if (image != null) {
            new ImageDisplay(image);
        } else {
            System.out.println("Image not found.");
        }
    }
}