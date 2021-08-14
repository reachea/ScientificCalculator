package com;

import javax.swing.*;
import java.awt.*;

public class ScientificCalculator {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();

        mainWindow.setSize(1024, 768);
        mainWindow.setLocation(200, 10);
        mainWindow.setVisible(true);
        mainWindow.setResizable(false);
        mainWindow.setTitle("ITE Calculator");

        ImageIcon calculatorLogo = new ImageIcon("src/Image/calculatorLogo.png");

        mainWindow.setIconImage(calculatorLogo.getImage());
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
