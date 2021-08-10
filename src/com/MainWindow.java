package com;

import Controllers.BasicOperationController;
import Controllers.NumberSystemController;
import Controllers.SetTheoryController;
import Models.BasicOperationModel;
import Models.NumberSystemModel;
import Models.SetTheoryModel;
import Views.BasicOperationView;
import Views.NumberSystemView;
import Views.SetTheoryView;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{
    // Frequently used Color
    protected Color panelBackgroundColor = new Color(0, 21, 40);
    protected Color screenBackgroundColor = new Color(2, 32, 60);
    protected Color textColor = new Color(228, 228, 228);

    // Basic Operation Components
    private BasicOperationView basicOperationView = new BasicOperationView();
    private BasicOperationModel basicOperationModel = new BasicOperationModel();
    private BasicOperationController basicOperationController;

    // Number System Components
    private NumberSystemView numberSystemView = new NumberSystemView();
    private NumberSystemModel numberSystemModel = new NumberSystemModel();
    private NumberSystemController numberSystemController;

    // Set Theory Components
    private SetTheoryView setTheoryView = new SetTheoryView();
    private SetTheoryModel setTheoryModel = new SetTheoryModel();
    private SetTheoryController setTheoryController;

    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel topRightPanel;
    private JPanel bottomRightPanel;

    // Menu
    private JPanel menuContainer;
    private JPanel menuMainContainer;
    private JLabel menuLabel;
    private JPanel menuButtonContainer;
    private JButton basicArithmeticBtn;
    private JButton numberSystemBtn;
    private JButton setTheoryBtn;

    public MainWindow() {
        createMenu();
        createLayout();

        Color backgroundColor = new Color(2, 32, 60);

        basicOperationController = new BasicOperationController(basicOperationModel, basicOperationView);
        numberSystemController = new NumberSystemController(numberSystemModel, numberSystemView);
        setTheoryController = new SetTheoryController(setTheoryModel, setTheoryView);

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
        leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(panelBackgroundColor);
        leftPanel.setBorder(BorderFactory.createMatteBorder(0, 12, 0, 12, new Color(2, 32, 60)));
        // default left view for Basic Operation
        leftPanel.add(basicOperationView.basicOperationLeftContainer, BorderLayout.CENTER);


        // Panel container for the right side
        rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setBackground(new Color(2, 32, 60));

        // Panel container for the top right side
        topRightPanel = new JPanel(new BorderLayout());
        topRightPanel.setBorder(BorderFactory.createMatteBorder(0, 12, 8, 12, new Color(2, 32, 60)));
        topRightPanel.setPreferredSize(new Dimension(0, 200));
        topRightPanel.setBackground(panelBackgroundColor);

        topRightPanel.add(menuContainer, BorderLayout.CENTER);

        // Panel container for the bottom right side
        bottomRightPanel = new JPanel(new BorderLayout());
        bottomRightPanel.setBorder(BorderFactory.createMatteBorder(8, 12, 0, 12, new Color(2, 32, 60)));
        bottomRightPanel.setBackground(panelBackgroundColor);
        // default bottom right view for Basic Operation
        bottomRightPanel.add(basicOperationView.basicOperationBottomRightContainer, BorderLayout.CENTER);

        rightPanel.add(topRightPanel, BorderLayout.NORTH);
        rightPanel.add(bottomRightPanel, BorderLayout.CENTER);
    }

    public void createMenu() {
        menuContainer = new JPanel(new BorderLayout());

        menuLabel = new JLabel();
        menuLabel.setText("Choose Operation");
        menuLabel.setFont(new Font("Montserrat", Font.PLAIN, 14));
        menuLabel.setBackground(panelBackgroundColor);
        menuLabel.setForeground(textColor);
        menuLabel.setBorder(new CompoundBorder(new EmptyBorder(20, 20, 20, 0), menuLabel.getBorder()));
        menuLabel.setOpaque(true);

        menuButtonContainer = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        basicArithmeticBtn = new JButton("+");
        basicArithmeticBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leftPanel.removeAll();
                leftPanel.add(basicOperationView.basicOperationLeftContainer);
                revalidate();
                repaint();
            }
        });
        menuButtonContainer.add(basicArithmeticBtn, gbc);

        gbc.gridx = 1;
        numberSystemBtn = new JButton("1");
        numberSystemBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leftPanel.removeAll();
                leftPanel.add(numberSystemView.numberSystemLeftContainer);
                revalidate();
                repaint();
            }
        });
        menuButtonContainer.add(numberSystemBtn, gbc);

        gbc.gridx = 2;
        setTheoryBtn = new JButton("{}");
        setTheoryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leftPanel.removeAll();
                leftPanel.add(setTheoryView.setTheoryLeftContainer);
                revalidate();
                repaint();
            }
        });
        menuButtonContainer.add(setTheoryBtn, gbc);

        menuContainer.add(menuButtonContainer, BorderLayout.CENTER);
        menuContainer.add(menuLabel, BorderLayout.NORTH);
    }
}
