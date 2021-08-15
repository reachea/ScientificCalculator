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
    JTextArea numberSystemOutput;

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
        numberSystemBody.setLayout(new BoxLayout(numberSystemBody, BoxLayout.Y_AXIS));
        numberSystemBody.setBackground(panelBackgroundColor);
        numberSystemBody.setBorder(new EmptyBorder(0, 10, 30, 10));

        numberSystemInputTitle = new JLabel("Enter Number");
        numberSystemInputTitle.setFont(mainFont);
        numberSystemInputTitle.setPreferredSize(new Dimension(480, 40));
        numberSystemInputTitle.setMaximumSize(numberSystemInputTitle.getPreferredSize());
        numberSystemInputTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        numberSystemInputTitle.setForeground(textColor);

        numberSystemInput = new JTextField();
        numberSystemInput.setFont(mainFont);
        numberSystemInput.setForeground(textColor);
        numberSystemInput.setPreferredSize(new Dimension(480, 40));
        numberSystemInput.setMaximumSize(numberSystemInput.getPreferredSize());
        numberSystemInput.setBackground(panelBackgroundColor);

        numberSystemFromTitle = new JLabel("From Base");
        numberSystemFromTitle.setFont(mainFont);
        numberSystemFromTitle.setPreferredSize(new Dimension(480, 40));
        numberSystemFromTitle.setMaximumSize(numberSystemFromTitle.getPreferredSize());
        numberSystemFromTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        numberSystemFromTitle.setForeground(textColor);

        String[] numberSystemField = {"Binary", "Octal", "Decimal", "Hexadecimal"};

        numberSystemFrom = new JComboBox(numberSystemField);
        numberSystemFrom.setFont(mainFont);
        numberSystemFrom.setPreferredSize(new Dimension(480, 40));
        numberSystemFrom.setMaximumSize(numberSystemFrom.getPreferredSize());

        numberSystemToTitle = new JLabel("To Base");
        numberSystemToTitle.setFont(mainFont);
        numberSystemToTitle.setForeground(textColor);
        numberSystemToTitle.setPreferredSize(new Dimension(480, 40));
        numberSystemToTitle.setMaximumSize(numberSystemToTitle.getPreferredSize());
        numberSystemToTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        numberSystemTo = new JComboBox(numberSystemField);
        numberSystemTo.setFont(mainFont);
        numberSystemTo.setPreferredSize(new Dimension(480, 40));
        numberSystemTo.setMaximumSize(numberSystemTo.getPreferredSize());

        btnContainer = new JPanel(new FlowLayout());
        btnContainer.setBackground(panelBackgroundColor);

        numberSystemConvertBtn = new JButton("= Convert");

        numberSystemResetBtn = new JButton("x Reset");

        numberSystemSwapBtn = new JButton("<> Swap");

        btnContainer.add(numberSystemConvertBtn);
        btnContainer.add(numberSystemResetBtn);
        btnContainer.add(numberSystemSwapBtn);

        numberSystemResult = new JLabel("Result Number");
        numberSystemResult.setFont(mainFont);
        numberSystemResult.setPreferredSize(new Dimension(480, 40));
        numberSystemResult.setMaximumSize(numberSystemResult.getPreferredSize());
        numberSystemResult.setAlignmentX(Component.CENTER_ALIGNMENT);
        numberSystemResult.setForeground(textColor);

        numberSystemOutput = new JTextArea();
        numberSystemOutput.setBackground(displayColor);
        numberSystemOutput.setFont(mainFont);
        numberSystemOutput.setForeground(textColor);
        numberSystemOutput.setBorder(new EmptyBorder(10, 20, 10, 20));
        numberSystemOutput.setEditable(false);

        numberSystemBody.add(Box.createRigidArea(new Dimension(0, 20)));
        numberSystemBody.add(numberSystemInputTitle);
        numberSystemBody.add(numberSystemInput);
        numberSystemBody.add(Box.createRigidArea(new Dimension(0, 10)));
        numberSystemBody.add(numberSystemFromTitle);
        numberSystemBody.add(numberSystemFrom);
        numberSystemBody.add(Box.createRigidArea(new Dimension(0, 10)));
        numberSystemBody.add(numberSystemToTitle);
        numberSystemBody.add(numberSystemTo);
        numberSystemBody.add(Box.createRigidArea(new Dimension(0, 30)));
        numberSystemBody.add(btnContainer);
        numberSystemBody.add(Box.createRigidArea(new Dimension(0, 10)));
        numberSystemBody.add(numberSystemResult);
        numberSystemBody.add(numberSystemOutput);
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
