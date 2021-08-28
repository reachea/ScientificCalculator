package Controllers.BasicArithmeticHandlers;

import Controllers.BasicOperation.StorageConverter;
import Views.BasicOperationContainer.BasicOperationBottomRightContainer;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StorageConverterHandler implements KeyListener {
    protected BasicOperationBottomRightContainer basicOperationBottomRightContainer;
    protected StorageConverter storageConverter;

    public StorageConverterHandler(BasicOperationBottomRightContainer _basicOperationBottomRightContainer, StorageConverter _storageConverter) {
        basicOperationBottomRightContainer = _basicOperationBottomRightContainer;
        storageConverter = _storageConverter;
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (!Character.isDigit(e.getKeyChar()) && e.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            basicOperationBottomRightContainer.storageInput.setText(basicOperationBottomRightContainer.storageOutput.getText().substring(0, basicOperationBottomRightContainer.storageInput.getText().length() - 1));
            return;
        }

        String firstChoice = basicOperationBottomRightContainer.inputStorage.getSelectedItem().toString();
        String secondChoice = basicOperationBottomRightContainer.outputStorage.getSelectedItem().toString();

        if (firstChoice.equals("Byte")) {
            if (secondChoice.equals("Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(basicOperationBottomRightContainer.storageInput.getText());
            } else if (secondChoice.equals("Kilo Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.byte2KB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Mega Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.byte2MB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Giga Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.byte2GB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Tera Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.byte2TB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Peta Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.byte2PB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else {

            }
        } else if (firstChoice.equals("Kilo Byte")) {
            if (secondChoice.equals("Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.kb2Byte(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Kilo Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(basicOperationBottomRightContainer.storageInput.getText());
            } else if (secondChoice.equals("Mega Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.kb2MB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Giga Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.kb2GB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Tera Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.kb2TB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Peta Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.kb2PB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else {

            }
        } else if (firstChoice.equals("Mega Byte")) {
            if (secondChoice.equals("Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.mb2Byte(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Kilo Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.mb2KB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Mega Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(basicOperationBottomRightContainer.storageInput.getText());
            } else if (secondChoice.equals("Giga Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.mb2GB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Tera Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.mb2TB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Peta Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.mb2PB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else {

            }
        } else if (firstChoice.equals("Giga Byte")) {
            if (secondChoice.equals("Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.gb2Byte(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Kilo Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.gb2KB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Mega Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.gb2MB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Giga Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(basicOperationBottomRightContainer.storageInput.getText());
            } else if (secondChoice.equals("Tera Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.gb2TB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Peta Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.gb2PB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else {

            }
        } else if (firstChoice.equals("Tera Byte")) {
            if (secondChoice.equals("Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.tb2Byte(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Kilo Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.tb2KB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Mega Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.tb2MB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Giga Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.tb2GB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Tera Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(basicOperationBottomRightContainer.storageInput.getText());

            } else if (secondChoice.equals("Peta Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.tb2PB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else {

            }
        } else if (firstChoice.equals("Peta Byte")) {
            if (secondChoice.equals("Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.pb2Byte(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Kilo Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.pb2KB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Mega Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.pb2MB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Giga Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.pb2GB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Tera Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(Double.toString(storageConverter.pb2TB(Double.parseDouble(basicOperationBottomRightContainer.storageInput.getText()))));
            } else if (secondChoice.equals("Peta Byte")) {
                basicOperationBottomRightContainer.storageOutput.setText(basicOperationBottomRightContainer.storageInput.getText());
            } else {

            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
