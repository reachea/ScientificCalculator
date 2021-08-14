package Views.SetTheoryContainer;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SetTheoryBottomRightContainer extends JPanel {
    // Frequently used Color
    protected Color panelBackgroundColor = new Color(0, 21, 40);
    protected Color screenBackgroundColor = new Color(2, 32, 60);
    protected Color textColor = new Color(228, 228, 228);
    protected Color displayColor = new Color(67, 82, 109);

    // Font
    Font mainFont = new Font("Montserrat", Font.PLAIN, 14);

    // Layouts
    JPanel setTheoryBottomRightContainer;
    JPanel topContainer;
    JTextField setTheoryOutput;
    JLabel topContainerTitle;

    public SetTheoryBottomRightContainer() {
        createLayout();
        this.setLayout(new BorderLayout());
        this.setBackground(panelBackgroundColor);

        this.add(setTheoryBottomRightContainer, BorderLayout.CENTER);
    }

    public void createLayout() {
        setTheoryBottomRightContainer = new JPanel(new BorderLayout());
        setTheoryBottomRightContainer.setBorder(BorderFactory.createMatteBorder(30, 20, 180, 20, panelBackgroundColor));

        topContainer = new JPanel();
        topContainer.setLayout(new BoxLayout(topContainer, BoxLayout.LINE_AXIS));
        topContainer.setBackground(displayColor);
        topContainer.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, displayColor));

        topContainerTitle = new JLabel("Output");
        topContainerTitle.setFont(mainFont);
        topContainerTitle.setBackground(displayColor);
        topContainerTitle.setForeground(textColor);

        topContainer.add(Box.createRigidArea(new Dimension(10, 0)));
        topContainer.add(topContainerTitle);

        setTheoryOutput = new JTextField("1");
        setTheoryOutput.setBackground(screenBackgroundColor);
        setTheoryOutput.setFont(mainFont);
        setTheoryOutput.setForeground(textColor);
        setTheoryOutput.setEditable(false);
        setTheoryOutput.setBorder(BorderFactory.createMatteBorder(10, 20, 20, 20, screenBackgroundColor));

        setTheoryBottomRightContainer.add(topContainer, BorderLayout.NORTH);
        setTheoryBottomRightContainer.add(setTheoryOutput, BorderLayout.CENTER);
    }
}
