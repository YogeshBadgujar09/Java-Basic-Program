//Here is a simple Java code that allows you to select an image and print its location:


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ImageSelector2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Select Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton selectButton = new JButton("Select Image");
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Selected Image Location: " + selectedFile.getAbsolutePath());
                }
            }
        });

        frame.add(selectButton, BorderLayout.CENTER);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
//This code creates a simple GUI with a button. When the button is clicked, a FileChooser dialog opens, allowing the user to select an image file. After selecting the image, its location is printed to the console.