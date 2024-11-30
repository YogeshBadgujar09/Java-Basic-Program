import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutoEraseTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Auto Erase Text Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        JButton clearButton = new JButton("Clear");

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        frame.add(textField);
        frame.add(clearButton);

        frame.pack();
        frame.setVisible(true);
    }
}
