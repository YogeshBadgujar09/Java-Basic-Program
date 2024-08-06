import javax.swing.JLabel;
import javax.swing.JFrame;


public class MyJFrame extends JFrame {
    public MyJFrame() {
        // Set the title of the frame
        setTitle("My JFrame");

        // Set the size of the frame
        setSize(300, 200);

        // Create a label to display in the frame
        JLabel label = new JLabel("Hello, World!");

        // Add the label to the frame
        add(label);

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
