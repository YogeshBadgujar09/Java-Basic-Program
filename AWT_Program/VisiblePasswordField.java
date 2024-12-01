import javax.swing.*;
import java.awt.*;

public class VisiblePasswordField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Visible Password Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JPasswordField passwordField = new JPasswordField(10);
        passwordField.setEchoChar((char) 0); // Make password visible

        frame.add(passwordField);

        frame.pack();
        frame.setVisible(true);
    }
}
