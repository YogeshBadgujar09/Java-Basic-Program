package com.yogesh.calculator;

import javax.swing.*;

public class CalculatorMain extends JFrame {

    JPanel jPanel;
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
        JButton btnAC = null;
        JButton btnBackSpace = null;
        JButton btnModule = null;
        JButton btnDivide = null;
        JButton btn7 = null ;
        JButton btn8 = null ;
        JButton btn9 = null ;
        JButton btnMultiplication = null;
        JButton btn4 = null ;
        JButton btn5 = null ;
        JButton btn6 = null ;
        JButton btnMinus = null ;
        JButton btnDoubleZero = null;
        JButton btnZero = null;
        JButton btnDot = null ;
        JButton btnEqaul = null;
        JButton btn1 = null;
        JButton btn2 = null;
        JButton btn3 = null;
        JButton btnAdd = null ;

        jPanel.setLayout(null);
        //FrameMain
        setTitle("Calculator");
        setLocation(450,200);
        setVisible(true);
        setSize(270,275);
        add(jPanel);

        //Button Layer 1
        setButtonOptimizeCode(btnAC,"AC",10,100);
        setButtonOptimizeCode(btnBackSpace,"<--",70,100);
        setButtonOptimizeCode(btnModule,"%",130,100);
        setButtonOptimizeCode(btnDivide,"/",190,100);

        //Button Layer 2
        setButtonOptimizeCode(btn7,"7",10,135);
        setButtonOptimizeCode(btn8,"8",70,135);
        setButtonOptimizeCode(btn9,"9",130,135);
        setButtonOptimizeCode(btnMultiplication ,"*",190,135);

        //Button Layer 3
        setButtonOptimizeCode(btn4,"4",10,170);
        setButtonOptimizeCode(btn5,"5",70,170);
        setButtonOptimizeCode(btn6,"6",130,170);
        setButtonOptimizeCode(btnMinus ,"-",190,170);

        //Button Layer 4
        setButtonOptimizeCode(btn1,"1",10,170);
        setButtonOptimizeCode(btn2,"2",70,170);
        setButtonOptimizeCode(btn3,"3",130,170);
        setButtonOptimizeCode(btnAdd ,"+",190,170);

        //Button Layer 5
        setButtonOptimizeCode(btnDoubleZero,"00",10,205);
        setButtonOptimizeCode(btnZero,"0",70,205);
        setButtonOptimizeCode(btnDot,".",130,205);
        setButtonOptimizeCode(btnEqaul ,"=",190,205);




    }

    public static void main(String[] args) {
        new CalculatorMain();
    }
}
