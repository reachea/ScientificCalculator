package Controllers.BasicArithmeticButtons;

import Controllers.BasicOperation.Arithmetic;
import Views.BasicOperationLeftContainer;

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

        switch (operation) {
            case "+":
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticOperation.substring(0, basicArithmeticOperation.length() - 4) + " " + basicArithmeticResultHolder + " =");
                basicArithmeticOperation = basicArithmeticOperationSubstring;
                int sumResult = arithmetic.sum(Integer.parseInt(basicArithmeticOperation), Integer.parseInt(basicArithmeticResultHolder));
                basicOperationLeftContainerView.setBasicArithmeticResult(Integer.toString(sumResult));
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                break;
            case "-":
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticOperation.substring(0, basicArithmeticOperation.length() - 4) + " " + basicArithmeticResultHolder + " =");
                basicArithmeticOperation = basicArithmeticOperationSubstring;
                int minusResult = arithmetic.minus(Integer.parseInt(basicArithmeticOperation), Integer.parseInt(basicArithmeticResultHolder));
                basicOperationLeftContainerView.setBasicArithmeticResult(Integer.toString(minusResult));
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
                break;
            case "*":
                break;
            case "/":
                break;
            default:
                basicOperationLeftContainerView.setBasicArithmeticOperation(basicArithmeticResult + " =");
                basicOperationLeftContainerView.setBasicArithmeticResultHolder("0");
        }
    }
}