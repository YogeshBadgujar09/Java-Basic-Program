import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JButton Example");

        // Create a new JButton
        JButton button = new JButton("Click me!");

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a message dialog when the button is clicked
                System.out.println("Button clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
