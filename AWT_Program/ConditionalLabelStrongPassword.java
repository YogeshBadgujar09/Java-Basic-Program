
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConditionalLabelStrongPassword {
    private JFrame frame;
    private JTextField textField;
    private JLabel label;
    private JButton button;

    public ConditionalLabel() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Conditional Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        textField = new JTextField(10);
        label = new JLabel();
        button = new JButton("Submit");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                if (input.length() >= 8) {
                    label.setText("Password is strong!");
                } else {
                    label.setText("Password is weak! Please enter at least 8 characters.");
                }
            }
        });

        frame.add(textField);
        frame.add(button);
        frame.add(label);

        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConditionalLabel();
            }
        });
    }
}

