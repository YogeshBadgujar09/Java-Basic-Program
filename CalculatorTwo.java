import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorTwo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JLabel result = new JLabel("Result: ");
        JButton add = new JButton("Add");

        add.addActionListener(e -> {
            try {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                result.setText("Result: " + (a + b));
            } catch (NumberFormatException ex) {
                result.setText("Invalid Input");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Num 1:"));
        panel.add(num1);
        panel.add(new JLabel("Num 2:"));
        panel.add(num2);
        panel.add(add);
        panel.add(result);

        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}