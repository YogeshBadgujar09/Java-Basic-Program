package com.yogesh.jlable;

import javax.swing.*;

public class FirstLable {

    public void frame(JPanel jPanel)
    {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Add Lable");
        jFrame.setSize(450,300);
        jFrame.setLocation(300,200);
        jFrame.setVisible(true);
        jFrame.add(jPanel);
    }
    FirstLable()
    {
      JPanel jPanel = new JPanel();
      jPanel.setLayout(null);

      JLabel jLabel = new JLabel();
      jLabel.setText("Welcome to SBI");
      jLabel.setLayout(null);
      jLabel.setBounds(100,100,150,100);


      jPanel.add(jLabel);

      frame(jPanel);
    }

    public static void main(String[] args) {
        new FirstLable();
    }
}
