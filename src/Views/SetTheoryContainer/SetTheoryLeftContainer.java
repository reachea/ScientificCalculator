package Views.SetTheoryContainer;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

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
    public JTextField firstInput;
    JLabel secondInputTitle;
    public JTextField secondInput;
    JLabel chooseTheoryTitle;
    public JComboBox chooseTheory;
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
        setTheoryContainer.setBorder(new EmptyBorder(0, 10, 0, 10));

        firstInputTitle = new JLabel("Enter first set");
        firstInputTitle.setFont(mainFont);
        firstInputTitle.setBackground(panelBackgroundColor);
        firstInputTitle.setForeground(textColor);
        firstInputTitle.setPreferredSize(new Dimension(480, 40));
        firstInputTitle.setMaximumSize(firstInputTitle.getPreferredSize());
        firstInputTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        secondInputTitle = new JLabel("Enter Second Set");
        secondInputTitle.setFont(mainFont);
        secondInputTitle.setBackground(panelBackgroundColor);
        secondInputTitle.setForeground(textColor);
        secondInputTitle.setPreferredSize(new Dimension(480, 40));
        secondInputTitle.setMaximumSize(secondInputTitle.getPreferredSize());
        secondInputTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        firstInput = new JTextField("");
        firstInput.setFont(mainFont);
        firstInput.setBackground(displayColor);
        firstInput.setForeground(textColor);
        firstInput.setPreferredSize(new Dimension(480, 40));
        firstInput.setMaximumSize(firstInput.getPreferredSize());
        secondInput = new JTextField("");
        secondInput.setFont(mainFont);
        secondInput.setBackground(displayColor);
        secondInput.setForeground(textColor);
        secondInput.setPreferredSize(new Dimension(480, 40));
        secondInput.setMaximumSize(firstInput.getPreferredSize());

        chooseTheoryTitle = new JLabel("Choose Theory");
        chooseTheoryTitle.setFont(mainFont);
        chooseTheoryTitle.setBackground(panelBackgroundColor);
        chooseTheoryTitle.setForeground(textColor);
        chooseTheoryTitle.setPreferredSize(new Dimension(480, 40));
        chooseTheoryTitle.setMaximumSize(chooseTheoryTitle.getPreferredSize());
        chooseTheoryTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        String[] chooseTheoryField = {"union", "intersection", "difference"};

        chooseTheory = new JComboBox(chooseTheoryField);
        chooseTheory.setFont(mainFont);
        chooseTheory.setPreferredSize(new Dimension(480, 40));
        chooseTheory.setMaximumSize(chooseTheory.getPreferredSize());

        setTheoryBtnContainer = new JPanel();
        setTheoryBtnContainer.setLayout(new BoxLayout(setTheoryBtnContainer, BoxLayout.LINE_AXIS));
        setTheoryBtnContainer.setBackground(panelBackgroundColor);
        setTheoryBtnContainer.setPreferredSize(new Dimension(480, 40));
        setTheoryBtnContainer.setMaximumSize(chooseTheory.getPreferredSize());

        runBtn = new JButton("= RUN");
        resetBtn = new JButton("x Reset");

        setTheoryBtnContainer.add(runBtn);
        setTheoryBtnContainer.add(Box.createHorizontalGlue());
        setTheoryBtnContainer.add(resetBtn);

        setTheoryContainer.add(Box.createRigidArea(new Dimension(0, 30)));
        setTheoryContainer.add(firstInputTitle);
        setTheoryContainer.add(Box.createRigidArea(new Dimension(0, 10)));
        setTheoryContainer.add(firstInput);
        setTheoryContainer.add(Box.createRigidArea(new Dimension(0, 25)));
        setTheoryContainer.add(secondInputTitle);
        setTheoryContainer.add(Box.createRigidArea(new Dimension(0, 10)));
        setTheoryContainer.add(secondInput);
        setTheoryContainer.add(Box.createRigidArea(new Dimension(0, 25)));
        setTheoryContainer.add(chooseTheoryTitle);
        setTheoryContainer.add(Box.createRigidArea(new Dimension(0, 10)));
        setTheoryContainer.add(chooseTheory);
        setTheoryContainer.add(Box.createRigidArea(new Dimension(0, 25)));
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

    public void addSetRunHandler(ActionListener _setRunHandler) {
        runBtn.addActionListener(_setRunHandler);
    }
}
