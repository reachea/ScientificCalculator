package com;

import javax.swing.*;

public class ScientificCalculator {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();

        mainWindow.setSize(1024, 768);
        mainWindow.setLocation(200, 0);
        mainWindow.setVisible(true);
        mainWindow.setTitle("ITE Calculator");

        ImageIcon calculatorLogo = new ImageIcon("src/Image/calculatorLogo.png");

        mainWindow.setIconImage(calculatorLogo.getImage());
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
