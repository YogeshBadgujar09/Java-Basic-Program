import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class TextFieldProgram {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Field Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter your name:");
        panel.add(label);

        JTextField textField = new JTextField(20);
        panel.add(textField);

        JButton button = new JButton("Greet");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

