import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Navigation extends JFrame {

    public Navigation() {
        // Set the title of the frame
        setTitle("Main Frame");

        // Set the size of the frame
        setSize(300, 200);

        // Create a panel to hold the button
        JPanel panel = new JPanel();

        // Create a button
        JButton button = new JButton("Click me");

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new frame when the button is clicked
                new SecondFrame().setVisible(true);
            }
        });

        // Add the button to the panel
        panel.add(button);

        // Add the panel to the frame
        add(panel);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on the screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create a new instance of the main frame
        new MainFrame().setVisible(true);
    }
}

class SecondFrame extends JFrame {
    public SecondFrame() {
        // Set the title of the frame
        setTitle("Second Frame");

        // Set the size of the frame
        setSize(300, 200);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Center the frame on the screen
        setLocationRelativeTo(null);
    }
}
 