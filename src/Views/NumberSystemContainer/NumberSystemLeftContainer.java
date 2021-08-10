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

    // Components
    JLabel numberSystemTitle;

    public NumberSystemLeftContainer() {
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createMatteBorder(0, 12, 0, 12, panelBackgroundColor));

        createTitle();
        this.add(numberSystemTitle, BorderLayout.NORTH);
    }

    public void createTitle() {
        numberSystemTitle = new JLabel();
        numberSystemTitle.setText("Number System");
        numberSystemTitle.setFont(new Font("Montserrat", Font.PLAIN, 14));
        numberSystemTitle.setBackground(panelBackgroundColor);
        numberSystemTitle.setForeground(textColor);
        numberSystemTitle.setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0), numberSystemTitle.getBorder()));
        numberSystemTitle.setOpaque(true);
    }
}
