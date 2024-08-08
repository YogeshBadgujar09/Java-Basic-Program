package com.yogesh.jpanel;

import javax.swing.*;

public class JPanelDemo {


    JPanelDemo()
    {
        JPanel jPanel = new JPanel();
        jFrame(jPanel);

    }

    public void jFrame(JPanel jPanel)
    {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("JPanel Demo");
        jFrame.setSize(500,300);
        jFrame.setLocation(500,250);
        jFrame.setVisible(true);
        jFrame.add(jPanel);
    }

    public static void main(String[] args) {
        new JPanelDemo();
    }
}
