package Controllers.BasicArithmeticHandlers;

import Controllers.BasicOperation.MoneyExchange;
import Views.BasicOperationContainer.BasicOperationBottomRightContainer;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MoneyExchangeOutputHandler implements KeyListener {

    BasicOperationBottomRightContainer basicOperationBottomRightContainer;
    MoneyExchange moneyExchange;

    public MoneyExchangeOutputHandler(BasicOperationBottomRightContainer _basicOperationBottomRightContainer, MoneyExchange _moneyExchange) {
        basicOperationBottomRightContainer = _basicOperationBottomRightContainer;
        moneyExchange = _moneyExchange;
    }

    @Override
    public void keyPressed(KeyEvent e) {
    };

    @Override
    public void keyReleased(KeyEvent e) {
        if (!Character.isDigit(e.getKeyChar()) && e.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            basicOperationBottomRightContainer.moneyExchangeOutput.setText(basicOperationBottomRightContainer.moneyExchangeInput.getText().substring(0, basicOperationBottomRightContainer.moneyExchangeOutput.getText().length() - 1));
            return;
        }

        String secondChoice = basicOperationBottomRightContainer.outputMoneyExchange.getSelectedItem().toString();

        if (secondChoice.equals("Baht")) {
            basicOperationBottomRightContainer.moneyExchangeInput.setText(Double.toString(moneyExchange.bahtToRiel(Double.parseDouble(basicOperationBottomRightContainer.moneyExchangeOutput.getText()))));
        } else if (secondChoice.equals("Dollar")) {
            basicOperationBottomRightContainer.moneyExchangeInput.setText(Double.toString(moneyExchange.dollarToRiel(Double.parseDouble(basicOperationBottomRightContainer.moneyExchangeOutput.getText()))));
        } else if (secondChoice.equals("Euro")) {
            basicOperationBottomRightContainer.moneyExchangeInput.setText(Double.toString(moneyExchange.euroToRiel(Double.parseDouble(basicOperationBottomRightContainer.moneyExchangeOutput.getText()))));
        } else if (secondChoice.equals("Franc")) {
            basicOperationBottomRightContainer.moneyExchangeInput.setText(Double.toString(moneyExchange.francToRiel(Double.parseDouble(basicOperationBottomRightContainer.moneyExchangeOutput.getText()))));
        } else if (secondChoice.equals("Pound")) {
            basicOperationBottomRightContainer.moneyExchangeInput.setText(Double.toString(moneyExchange.poundToRiel(Double.parseDouble(basicOperationBottomRightContainer.moneyExchangeOutput.getText()))));
        } else {
            basicOperationBottomRightContainer.moneyExchangeInput.setText(basicOperationBottomRightContainer.moneyExchangeOutput.getText());
        }
    };

    @Override
    public void keyTyped(KeyEvent e) {
    };
}