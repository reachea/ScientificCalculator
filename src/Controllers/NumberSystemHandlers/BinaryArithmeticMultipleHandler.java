package Controllers.NumberSystemHandlers;

import Controllers.NumberSystem.BinaryArithmetic;
import Controllers.NumberSystem.NumberSystem;
import Views.NumberSystemContainer.NumberSystemBottomRightContainer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryArithmeticMultipleHandler implements ActionListener {
    // Frequently used Color
    protected Color displayColor = new Color(67, 82, 109);
    protected Color screenBackgroundColor = new Color(2, 32, 60);
    protected Color warningColor = new Color(255, 127, 127);

    NumberSystemBottomRightContainer numberSystemBottomRightContainer;
    NumberSystem numberSystem;
    BinaryArithmetic binaryArithmetic;

    public BinaryArithmeticMultipleHandler (NumberSystemBottomRightContainer _numberSystemBottomRightContainer, NumberSystem _numberSystem, BinaryArithmetic _binaryArithmetic) {
        numberSystemBottomRightContainer = _numberSystemBottomRightContainer;
        numberSystem = _numberSystem;
        binaryArithmetic = _binaryArithmetic;
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

        numberSystemBottomRightContainer.binaryOutput.setText(Long.toString(binaryArithmetic.binaryMultiple(Long.parseLong(firstInput), Long.parseLong(secondInput))));

        numberSystemBottomRightContainer.firstInput.setBackground(screenBackgroundColor);
        numberSystemBottomRightContainer.secondInput.setBackground(screenBackgroundColor);
    }
}