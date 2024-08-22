import javax.swing.*;
import java.awt.*;

class BouncingBall extends JPanel {
    private int x = 0;
    private int y = 0;
    private int dx = 2;
    private int dy = 2;
    private int diameter = 20;

    public BouncingBall() {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(400, 400));
        Timer timer = new Timer(16, e -> {
            moveBall();
            repaint();
        });
        timer.start();
    }

    private void moveBall() {
        x += dx;
        y += dy;
        if (x < 0 || x > getWidth() - diameter) {
            dx *= -1;
        }
        if (y < 0 || y > getHeight() - diameter) {
            dy *= -1;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillOval(x, y, diameter, diameter);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bouncing Ball");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new BouncingBall());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
