package Controllers.BasicArithmeticHandlers;

import Controllers.BasicOperation.Arithmetic;
import Views.BasicOperationContainer.BasicOperationLeftContainer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EqualButtonHandler implements ActionListener {
    protected BasicOperationLeftContainer basicOperationLeftContainerView;
    protected Arithmetic arithmetic;

    public EqualButtonHandler(BasicOperationLeftContainer _basicOperationLeftContainerView, Arithmetic _arithmetic) {
        basicOperationLeftContainerView = _basicOperationLeftContainerView;
        arithmetic = _arithmetic;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String basicArithmeticOperation = basicOperationLeftContainerView.getBasicArithmeticOperation();
        String basicArithmeticResult = basicOperationLeftContainerView.getBasicArithmeticResult();
        String basicArithmeticResultHolder = basicOperationLeftContainerView.getBasicArithmeticResultHolder();

        if (basicArithmeticOperation.length() == 0) {
            basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResult + " =");
            basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
            return;
        }

        String operation = basicArithmeticOperation.substring(basicArithmeticOperation.length() - 1);
        String basicArithmeticOperationSubstring = basicArithmeticOperation.substring(0, basicArithmeticOperation.length() - 2);

        if (basicArithmeticOperation.substring(basicArithmeticOperation.length() - 4).equals(" ...")) {
            operation = basicArithmeticOperation.substring(basicArithmeticOperation.length() - 5, basicArithmeticOperation.length() - 4);
            basicArithmeticOperationSubstring = basicArithmeticOperation.substring(0, basicArithmeticOperation.length() - 6);
        }

        String basicArithmeticOperationOutput = basicArithmeticOperation.substring(0, basicArithmeticOperation.length() - 4) + " " + basicArithmeticResultHolder + " =";

        switch (operation) {
            case "+":
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticOperationOutput);
                basicArithmeticOperation = basicArithmeticOperationSubstring;
                double sumResult = arithmetic.sum(Double.parseDouble(basicArithmeticOperation), Double.parseDouble(basicArithmeticResultHolder));
                basicOperationLeftContainerView.setBasicArithmeticResult(Double.toString(sumResult));
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                break;
            case "-":
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticOperationOutput);
                basicArithmeticOperation = basicArithmeticOperationSubstring;
                double minusResult = arithmetic.minus(Double.parseDouble(basicArithmeticOperation), Double.parseDouble(basicArithmeticResultHolder));
                basicOperationLeftContainerView.setBasicArithmeticResult(Double.toString(minusResult));
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                break;
            case "*":
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticOperationOutput);
                basicArithmeticOperation = basicArithmeticOperationSubstring;
                double multiplyResult = arithmetic.multiply(Double.parseDouble(basicArithmeticOperation), Double.parseDouble(basicArithmeticResultHolder));
                basicOperationLeftContainerView.setBasicArithmeticResult(Double.toString(multiplyResult));
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                break;
            case "/":
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticOperationOutput);
                basicArithmeticOperation = basicArithmeticOperationSubstring;
                double divideResult = arithmetic.divide(Double.parseDouble(basicArithmeticOperation), Double.parseDouble(basicArithmeticResultHolder));
                basicOperationLeftContainerView.setBasicArithmeticResult(Double.toString(divideResult));
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                break;
            default:
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResult + " =");
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
        }
    }
}