import javax.swing.*;
import java.awt.*;

class TextFieldProgram1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Field Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        panel.add(textField);

        JButton button = new JButton("Submit");
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
