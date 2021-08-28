package Controllers.NumberSystemHandlers;

import Controllers.NumberSystem.*;
import Views.NumberSystemContainer.NumberSystemLeftContainer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberSystemConverterHandler implements ActionListener {
    // Frequently used Color
    protected Color panelBackgroundColor = new Color(0, 21, 40);
    protected Color warningColor = new Color(255, 127, 127);

    private  NumberSystemLeftContainer numberSystemLeftContainer;
    private NumberSystem numberSystem;
    private Binary binary;
    private Octal octal;
    private Decimal decimal;
    private Hexadecimal hexadecimal;

    public NumberSystemConverterHandler(NumberSystemLeftContainer _numberSystemLeftContainer, NumberSystem _numberSystem, Binary _binary, Octal _octal, Decimal _decimal, Hexadecimal _hexadecimal) {
        numberSystemLeftContainer = _numberSystemLeftContainer;
        numberSystem = _numberSystem;
        binary = _binary;
        octal = _octal;
        decimal = _decimal;
        hexadecimal = _hexadecimal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = numberSystemLeftContainer.numberSystemInput.getText();

        String firstOption = numberSystemLeftContainer.numberSystemFrom.getSelectedItem().toString();
        String secondOption = numberSystemLeftContainer.numberSystemTo.getSelectedItem().toString();

        if (firstOption.equals("Binary")) {
            if (!numberSystem.isValidBinary(input)) {
                numberSystemLeftContainer.numberSystemInput.setBackground(warningColor);
                numberSystemLeftContainer.numberSystemOutput.setText("");
                return;
            }

            if (secondOption.equals("Binary")) {
                numberSystemLeftContainer.numberSystemOutput.setText(numberSystemLeftContainer.numberSystemInput.getText());
            } else if (secondOption.equals("Octal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(Long.toString(binary.binary2Octal(Long.parseLong(numberSystemLeftContainer.numberSystemInput.getText()))));
            } else if (secondOption.equals("Decimal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(Long.toString(binary.binary2Decimal(Long.parseLong(numberSystemLeftContainer.numberSystemInput.getText()))));
            } else if (secondOption.equals("Hexadecimal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(binary.binary2Hex(Long.parseLong(numberSystemLeftContainer.numberSystemInput.getText())));
            }

            numberSystemLeftContainer.numberSystemInput.setBackground(panelBackgroundColor);
        } else if (firstOption.equals("Octal")) {
            if (!numberSystem.isValidOctal(input)) {
                numberSystemLeftContainer.numberSystemInput.setBackground(warningColor);
                numberSystemLeftContainer.numberSystemOutput.setText("");
                return;
            }

            if (secondOption.equals("Binary")) {
                numberSystemLeftContainer.numberSystemOutput.setText(Long.toString(octal.octal2Binary(Long.parseLong(numberSystemLeftContainer.numberSystemInput.getText()))));
            } else if (secondOption.equals("Octal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(numberSystemLeftContainer.numberSystemInput.getText());
            } else if (secondOption.equals("Decimal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(Long.toString(octal.octal2Decimal(Long.parseLong(numberSystemLeftContainer.numberSystemInput.getText()))));
            } else if (secondOption.equals("Hexadecimal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(octal.octal2Hex(Long.parseLong(numberSystemLeftContainer.numberSystemInput.getText())));
            }

            numberSystemLeftContainer.numberSystemInput.setBackground(panelBackgroundColor);
        } else if (firstOption.equals("Decimal")) {
            if (!numberSystem.isValidDecimal(input)) {
                numberSystemLeftContainer.numberSystemInput.setBackground(warningColor);
                numberSystemLeftContainer.numberSystemOutput.setText("");
                return;
            }

            if (secondOption.equals("Binary")) {
                numberSystemLeftContainer.numberSystemOutput.setText(Long.toString(decimal.decimal2Binary(Long.parseLong(numberSystemLeftContainer.numberSystemInput.getText()))));
            } else if (secondOption.equals("Octal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(Long.toString(decimal.decimal2Octal(Long.parseLong(numberSystemLeftContainer.numberSystemInput.getText()))));
            } else if (secondOption.equals("Decimal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(numberSystemLeftContainer.numberSystemInput.getText());
            } else if (secondOption.equals("Hexadecimal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(decimal.decimal2Hex(Long.parseLong(numberSystemLeftContainer.numberSystemInput.getText())));
            }

            numberSystemLeftContainer.numberSystemInput.setBackground(panelBackgroundColor);
        } else if (firstOption.equals("Hexadecimal")) {
            if (!numberSystem.isValidHex(input)) {
                numberSystemLeftContainer.numberSystemInput.setBackground(warningColor);
                numberSystemLeftContainer.numberSystemOutput.setText("");
                return;
            }

            if (secondOption.equals("Binary")) {
                numberSystemLeftContainer.numberSystemOutput.setText(Long.toString(hexadecimal.hex2Binary(numberSystemLeftContainer.numberSystemInput.getText())));
            } else if (secondOption.equals("Octal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(Long.toString(hexadecimal.hex2Octal(numberSystemLeftContainer.numberSystemInput.getText())));
            } else if (secondOption.equals("Decimal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(Long.toString(hexadecimal.hex2Decimal(numberSystemLeftContainer.numberSystemInput.getText())));
            } else if (secondOption.equals("Hexadecimal")) {
                numberSystemLeftContainer.numberSystemOutput.setText(numberSystemLeftContainer.numberSystemInput.getText());
            }

            numberSystemLeftContainer.numberSystemInput.setBackground(panelBackgroundColor);
        }
    }
}
