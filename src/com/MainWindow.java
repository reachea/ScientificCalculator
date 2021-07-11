package com;

import Controllers.BasicOperationController;
import Models.BasicOperationModel;
import Views.BasicOperationView;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class MainWindow extends JFrame{
    // Basic Operation Components
    private BasicOperationView basicOperationView = new BasicOperationView();
    private BasicOperationModel basicOperationModel = new BasicOperationModel();
    private BasicOperationController basicOperationController;

    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel topRightPanel;
    private JPanel bottomRightPanel;

    public MainWindow() {
        createLayout();

        Color backgroundColor = new Color(2, 32, 60);

        basicOperationController = new BasicOperationController(basicOperationModel, basicOperationView);

//        this.setLayout(new GridLayout(1, 2, 14, 0));
        this.setLayout(new BorderLayout());
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(12, 12, 12, 12, backgroundColor));
        this.getContentPane().setBackground(backgroundColor);
        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel, BorderLayout.CENTER);
    }

    private void createLayout() {
        Color panelBackgroundColor = new Color(0, 21, 40);

        // Panel for the left side
        leftPanel = new JPanel();
        leftPanel.setBackground(panelBackgroundColor);
        leftPanel.setBorder(BorderFactory.createMatteBorder(0, 12, 0, 12, new Color(2, 32, 60)));
        // default left view for Basic Operation
        leftPanel.add(basicOperationView.basicOperationLeftContainer);


        // Panel container for the right side
        rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(2, 1, 0, 18));
        rightPanel.setBackground(new Color(2, 32, 60));

        // Panel container for the top right side
        topRightPanel = new JPanel();
        topRightPanel.setBackground(panelBackgroundColor);

        // Panel container for the bottom right side
        bottomRightPanel = new JPanel();
        bottomRightPanel.setBackground(panelBackgroundColor);

        rightPanel.add(topRightPanel, BorderLayout.NORTH);
        rightPanel.add(bottomRightPanel, BorderLayout.SOUTH);
    }
}
