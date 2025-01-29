
import javax.swing.*;
import java.awt.*;

public class MarqueeTextDemo extends JPanel {

    private String text = "This is a marquee text example";
    private int x = 800;

    public MarqueeTextDemo() {
        setPreferredSize(new Dimension(800, 500));
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString(text, x, 250);
    }

    public void animate() {
        x--;
        if (x < -getTextWidth(text)) {
            x = 800;
        }
        repaint();
    }

    private int getTextWidth(String text) {
        FontMetrics fm = getFontMetrics(new Font("Arial", Font.BOLD, 24));
        return fm.stringWidth(text);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Marquee Text");
        MarqueeTextDemo marqueeText = new MarqueeTextDemo();

        frame.add(marqueeText);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer(1, e -> marqueeText.animate());
        timer.start();
    }
}