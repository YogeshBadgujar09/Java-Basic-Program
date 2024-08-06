import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MyJFrame1 extends JFrame {
    public MyJFrame1() {
        // Set the title of the frame
        setTitle("My JFrame1");

        // Set the size of the frame
        setSize(300, 200);

        // Create a label to display in the frame
        JLabel label = new JLabel("Hello, World!");

        // Create a button to display in the frame
        JButton button = new JButton("Click me!");

        // Add an action listener to the button
        button.addActionListener(e -> {
            // Display a message dialog when the button is clicked
            JOptionPane.showMessageDialog(this, "Button clicked!");
        });

        // Add the label and button to the frame
        add(label);
        add(button);

        // Set the default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create a new instance of the frame
        new MyJFrame();
    }
}
