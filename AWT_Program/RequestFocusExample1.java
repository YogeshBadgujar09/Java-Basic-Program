
import javax.swing.*;
import java.awt.*;

public class RequestFocusExample1{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Request Focus Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);

        frame.add(textField1);
        frame.add(textField2);

        // Request focus for textField2
        textField2.requestFocus();

        frame.pack();
        frame.setVisible(true);
    }
}