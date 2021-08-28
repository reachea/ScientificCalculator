package Controllers.BasicArithmeticHandlers;

import Controllers.BasicOperation.MoneyExchange;
import Views.BasicOperationContainer.BasicOperationBottomRightContainer;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoneyExchangeInputHandler implements KeyListener {

    BasicOperationBottomRightContainer basicOperationBottomRightContainer;
    MoneyExchange moneyExchange;

    public MoneyExchangeInputHandler(BasicOperationBottomRightContainer _basicOperationBottomRightContainer, MoneyExchange _moneyExchange) {
        basicOperationBottomRightContainer = _basicOperationBottomRightContainer;
        moneyExchange = _moneyExchange;
    }

    @Override
    public void keyPressed(KeyEvent e) {
    };

    @Override
    public void keyReleased(KeyEvent e) {
        if (!Character.isDigit(e.getKeyChar()) && e.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            basicOperationBottomRightContainer.moneyExchangeInput.setText(basicOperationBottomRightContainer.moneyExchangeInput.getText().substring(0, basicOperationBottomRightContainer.moneyExchangeInput.getText().length() - 1));
            return;
        }

        String secondChoice = basicOperationBottomRightContainer.outputMoneyExchange.getSelectedItem().toString();

        if (secondChoice.equals("Baht")) {
            basicOperationBottomRightContainer.moneyExchangeOutput.setText(Double.toString(moneyExchange.rielToBaht(Double.parseDouble(basicOperationBottomRightContainer.moneyExchangeInput.getText()))));
        } else if (secondChoice.equals("Dollar")) {
            basicOperationBottomRightContainer.moneyExchangeOutput.setText(Double.toString(moneyExchange.rielToDollar(Double.parseDouble(basicOperationBottomRightContainer.moneyExchangeInput.getText()))));
        } else if (secondChoice.equals("Euro")) {
            basicOperationBottomRightContainer.moneyExchangeOutput.setText(Double.toString(moneyExchange.rielToEuro(Double.parseDouble(basicOperationBottomRightContainer.moneyExchangeInput.getText()))));
        } else if (secondChoice.equals("Franc")) {
            basicOperationBottomRightContainer.moneyExchangeOutput.setText(Double.toString(moneyExchange.rielToFranc(Double.parseDouble(basicOperationBottomRightContainer.moneyExchangeInput.getText()))));
        } else if (secondChoice.equals("Pound")) {
            basicOperationBottomRightContainer.moneyExchangeOutput.setText(Double.toString(moneyExchange.rielToPound(Double.parseDouble(basicOperationBottomRightContainer.moneyExchangeInput.getText()))));
        } else {
            basicOperationBottomRightContainer.moneyExchangeOutput.setText(basicOperationBottomRightContainer.moneyExchangeInput.getText());
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    };
}
