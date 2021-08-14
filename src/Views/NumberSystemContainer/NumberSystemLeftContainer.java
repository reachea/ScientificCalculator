package Views.NumberSystemContainer;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class NumberSystemLeftContainer extends JPanel {
    // Frequently used Color
    protected Color panelBackgroundColor = new Color(0, 21, 40);
    protected Color screenBackgroundColor = new Color(2, 32, 60);
    protected Color textColor = new Color(228, 228, 228);
    protected Color displayColor = new Color(67, 82, 109);

    // Font
    Font mainFont = new Font("Montserrat", Font.PLAIN, 14);

    // Layouts
    protected JPanel numberSystemBody;
    protected JPanel btnContainer;

    // Components
    JLabel numberSystemTitle;
    JTextField numberSystemInput;
    JLabel numberSystemInputTitle;
    JComboBox numberSystemFrom;
    JComboBox numberSystemTo;
    JLabel numberSystemFromTitle;
    JLabel numberSystemToTitle;
    JButton numberSystemConvertBtn;
    JButton numberSystemResetBtn;
    JButton numberSystemSwapBtn;
    JLabel numberSystemResult;
    JTextField numberSystemOutput;

    public NumberSystemLeftContainer() {
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createMatteBorder(0, 12, 0, 12, panelBackgroundColor));
        this.setPreferredSize(new Dimension(416, 158));

        createLayout();
        createTitle();

        this.add(numberSystemBody, BorderLayout.CENTER);
        this.add(numberSystemTitle, BorderLayout.NORTH);
    }

    public void createLayout() {
        numberSystemBody = new JPanel();
        numberSystemBody.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        numberSystemBody.setBackground(panelBackgroundColor);

        numberSystemInputTitle = new JLabel("Enter Number");
        numberSystemInputTitle.setFont(mainFont);
        numberSystemInputTitle.setForeground(textColor);
        numberSystemInputTitle.setBorder(new EmptyBorder(25, 0, 5, 0));

        numberSystemInput = new JTextField();
        numberSystemInput.setFont(mainFont);
        numberSystemInput.setForeground(textColor);
        numberSystemInput.setBackground(panelBackgroundColor);

        numberSystemFromTitle = new JLabel("From Base");
        numberSystemFromTitle.setFont(mainFont);
        numberSystemFromTitle.setForeground(textColor);
        numberSystemFromTitle.setBorder(new EmptyBorder(25, 0, 5, 0));

        String[] numberSystemField = {"Binary", "Octal", "Decimal", "Hexadecimal"};

        numberSystemFrom = new JComboBox(numberSystemField);

        numberSystemToTitle = new JLabel("To Base");
        numberSystemToTitle.setFont(mainFont);
        numberSystemToTitle.setForeground(textColor);
        numberSystemToTitle.setBorder(new EmptyBorder(25, 0, 5, 0));

        numberSystemTo = new JComboBox(numberSystemField);

        btnContainer = new JPanel(new FlowLayout());
        btnContainer.setBorder(new EmptyBorder(25, 0, 5, 0));
        btnContainer.setBackground(panelBackgroundColor);

        numberSystemConvertBtn = new JButton("= Convert");

        numberSystemResetBtn = new JButton("x Reset");

        numberSystemSwapBtn = new JButton("<> Swap");

        btnContainer.add(numberSystemConvertBtn);
        btnContainer.add(numberSystemResetBtn);
        btnContainer.add(numberSystemSwapBtn);

        numberSystemResult = new JLabel("Result Number");
        numberSystemResult.setFont(mainFont);
        numberSystemResult.setForeground(textColor);
        numberSystemResult.setBorder(new EmptyBorder(25, 0, 5, 0));

        numberSystemOutput = new JTextField();

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        numberSystemBody.setBorder(BorderFactory.createLineBorder(Color.RED));
        numberSystemBody.add(numberSystemInputTitle, gbc);

        gbc.gridy = 1;
        numberSystemBody.add(numberSystemInput, gbc);

        gbc.gridy = 2;
        numberSystemBody.add(numberSystemFromTitle, gbc);

        gbc.gridy = 3;
        numberSystemBody.add(numberSystemFrom, gbc);

        gbc.gridy = 4;
        numberSystemBody.add(numberSystemToTitle, gbc);

        gbc.gridy = 5;
        numberSystemBody.add(numberSystemTo, gbc);

        gbc.gridy = 6;
        numberSystemBody.add(btnContainer, gbc);

        gbc.gridy = 7;
        numberSystemBody.add(numberSystemResult, gbc);

        gbc.gridy = 8;
        numberSystemBody.add(numberSystemOutput, gbc);
    }

    public void createTitle() {
        numberSystemTitle = new JLabel();
        numberSystemTitle.setText("Number System");
        numberSystemTitle.setFont(mainFont);
        numberSystemTitle.setBackground(panelBackgroundColor);
        numberSystemTitle.setForeground(textColor);
        numberSystemTitle.setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0), numberSystemTitle.getBorder()));
        numberSystemTitle.setOpaque(true);
    }
}
