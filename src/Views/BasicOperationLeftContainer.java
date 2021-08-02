package Views;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Class basic operation left view
public class BasicOperationLeftContainer extends JPanel {
    // Frequently used Color
    protected Color panelBackgroundColor = new Color(0, 21, 40);
    protected Color screenBackgroundColor = new Color(2, 32, 60);
    protected Color textColor = new Color(228, 228, 228);

    // Layouts
    protected JPanel buttonContainer;

    // Components
    protected JPanel basicArithmeticResultContainer;
    protected JLabel basicArithmeticTitle;
    protected JTextField basicArithmeticOperation;
    protected JTextField basicArithmeticResult;
    public String basicArithmeticResultHolder = "0";

    // button size w: 110, h: 95

    /* buttons */
    // functionality
    protected JButton trigonometryFunction;
    protected JButton bitwiseFunction;

    // main buttons
    // 1st row
    protected JButton backButton = new JButton();
    protected JButton clearButton = new JButton();
    protected JButton squareButton = new JButton();
    protected JButton divideButton = new JButton();
    // 2nd row
    protected JButton sevenButton = new JButton();
    protected JButton eightButton = new JButton();
    protected JButton nineButton = new JButton();
    protected JButton multiplyButton = new JButton();

    // 3rd row
    protected JButton fourButton = new JButton();
    protected JButton fiveButton = new JButton();
    protected JButton sixButton = new JButton();
    protected JButton minusButton = new JButton();

    // 4th row
    protected JButton oneButton = new JButton();
    protected JButton twoButton = new JButton();
    protected JButton threeButton = new JButton();
    protected JButton plusButton = new JButton();

    // 5th row
    protected JButton signButton = new JButton();
    protected JButton zeroButton = new JButton();
    protected JButton dpButton = new JButton();
    protected JButton equalButton = new JButton();

    public BasicOperationLeftContainer() {
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createMatteBorder(0, 12, 0, 12, panelBackgroundColor));

        // add Text Field
        createTextArea();
        this.add(basicArithmeticTitle, BorderLayout.NORTH);

        // create Layout
        JPanel lowerContainer = new JPanel();
        lowerContainer.setLayout(new BorderLayout());
        this.add(lowerContainer, BorderLayout.CENTER);

        lowerContainer.add(basicArithmeticResultContainer, BorderLayout.NORTH);

        createGridButtons();
        lowerContainer.add(buttonContainer, BorderLayout.CENTER);
    }

    public void createGridButtons() {
        buttonContainer = new JPanel();
        buttonContainer.setLayout(new BorderLayout());

        // functionality button
        JPanel basicOperationFunctionality = new JPanel();
        basicOperationFunctionality.setLayout(new GridLayout(1, 2, 8, 8));
        basicOperationFunctionality.setBackground(panelBackgroundColor);

        trigonometryFunction = new JButton();
        trigonometryFunction.setText("Trigonometry");

        bitwiseFunction = new JButton();
        bitwiseFunction.setText("Bitwise");

        basicOperationFunctionality.add(trigonometryFunction);
        basicOperationFunctionality.add(bitwiseFunction);
        basicOperationFunctionality.setBorder(new CompoundBorder(new EmptyBorder(8, 0, 8 ,0), basicOperationFunctionality.getBorder()));
        buttonContainer.add(basicOperationFunctionality, BorderLayout.NORTH);

        // main button
        JPanel mainButtons = new JPanel(new GridLayout(5, 4, 8, 8));
        mainButtons.setBackground(panelBackgroundColor);

        // 1st row
        backButton.setText("<");
        backButton.addActionListener(new BackBtnHandler());
        mainButtons.add(backButton);

        clearButton.setText("C");
        clearButton.addActionListener(new ClearBtnHandler());
        mainButtons.add(clearButton);

        squareButton.setText("^2");
        mainButtons.add(squareButton);

        divideButton.setText("/");
        mainButtons.add(divideButton);

        // 2nd row
        sevenButton.setText("7");
        sevenButton.addActionListener(new NumberSevenBtnHandler());
        mainButtons.add(sevenButton);

        eightButton.setText("8");
        eightButton.addActionListener(new NumberEightBtnHandler());
        mainButtons.add(eightButton);

        nineButton.setText("9");
        nineButton.addActionListener(new NumberNineBtnHandler());
        mainButtons.add(nineButton);

        multiplyButton.setText("X");
        mainButtons.add(multiplyButton);


        // 3rd row
        fourButton.setText("4");
        fourButton.addActionListener(new NumberFourBtnHandler());
        mainButtons.add(fourButton);

        fiveButton.setText("5");
        fiveButton.addActionListener(new NumberFiveBtnHandler());
        mainButtons.add(fiveButton);

        sixButton.setText("6");
        sixButton.addActionListener(new NumberSixBtnHandler());
        mainButtons.add(sixButton);

        minusButton.setText("-");
        mainButtons.add(minusButton);


        // 4th row
        oneButton.setText("1");
        oneButton.addActionListener(new NumberOneBtnHandler());
        mainButtons.add(oneButton);

        twoButton.setText("2");
        twoButton.addActionListener(new NumberTwoBtnHandler());
        mainButtons.add(twoButton);

        threeButton.setText("3");
        threeButton.addActionListener(new NumberThreeBtnHandler());
        mainButtons.add(threeButton);

        plusButton.setText("+");
        mainButtons.add(plusButton);


        // 5th row
        signButton.setText("+/-");
        mainButtons.add(signButton);

        zeroButton.setText("0");
        zeroButton.addActionListener(new NumberZeroBtnHandler());
        mainButtons.add(zeroButton);

        dpButton.setText(".");
        mainButtons.add(dpButton);

        equalButton.setText("=");
        mainButtons.add(equalButton);

        buttonContainer.add(mainButtons, BorderLayout.CENTER);
    }

    public void createTextArea() {
        basicArithmeticTitle = new JLabel();
        basicArithmeticTitle.setText("Basic Arithmetic");
        basicArithmeticTitle.setFont(new Font("Montserrat", Font.PLAIN, 14));
        basicArithmeticTitle.setBackground(panelBackgroundColor);
        basicArithmeticTitle.setForeground(textColor);
        basicArithmeticTitle.setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0), basicArithmeticTitle.getBorder()));
        basicArithmeticTitle.setOpaque(true);

        basicArithmeticResultContainer = new JPanel();
        basicArithmeticResultContainer.setLayout(new BoxLayout(basicArithmeticResultContainer, BoxLayout.PAGE_AXIS));
        basicArithmeticResultContainer.setPreferredSize(new Dimension(392, 158));
        basicArithmeticResultContainer.setBackground(new Color(67, 82, 109));

        basicArithmeticOperation = new JTextField(10);
        basicArithmeticOperation.setBackground(new Color(67, 82, 109));
        basicArithmeticOperation.setHorizontalAlignment(JTextField.RIGHT);
        basicArithmeticOperation.setEditable(false);
        basicArithmeticOperation.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 8, new Color(67, 82, 109)));
        basicArithmeticOperation.setFont(new Font("Montserrat", Font.PLAIN, 18));

        basicArithmeticResult = new JTextField(10);
        basicArithmeticResult.setBackground(new Color(67, 82, 109));
        basicArithmeticResult.setText("0");
        basicArithmeticResult.setHorizontalAlignment(JTextField.RIGHT);
        basicArithmeticResult.setEditable(false);
        basicArithmeticResult.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 8, new Color(67, 82, 109)));
        basicArithmeticResult.setFont(new Font("Montserrat", Font.BOLD, 20));
        basicArithmeticResult.setForeground(new Color(0, 0, 0));

        basicArithmeticResultContainer.add(basicArithmeticOperation);
        basicArithmeticResultContainer.add(basicArithmeticResult);
    }

    // Get/Set basicArithmeticResult
    public String getBasicArithmeticResult() {
        return basicArithmeticResult.getText();
    }

    public void setBasicArithmeticResult(String input) {
        basicArithmeticResult.setText(input);
    }

    // Get/Set basicArithmeticOperation
    public String getBasicArithmeticOperation() {
        return basicArithmeticOperation.getText();
    }

    public void setBasicArithmeticOperation(String input) {
        basicArithmeticOperation.setText(input);
    }

    // Get/Set basicArithmeticResultHolder
    public String getBasicArithmeticResultHolder() {
        return basicArithmeticResultHolder;
    }

    public void setBasicArithmeticResultHolder(String input) {
        basicArithmeticResultHolder = input;
    }

    /**
     * Action Event for Number Key Pads
     */
    class NumberZeroBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oldResult = basicArithmeticResultHolder;

            if (inputLengthRestriction(oldResult)) {
                return;
            }

            if (oldResult.equals("0")) {
                return;
            }

            oldResult = oldResult.concat("0");
            basicArithmeticResultHolder = oldResult;
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    class NumberOneBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oldResult = basicArithmeticResultHolder;

            if (inputLengthRestriction(oldResult)) {
                return;
            }

            if (oldResult.equals("0")) {
                oldResult = "1";
                basicArithmeticResultHolder = oldResult;
                basicArithmeticResult.setText(basicArithmeticResultHolder);
                return;
            }

            oldResult = oldResult.concat("1");
            basicArithmeticResultHolder = oldResult;
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    class NumberTwoBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oldResult = basicArithmeticResultHolder;

            if (inputLengthRestriction(oldResult)) {
                return;
            }

            if (oldResult.equals("0")) {
                oldResult = "2";
                basicArithmeticResultHolder = oldResult;
                basicArithmeticResult.setText(basicArithmeticResultHolder);
                return;
            }

            oldResult = oldResult.concat("2");
            basicArithmeticResultHolder = oldResult;
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    class NumberThreeBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oldResult = basicArithmeticResultHolder;

            if (inputLengthRestriction(oldResult)) {
                return;
            }

            if (oldResult.equals("0")) {
                oldResult = "3";
                basicArithmeticResultHolder = oldResult;
                basicArithmeticResult.setText(basicArithmeticResultHolder);
                return;
            }

            oldResult = oldResult.concat("3");
            basicArithmeticResultHolder = oldResult;
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    class NumberFourBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oldResult = basicArithmeticResultHolder;

            if (inputLengthRestriction(oldResult)) {
                return;
            }

            if (oldResult.equals("0")) {
                oldResult = "4";
                basicArithmeticResultHolder = oldResult;
                basicArithmeticResult.setText(basicArithmeticResultHolder);
                return;
            }

            oldResult = oldResult.concat("4");
            basicArithmeticResultHolder = oldResult;
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    class NumberFiveBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oldResult = basicArithmeticResultHolder;

            if (inputLengthRestriction(oldResult)) {
                return;
            }

            if (oldResult.equals("0")) {
                oldResult = "5";
                basicArithmeticResultHolder = oldResult;
                basicArithmeticResult.setText(basicArithmeticResultHolder);
                return;
            }

            oldResult = oldResult.concat("5");
            basicArithmeticResultHolder = oldResult;
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    class NumberSixBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oldResult = basicArithmeticResultHolder;

            if (inputLengthRestriction(oldResult)) {
                return;
            }

            if (oldResult.equals("0")) {
                oldResult = "6";
                basicArithmeticResultHolder = oldResult;
                basicArithmeticResult.setText(basicArithmeticResultHolder);
                return;
            }

            oldResult = oldResult.concat("6");
            basicArithmeticResultHolder = oldResult;
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    class NumberSevenBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oldResult = basicArithmeticResultHolder;

            if (inputLengthRestriction(oldResult)) {
                return;
            }

            if (oldResult.equals("0")) {
                oldResult = "7";
                basicArithmeticResultHolder = oldResult;
                basicArithmeticResult.setText(basicArithmeticResultHolder);
                return;
            }

            oldResult = oldResult.concat("7");
            basicArithmeticResultHolder = oldResult;
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    class NumberEightBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oldResult = basicArithmeticResultHolder;

            if (inputLengthRestriction(oldResult)) {
                return;
            }

            if (oldResult.equals("0")) {
                oldResult = "8";
                basicArithmeticResultHolder = oldResult;
                basicArithmeticResult.setText(basicArithmeticResultHolder);
                return;
            }

            oldResult = oldResult.concat("8");
            basicArithmeticResultHolder = oldResult;
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    class NumberNineBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oldResult = basicArithmeticResultHolder;

            if (inputLengthRestriction(oldResult)) {
                return;
            }

            if (oldResult.equals("0")) {
                oldResult = "9";
                basicArithmeticResultHolder = oldResult;
                basicArithmeticResult.setText(basicArithmeticResultHolder);
                return;
            }

            oldResult = oldResult.concat("9");
            basicArithmeticResultHolder = oldResult;
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    /**
     * Action Event for Sign
     */
    class BackBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oldResult = basicArithmeticResultHolder;
            String sign = "";

            if (basicArithmeticOperation.getText().length() > 0) {
                sign = basicArithmeticOperation.getText().substring(basicArithmeticOperation.getText().length() - 1);
            }

            if (sign.equals("=")) {
                basicArithmeticOperation.setText("");
                basicArithmeticResultHolder = "0";
                return;
            }

            if (oldResult.equals("0")) {
                return;
            }

            if (oldResult.length() == 0) {
                basicArithmeticResultHolder = "0";
                basicArithmeticResult.setText(basicArithmeticResultHolder);
                return;
            }

            oldResult = oldResult.substring(0, oldResult.length() - 1);

            basicArithmeticResultHolder = oldResult;
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    class ClearBtnHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            basicArithmeticResultHolder = "0";
            basicArithmeticOperation.setText("");
            basicArithmeticResult.setText(basicArithmeticResultHolder);
        }
    }

    public void addMinusBtnHandler(ActionListener minusBtnHandler) { minusButton.addActionListener(minusBtnHandler); }

    public void addPlusButtonHandler(ActionListener plusBtnHandler) {
        plusButton.addActionListener(plusBtnHandler);
    }

    public void addEqualButtonHandler(ActionListener equalBtnHandler) {
        equalButton.addActionListener(equalBtnHandler);
    }


    // Input Length restriction
    public boolean inputLengthRestriction(String input) {
        if (input.length() >= 15) {
            return true;
        }

        return false;
    }
}
