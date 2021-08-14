package Views.SetTheoryContainer;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SetTheoryLeftContainer extends JPanel {
    // Frequently used Color
    protected Color panelBackgroundColor = new Color(0, 21, 40);
    protected Color screenBackgroundColor = new Color(2, 32, 60);
    protected Color textColor = new Color(228, 228, 228);
    protected Color displayColor = new Color(67, 82, 109);

    // Font
    Font mainFont = new Font("Montserrat", Font.PLAIN, 14);

    // Layouts
    JPanel setTheoryContainer;
    JPanel setTheoryBtnContainer;

    // Components
    JLabel setTheoryTitle;
    JLabel firstInputTitle;
    JTextField firstInput;
    JLabel secondInputTitle;
    JTextField secondInput;
    JLabel chooseTheoryTitle;
    JComboBox chooseTheory;
    JButton runBtn;
    JButton resetBtn;

    public SetTheoryLeftContainer() {
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createMatteBorder(0, 12, 0, 12, panelBackgroundColor));
        this.setPreferredSize(new Dimension(416, 158));

        createLayout();
        createTitle();
        this.add(setTheoryTitle, BorderLayout.NORTH);
        this.add(setTheoryContainer, BorderLayout.CENTER);
    }

    public void createLayout() {
        setTheoryContainer = new JPanel();
        setTheoryContainer.setLayout(new BoxLayout(setTheoryContainer, BoxLayout.Y_AXIS));
        setTheoryContainer.setBackground(panelBackgroundColor);

        firstInputTitle = new JLabel("Enter first set");
        firstInputTitle.setFont(mainFont);
        firstInputTitle.setBackground(panelBackgroundColor);
        firstInputTitle.setForeground(textColor);
        firstInputTitle.setAlignmentX(Component.LEFT_ALIGNMENT);
        secondInputTitle = new JLabel("Enter Second Set");
        secondInputTitle.setFont(mainFont);
        secondInputTitle.setBackground(panelBackgroundColor);
        secondInputTitle.setForeground(textColor);

        firstInput = new JTextField("");
        firstInput.setFont(mainFont);
        firstInput.setBackground(displayColor);
        firstInput.setForeground(textColor);
        secondInput = new JTextField("");
        secondInput.setFont(mainFont);
        secondInput.setBackground(displayColor);
        secondInput.setForeground(textColor);

        chooseTheoryTitle = new JLabel("Choose Theory");
        chooseTheoryTitle.setFont(mainFont);
        chooseTheoryTitle.setBackground(panelBackgroundColor);
        chooseTheoryTitle.setForeground(textColor);

        String[] chooseTheoryField = {"union", "intersection", "difference"};

        chooseTheory = new JComboBox(chooseTheoryField);

        setTheoryBtnContainer = new JPanel();
        setTheoryBtnContainer.setLayout(new BoxLayout(setTheoryBtnContainer, BoxLayout.LINE_AXIS));
        setTheoryBtnContainer.setBackground(panelBackgroundColor);

        runBtn = new JButton("= RUN");
        resetBtn = new JButton("x Reset");

        setTheoryBtnContainer.add(runBtn);
        setTheoryBtnContainer.add(Box.createHorizontalGlue());
        setTheoryBtnContainer.add(resetBtn);

        setTheoryContainer.add(firstInputTitle);
        setTheoryContainer.add(firstInput);
        setTheoryContainer.add(secondInputTitle);
        setTheoryContainer.add(secondInput);
        setTheoryContainer.add(chooseTheoryTitle);
        setTheoryContainer.add(chooseTheory);
        setTheoryContainer.add(setTheoryBtnContainer);
    }

    public void createTitle() {
        setTheoryTitle = new JLabel();
        setTheoryTitle.setText("Set Theory");
        setTheoryTitle.setFont(new Font("Montserrat", Font.PLAIN, 14));
        setTheoryTitle.setBackground(panelBackgroundColor);
        setTheoryTitle.setForeground(textColor);
        setTheoryTitle.setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0), setTheoryTitle.getBorder()));
        setTheoryTitle.setOpaque(true);
    }
}
