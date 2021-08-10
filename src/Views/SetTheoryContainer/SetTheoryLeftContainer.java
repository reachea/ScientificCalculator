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

    // Components
    JLabel setTheoryTitle;

    public SetTheoryLeftContainer() {
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createMatteBorder(0, 12, 0, 12, panelBackgroundColor));

        createTitle();
        this.add(setTheoryTitle, BorderLayout.NORTH);
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
