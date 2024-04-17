import javax.swing.*;
import java.awt.*;

public class FlowLayout {

    public static void main(String[] args){
        JFrame frame = new JFrame("Flow Layout Example");
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.pack();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
