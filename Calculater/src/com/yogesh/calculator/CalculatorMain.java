package com.yogesh.calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorMain extends JFrame {


    CalculatorMain()
    {
        JPanel jPanel = new JPanel();
        JButton btnAC,btnBackSpace,btnModule, btnDivide;

        jPanel.setLayout(null);
        //FrameMain
        setTitle("Calculator");
        setLocation(450,200);
        setVisible(true);
        setSize(270,275);
        add(jPanel);


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


    }

    public static void main(String[] args) {
        new CalculatorMain();
    }
}
