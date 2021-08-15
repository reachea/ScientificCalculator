package Views.BasicOperationContainer;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

// Class for basic operation bottom right view
public class BasicOperationBottomRightContainer extends JPanel {
    // Frequently used Color
    protected Color panelBackgroundColor = new Color(0, 21, 40);
    protected Color screenBackgroundColor = new Color(2, 32, 60);
    protected Color textColor = new Color(228, 228, 228);
    protected Color displayColor = new Color(67, 82, 109);

    // Font
    Font mainFont = new Font("Montserrat", Font.PLAIN, 14);

    // Layouts
    protected JPanel basicOperationBottomRightContainer;
    protected JPanel topHalfContainer;
    protected JPanel bottomHalfContainer;

    // Components
    protected JLabel topHalfTitle;
    protected JLabel bottomHalfTitle;

    protected JPanel topHalfBody;
    protected JPanel topHalfFirstRow;
    protected JPanel topHalfSecondRow;
    protected JPanel bottomHalfBody;
    protected JPanel bottomHalfFirstRow;
    protected JPanel bottomHalfSecondRow;

    protected JComboBox inputMoneyExchange;
    protected JTextField moneyExchangeInput;
    protected JComboBox outputMoneyExchange;
    protected JTextField moneyExchangeOutput;
    protected JButton moneyExchangeSwapButton;

    protected JComboBox inputStorage;
    protected JTextField storageInput;
    protected JComboBox outputStorage;
    protected JTextField storageOutput;
    protected JButton storageSwapButton;

    public BasicOperationBottomRightContainer() {
        createLayout();

        this.setLayout(new BorderLayout());
        this.setBackground(panelBackgroundColor);
        this.add(basicOperationBottomRightContainer, BorderLayout.CENTER);
    }

    public void createLayout() {
        basicOperationBottomRightContainer = new JPanel(new GridLayout(2, 1));
        basicOperationBottomRightContainer.setBackground(panelBackgroundColor
        );

        // top half related
        topHalfTitle = new JLabel("Money Exchange");
        topHalfTitle.setForeground(textColor);
        topHalfTitle.setFont(new Font("Montserrat", Font.PLAIN, 14));

        topHalfContainer = new JPanel(new BorderLayout());
        topHalfContainer.setBackground(panelBackgroundColor);
        topHalfContainer.setBorder(BorderFactory.createMatteBorder(30, 20, 20, 20, panelBackgroundColor));

        topHalfContainer.add(topHalfTitle, BorderLayout.NORTH);

            // top half body
        topHalfBody = new JPanel(new GridLayout(2, 1, 0, 10));
        topHalfBody.setBorder(BorderFactory.createMatteBorder(20, 0, 80, 0, panelBackgroundColor));
        topHalfBody.setBackground(panelBackgroundColor);

        topHalfFirstRow = new JPanel();
        topHalfFirstRow.setLayout(new BoxLayout(topHalfFirstRow, BoxLayout.LINE_AXIS));
        topHalfFirstRow.setBackground(panelBackgroundColor);
        topHalfFirstRow.setBorder(BorderFactory.createMatteBorder(0, 20, 0, 20, panelBackgroundColor));
        topHalfSecondRow = new JPanel();
        topHalfSecondRow.setLayout(new BoxLayout(topHalfSecondRow, BoxLayout.LINE_AXIS));
        topHalfSecondRow.setBackground(panelBackgroundColor);
        topHalfSecondRow.setBorder(BorderFactory.createMatteBorder(0, 20, 0, 20, panelBackgroundColor));
        topHalfBody.add(topHalfFirstRow);
        topHalfBody.add(topHalfSecondRow);

        String[] moneyExchangeField = {"Riel", "Dollar", "Euro", "Franc", "Pound", "Baht"};

        inputMoneyExchange = new JComboBox(moneyExchangeField);
        inputMoneyExchange.setFont(mainFont);
        outputMoneyExchange = new JComboBox(moneyExchangeField);
        outputMoneyExchange.setFont(mainFont);
        moneyExchangeInput = new JTextField();
        moneyExchangeInput.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 10, displayColor));
        moneyExchangeInput.setBackground(displayColor);
        moneyExchangeInput.setFont(new Font("Montserrat", Font.PLAIN, 14));
        moneyExchangeInput.setForeground(textColor);
        moneyExchangeOutput = new JTextField();
        moneyExchangeOutput.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 10, displayColor));
        moneyExchangeOutput.setBackground(displayColor);
        moneyExchangeOutput.setFont(new Font("Montserrat", Font.PLAIN, 14));
        moneyExchangeOutput.setForeground(textColor);
        moneyExchangeOutput.setEditable(false);

        moneyExchangeSwapButton = new JButton("<>");
        topHalfFirstRow.add(inputMoneyExchange);
        topHalfFirstRow.add(Box.createRigidArea(new Dimension(10, 0)));
        topHalfFirstRow.add(moneyExchangeSwapButton);
        topHalfFirstRow.add(Box.createRigidArea(new Dimension(10, 0)));
        topHalfFirstRow.add(outputMoneyExchange);

        topHalfSecondRow.add(moneyExchangeInput);
        topHalfSecondRow.add(Box.createRigidArea(new Dimension(10, 0)));
        topHalfSecondRow.add(moneyExchangeOutput);

        topHalfContainer.add(topHalfBody, BorderLayout.CENTER);

        // bottom half related
        bottomHalfTitle = new JLabel("Storage Converter");
        bottomHalfTitle.setForeground(textColor);
        bottomHalfTitle.setFont(new Font("Montserrat", Font.PLAIN, 14));

        bottomHalfContainer = new JPanel(new BorderLayout());
        bottomHalfContainer.setBackground(panelBackgroundColor);
        bottomHalfContainer.setBorder(BorderFactory.createMatteBorder(30, 20, 20, 20, panelBackgroundColor));

        bottomHalfContainer.add(bottomHalfTitle, BorderLayout.NORTH);

        // bottom half body
        bottomHalfBody = new JPanel(new GridLayout(2, 1, 0, 10));
        bottomHalfBody.setBorder(BorderFactory.createMatteBorder(20, 0, 80, 0, panelBackgroundColor));
        bottomHalfBody.setBackground(panelBackgroundColor);

        bottomHalfFirstRow = new JPanel();
        bottomHalfFirstRow.setLayout(new BoxLayout(bottomHalfFirstRow, BoxLayout.LINE_AXIS));
        bottomHalfFirstRow.setBackground(panelBackgroundColor);
        bottomHalfFirstRow.setBorder(BorderFactory.createMatteBorder(0, 20, 0, 20, panelBackgroundColor));
        bottomHalfSecondRow = new JPanel();
        bottomHalfSecondRow.setLayout(new BoxLayout(bottomHalfSecondRow, BoxLayout.LINE_AXIS));
        bottomHalfSecondRow.setBackground(panelBackgroundColor);
        bottomHalfSecondRow.setBorder(BorderFactory.createMatteBorder(0, 20, 0, 20, panelBackgroundColor));

        bottomHalfBody.add(bottomHalfFirstRow);
        bottomHalfBody.add(bottomHalfSecondRow);

        String[] storageField = {"Byte", "Kilo Byte", "Mega Byte", "Giga Byte", "Tera Byte", "Peta Byte"};

        inputStorage = new JComboBox(storageField);
        inputStorage.setFont(mainFont);
        outputStorage = new JComboBox(storageField);
        outputStorage.setFont(mainFont);
        storageInput = new JTextField();
        storageInput.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 10, displayColor));
        storageInput.setBackground(displayColor);
        storageInput.setFont(new Font("Montserrat", Font.PLAIN, 14));
        storageInput.setForeground(textColor);
        storageOutput = new JTextField();
        storageOutput.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 10, displayColor));
        storageOutput.setBackground(displayColor);
        storageOutput.setFont(new Font("Montserrat", Font.PLAIN, 14));
        storageOutput.setForeground(textColor);
        storageOutput.setEditable(false);

        storageSwapButton = new JButton("<>");
        bottomHalfFirstRow.add(inputStorage);
        bottomHalfFirstRow.add(Box.createRigidArea(new Dimension(10, 0)));
        bottomHalfFirstRow.add(storageSwapButton);
        bottomHalfFirstRow.add(Box.createRigidArea(new Dimension(10, 0)));
        bottomHalfFirstRow.add(outputStorage);

        bottomHalfSecondRow.add(storageInput);
        bottomHalfSecondRow.add(Box.createRigidArea(new Dimension(10, 0)));
        bottomHalfSecondRow.add(storageOutput);

        bottomHalfContainer.add(bottomHalfBody, BorderLayout.CENTER);

        // adding to container
        basicOperationBottomRightContainer.add(topHalfContainer);
        basicOperationBottomRightContainer.add(bottomHalfContainer);
    }
}
