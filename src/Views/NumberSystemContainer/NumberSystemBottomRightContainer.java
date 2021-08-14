package Views.NumberSystemContainer;

import javax.swing.*;
import java.awt.*;

public class NumberSystemBottomRightContainer extends JPanel {
    // Frequently used Color
    protected Color panelBackgroundColor = new Color(0, 21, 40);
    protected Color screenBackgroundColor = new Color(2, 32, 60);
    protected Color textColor = new Color(228, 228, 228);
    protected Color displayColor = new Color(67, 82, 109);

    // Font
    Font mainFont = new Font("Montserrat", Font.PLAIN, 14);

    // Layouts
    protected JPanel numberSystemRightContainer;
    protected JPanel topHalfContainer;
    protected JPanel bottomHalfContainer;

    // Components
    protected JPanel topHalfBody;
    protected JPanel bottomHalfBody;

    protected JPanel topHalfFirstRow;
    protected JPanel topHalfSecondRow;
    protected JLabel topHalfTitle;
    protected JTextField firstInputTitle;
    protected JTextField firstInput;
    protected JTextField secondInputTitle;
    protected JTextField secondInput;
    protected JButton binaryClearBtn;

    protected JPanel binaryBtnContainer;
    protected JButton binarySumBtn;
    protected JButton binaryMinusBtn;
    protected JButton binaryMultipleBtn;
    protected JButton binaryDivideBtn;
    protected JButton binaryFirstComplementBtn;
    protected JTextField binaryOutput;

    public NumberSystemBottomRightContainer() {
        createLayout();

        this.setLayout(new BorderLayout());
        this.setBackground(panelBackgroundColor);
        this.add(numberSystemRightContainer, BorderLayout.CENTER);
    }

    public void createLayout() {
        numberSystemRightContainer = new JPanel(new GridLayout(2, 1));
        numberSystemRightContainer.setBackground(panelBackgroundColor);

        // Top Half related
        topHalfContainer = new JPanel(new BorderLayout());
        topHalfContainer.setBackground(panelBackgroundColor);
        topHalfContainer.setBorder(BorderFactory.createMatteBorder(30, 20, 20, 20, panelBackgroundColor));

        topHalfTitle = new JLabel("Binary Arithmetic");
        topHalfTitle.setFont(mainFont);
        topHalfTitle.setForeground(textColor);
        topHalfTitle.setBackground(panelBackgroundColor);

        topHalfBody = new JPanel(new GridLayout(2, 1, 0, 10));
        topHalfBody.setBackground(panelBackgroundColor);
        topHalfBody.setBorder(BorderFactory.createMatteBorder(20, 0, 80, 0, panelBackgroundColor));

        topHalfFirstRow = new JPanel();
        topHalfFirstRow.setLayout(new BoxLayout(topHalfFirstRow, BoxLayout.LINE_AXIS));
        topHalfFirstRow.setBackground(panelBackgroundColor);
        topHalfFirstRow.setBorder(BorderFactory.createMatteBorder(0, 20, 0, 20, panelBackgroundColor));
        firstInputTitle = new JTextField("First Input");
        firstInputTitle.setFont(mainFont);
        firstInputTitle.setForeground(textColor);
        firstInputTitle.setBackground(displayColor);
        firstInputTitle.setHorizontalAlignment(SwingConstants.CENTER);
        firstInputTitle.setEditable(false);
        binaryClearBtn = new JButton("C");
        binaryClearBtn.setFont(mainFont);
        secondInputTitle = new JTextField("Second Input");
        secondInputTitle.setFont(mainFont);
        secondInputTitle.setForeground(textColor);
        secondInputTitle.setBackground(displayColor);
        secondInputTitle.setHorizontalAlignment(SwingConstants.CENTER);
        secondInputTitle.setEditable(false);
        topHalfFirstRow.add(firstInputTitle);
        topHalfFirstRow.add(Box.createRigidArea(new Dimension(10, 0)));
        topHalfFirstRow.add(binaryClearBtn);
        topHalfFirstRow.add(Box.createRigidArea(new Dimension(10, 0)));
        topHalfFirstRow.add(secondInputTitle);

        topHalfSecondRow = new JPanel();
        topHalfSecondRow.setLayout(new BoxLayout(topHalfSecondRow, BoxLayout.LINE_AXIS));
        topHalfSecondRow.setBackground(panelBackgroundColor);
        topHalfSecondRow.setBorder(BorderFactory.createMatteBorder(0, 20, 0, 20, panelBackgroundColor));
        firstInput = new JTextField("");
        firstInput.setBackground(screenBackgroundColor);
        firstInput.setFont(mainFont);
        firstInput.setForeground(textColor);
        firstInput.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 10, screenBackgroundColor));
        secondInput = new JTextField("");
        secondInput.setBackground(screenBackgroundColor);
        secondInput.setFont(mainFont);
        secondInput.setForeground(textColor);
        secondInput.setEditable(false);
        secondInput.setBorder(BorderFactory.createMatteBorder(0, 10, 0, 10, screenBackgroundColor));
        topHalfSecondRow.add(firstInput);
        topHalfSecondRow.add(Box.createRigidArea(new Dimension(10, 0)));
        topHalfSecondRow.add(secondInput);

        topHalfBody.add(topHalfFirstRow);
        topHalfBody.add(topHalfSecondRow);

        topHalfContainer.add(topHalfTitle, BorderLayout.NORTH);
        topHalfContainer.add(topHalfBody, BorderLayout.CENTER);

        // Bottom Half related
        bottomHalfContainer = new JPanel(new BorderLayout(0, 10));
        bottomHalfContainer.setBackground(panelBackgroundColor);
        bottomHalfContainer.setBorder(BorderFactory.createMatteBorder(30, 20, 20, 20, panelBackgroundColor));

        binaryBtnContainer = new JPanel();
        binaryBtnContainer.setLayout(new BoxLayout(binaryBtnContainer, BoxLayout.LINE_AXIS));
        binaryBtnContainer.setBackground(panelBackgroundColor);

        binarySumBtn = new JButton("+");
        binarySumBtn.setFont(mainFont);
        binaryMinusBtn = new JButton("-");
        binaryMinusBtn.setFont(mainFont);
        binaryMultipleBtn = new JButton("*");
        binaryMultipleBtn.setFont(mainFont);
        binaryDivideBtn = new JButton("/");
        binaryDivideBtn.setFont(mainFont);
        binaryFirstComplementBtn = new JButton("1's");
        binaryFirstComplementBtn.setFont(mainFont);

        binaryBtnContainer.add(binarySumBtn);
        binaryBtnContainer.add(binaryMinusBtn);
        binaryBtnContainer.add(Box.createRigidArea(new Dimension(10, 0)));
        binaryBtnContainer.add(binaryMinusBtn);
        binaryBtnContainer.add(Box.createRigidArea(new Dimension(10, 0)));
        binaryBtnContainer.add(binaryMultipleBtn);
        binaryBtnContainer.add(Box.createRigidArea(new Dimension(10, 0)));
        binaryBtnContainer.add(binaryDivideBtn);
        binaryBtnContainer.add(Box.createRigidArea(new Dimension(10, 0)));
        binaryBtnContainer.add(binaryFirstComplementBtn);

        binaryOutput = new JTextField("");
        binaryOutput.setFont(mainFont);
        binaryOutput.setBackground(displayColor);
        binaryOutput.setForeground(textColor);
        binaryOutput.setEditable(false);

        bottomHalfContainer.add(binaryBtnContainer, BorderLayout.NORTH);
        bottomHalfContainer.add(binaryOutput, BorderLayout.CENTER);

        numberSystemRightContainer.add(topHalfContainer);
        numberSystemRightContainer.add(bottomHalfContainer);
    }
}
