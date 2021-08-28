package Controllers.NumberSystemHandlers;

import Controllers.NumberSystem.BinaryComplement;
import Controllers.NumberSystem.NumberSystem;
import Views.NumberSystemContainer.NumberSystemBottomRightContainer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryArithmeticComplementHandler implements ActionListener {
    // Frequently used Color
    protected Color displayColor = new Color(67, 82, 109);
    protected Color screenBackgroundColor = new Color(2, 32, 60);
    protected Color warningColor = new Color(255, 127, 127);

    NumberSystemBottomRightContainer numberSystemBottomRightContainer;
    NumberSystem numberSystem;
    BinaryComplement binaryComplement;

    public BinaryArithmeticComplementHandler (NumberSystemBottomRightContainer _numberSystemBottomRightContainer, NumberSystem _numberSystem, BinaryComplement _binaryComplement) {
        numberSystemBottomRightContainer = _numberSystemBottomRightContainer;
        numberSystem = _numberSystem;
        binaryComplement = _binaryComplement;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String firstInput = numberSystemBottomRightContainer.firstInput.getText();
        String secondInput = numberSystemBottomRightContainer.secondInput.getText();

        if (!numberSystem.isValidBinary(firstInput)) {
            numberSystemBottomRightContainer.firstInput.setBackground(warningColor);
            numberSystemBottomRightContainer.binaryOutput.setText("");
            return;
        }

        if (!numberSystem.isValidBinary(secondInput)) {
            numberSystemBottomRightContainer.secondInput.setBackground(warningColor);
            numberSystemBottomRightContainer.binaryOutput.setText("");
            return;
        }

        numberSystemBottomRightContainer.binaryOutput.setText("First: " + Long.toString(binaryComplement.findFirstComplement(Long.parseLong(firstInput))) + "          Second: " + Long.toString(binaryComplement.findFirstComplement(Long.parseLong(secondInput))));

        numberSystemBottomRightContainer.firstInput.setBackground(screenBackgroundColor);
        numberSystemBottomRightContainer.secondInput.setBackground(screenBackgroundColor);
    }
}