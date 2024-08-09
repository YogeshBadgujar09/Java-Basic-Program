package com.yogesh.calculator;

import javax.swing.*;

public class CalculatorMain extends JFrame {
    JPanel jPanel;
    public void frame(JPanel jPanel)
    {
        setTitle("Calculator");
        setLocation(450,200);
        setVisible(true);
        setSize(270,275);
        add(jPanel);
    }
    public void setButtonOptimizeCode(JButton jButton , String btnName, int btnLocationX, int btnLocationY)
    {
        final int BUTTON_WIDTH = 50;
        final int BUTTON_HEIGHT = 25;

        jButton = new JButton(btnName);
        jButton.setSize(BUTTON_WIDTH,BUTTON_HEIGHT);
        jButton.setLocation(btnLocationX,btnLocationY);
        jButton.setLayout(null);
        jPanel.add(jButton);
    }

    CalculatorMain()
    {
        jPanel = new JPanel();

        jPanel.setLayout(null);

        //FrameMain


        //Add Text Field
        JTextArea jTextArea = new JTextArea();
        jTextArea .setLayout(null);
        jTextArea.setBounds(10,10,230,80);
        jPanel.add(jTextArea);


        //Button Layer 1
        setButtonOptimizeCode(null,"AC",10,100);
        setButtonOptimizeCode(null,"⌫",70,100);
        setButtonOptimizeCode(null,"%",130,100);
        setButtonOptimizeCode(null,"/",190,100);

        //Button Layer 2
        setButtonOptimizeCode(null,"7",10,135);
        setButtonOptimizeCode(null,"8",70,135);
        setButtonOptimizeCode(null,"9",130,135);
        setButtonOptimizeCode(null ,"*",190,135);

        //Button Layer 3
        setButtonOptimizeCode(null,"4",10,170);
        setButtonOptimizeCode(null,"5",70,170);
        setButtonOptimizeCode(null,"6",130,170);
        setButtonOptimizeCode(null ,"-",190,170);

        //Button Layer 4
        setButtonOptimizeCode(null,"1",10,170);
        setButtonOptimizeCode(null,"2",70,170);
        setButtonOptimizeCode(null,"3",130,170);
        setButtonOptimizeCode(null,"+",190,170);

        //Button Layer 5
        setButtonOptimizeCode(null,"00",10,205);
        setButtonOptimizeCode(null,"0",70,205);
        setButtonOptimizeCode(null,".",130,205);
        setButtonOptimizeCode(null ,"=",190,205);

        frame(jPanel);

    }

    public static void main(String[] args) {
        new CalculatorMain();
    }
}
