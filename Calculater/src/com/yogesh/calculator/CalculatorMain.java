package com.yogesh.calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorMain extends JFrame {


    CalculatorMain()
    {
        JPanel jPanel = new JPanel();
        JButton btnAC;
        JButton btnBackSpace ;
        JButton btnModule;
        JButton btnDivide,btn7,btn8,btn9,btnMultiplication,btn4,btn5,btn6,btnMinus;
        JButton btnDoubleZero;
        JButton btnZero;
        JButton btnDot  ;
        JButton btnEqaul;

        jPanel.setLayout(null);
        //FrameMain
        setTitle("Calculator");
        setLocation(450,200);
        setVisible(true);
        setSize(270,275);
        add(jPanel);

        //Button Layer 1
        btnAC = new JButton("AC");
        btnAC.setSize(50,25);
        btnAC.setLocation(10,100);
        btnAC.setLayout(null);
        jPanel.add(btnAC);

        btnBackSpace = new JButton("<--");
        btnBackSpace.setSize(50,25);
        btnBackSpace.setLocation(70,100);
        btnBackSpace.setLayout(null);
        jPanel.add(btnBackSpace);

        btnModule = new JButton("%");
        btnModule.setSize(50,25);
        btnModule.setLocation(130,100);
        btnModule.setLayout(null);
        jPanel.add(btnModule);

        btnDivide = new JButton("/");
        btnDivide.setSize(50,25);
        btnDivide.setLocation(190,100);
        btnDivide.setLayout(null);
        jPanel.add(btnDivide);

        //Button Layer 2
        btn7 = new JButton("7");
        btn7.setSize(50,25);
        btn7.setLocation(10,135);
        btn7.setLayout(null);
        jPanel.add(btn7);

        btn8 = new JButton("8");
        btn8.setSize(50,25);
        btn8.setLocation(70,135);
        btn8.setLayout(null);
        jPanel.add(btn8);

        btn9 = new JButton("9");
        btn9.setSize(50,25);
        btn9.setLocation(130,135);
        btn9.setLayout(null);
        jPanel.add(btn9);

        btnMultiplication = new JButton("*");
        btnMultiplication.setSize(50,25);
        btnMultiplication.setLocation(190,135);
        btnMultiplication.setLayout(null);
        jPanel.add(btnMultiplication);

        //Button Layer 3
        btn4 = new JButton("4");
        btn4.setSize(50,25);
        btn4.setLocation(10,170);
        btn4.setLayout(null);
        jPanel.add(btn4);

        btn5 = new JButton("5");
        btn5.setSize(50,25);
        btn5.setLocation(70,170);
        btn5.setLayout(null);
        jPanel.add(btn5);

        btn6 = new JButton("6");
        btn6.setSize(50,25);
        btn6.setLocation(130,170);
        btn6.setLayout(null);
        jPanel.add(btn6);

        btnMinus = new JButton("-");
        btnMinus.setSize(50,25);
        btnMinus.setLocation(190,170);
        btnMinus.setLayout(null);
        jPanel.add(btnMinus);

        //Button Layer 4

        btnDoubleZero = new JButton("00");
        btnDoubleZero.setSize(50,25);
        btnDoubleZero.setLocation(10,205);
        btnDoubleZero.setLayout(null);
        jPanel.add(btnDoubleZero);

        btnZero = new JButton("0");
        btnZero.setSize(50,25);
        btnZero.setLocation(70,205);
        btnZero.setLayout(null);
        jPanel.add(btnZero);

        btnDot = new JButton(".");
        btnDot.setSize(50,25);
        btnDot.setLocation(130,205);
        btnDot.setLayout(null);
        jPanel.add(btnDot);

        btnEqaul = new JButton("=");
        btnEqaul.setSize(50,25);
        btnEqaul.setLocation(190,205);
        btnEqaul.setLayout(null);
        jPanel.add(btnEqaul);



    }

    public static void main(String[] args) {
        new CalculatorMain();
    }
}
