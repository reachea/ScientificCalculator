package Views.BasicOperationContainer;

import javax.swing.*;
import java.awt.*;

// Class for basic operation bottom right view
public class BasicOperationBottomRightContainer extends JPanel {
    // Frequently used Color
    protected Color panelBackgroundColor = new Color(0, 21, 40);
    protected Color screenBackgroundColor = new Color(2, 32, 60);
    protected Color textColor = new Color(228, 228, 228);

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

    public BasicOperationBottomRightContainer() {
        createLayout();

        this.setLayout(new BorderLayout());
        this.add(basicOperationBottomRightContainer, BorderLayout.CENTER);
    }

    public void createLayout() {
        basicOperationBottomRightContainer = new JPanel(new GridLayout(2, 1));

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
        topHalfBody.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 0, panelBackgroundColor));
        topHalfBody.setBackground(panelBackgroundColor);

        topHalfFirstRow = new JPanel();
        topHalfFirstRow.setBackground(textColor);
        topHalfSecondRow = new JPanel();
        topHalfSecondRow.setBackground(textColor);
        topHalfBody.add(topHalfFirstRow);
        topHalfBody.add(topHalfSecondRow);

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
        bottomHalfBody.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 0, panelBackgroundColor));
        bottomHalfBody.setBackground(panelBackgroundColor);

        bottomHalfFirstRow = new JPanel();
        bottomHalfFirstRow.setBackground(textColor);
        bottomHalfSecondRow = new JPanel();
        topHalfSecondRow.setBackground(textColor);
        bottomHalfBody.add(bottomHalfFirstRow);
        bottomHalfBody.add(bottomHalfSecondRow);

        bottomHalfContainer.add(bottomHalfBody, BorderLayout.CENTER);

        // adding to container
        basicOperationBottomRightContainer.add(topHalfContainer);
        basicOperationBottomRightContainer.add(bottomHalfContainer);
    }
}
