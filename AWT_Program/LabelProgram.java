import javax.swing.*;
import java.awt.*;

class LabelProgram {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Label Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Hello, World!");
        panel.add(label);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

