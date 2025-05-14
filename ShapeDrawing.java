import javax.swing.*;
import java.awt.*;

public class ShapeDrawing extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(50, 50, 100, 100); // Circle
        g.setColor(Color.BLUE);
        g.fillRect(200, 50, 100, 100); // Rectangle
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawing");
        frame.add(new ShapeDrawing());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}