package com.yogesh.jframe;

import javax.swing.*;

public class SecondFrame extends JFrame {

    SecondFrame()
    {
        setTitle("My Frame");
        setSize(400,300);
        setLocation(500,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SecondFrame();
    }
}
